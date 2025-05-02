package entity.animal;

import entity.animal.herbivores.Herbivore;
import fabrics.FactoryCreature;
import entity.Creature;
import entity.map.Location;
import entity.Plant;
import config.Settings;
import util.CreatureEnum;
import util.Direction;
import util.Rnd;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Animal extends Creature {

    protected boolean multiplied = false;

    public Animal(Location location, CreatureEnum creatureEnum) {
        super(location);
        this.creatureEnum = creatureEnum;
        this.currentWeight = Settings.maxWeightAnimal.get(creatureEnum);
    }

    //съедаем или нет входящее создание
    protected boolean isEaten(Creature creature) {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        int randomNumber = random.nextInt(1, 101);

        if (creature instanceof Plant) {
            return this instanceof Herbivore;
        }
        Animal victim = (Animal) creature;
        int chance = Settings.probabilityAnimalToEat.get(this.getCreatureEnum()).get(victim.getCreatureEnum());
        return randomNumber <= chance;
    }

    public void safeCreate(CreatureEnum animalsEnum, Location location) {
        try {
            location.getLock().lock();
            FactoryCreature factoryCreature = location.getFactoryAnimal();
            Creature animal = factoryCreature.createCreature(animalsEnum);
            location.getCreatureMap().get(animalsEnum).add(animal);
        } finally {
            location.getLock().unlock();
        }
    }

    public void safeAdd(Location destination) {
        try {
            destination.getLock().lock();
            destination.getCreatureMap().get(creatureEnum).add(this);
            setLocation(destination);
        } finally {
            destination.getLock().unlock();
        }
    }

    public void safeMove(int distance) {
        Direction direction = Direction.values()[Rnd.random(7)];
        Location source = getLocation();
        Location destination = source.getIsland().searchLocationToMove(source, direction, distance);
        safeAdd(destination);
        safeRemoveWhenMove(source);
    }

    private void safeRemoveWhenMove(Location source) {
        try {
            source.getLock().lock();
            source.getCreatureMap().get(this.getCreatureEnum()).remove(this);
        } finally {
            source.getLock().unlock();
        }
    }

    public boolean eat(Creature victim) {
        if (isEaten(victim)) {
            if (victim != null) {
                double victimWeight = victim.safeRemove();
                if (victimWeight <= Settings.maxEatenWeight.get(creatureEnum)) {
                    currentWeight += victim.getCurrentWeight();
                } else {
                    currentWeight += Settings.maxEatenWeight.get(creatureEnum);
                }
                if (currentWeight > Settings.maxWeightAnimal.get(creatureEnum)) {
                    currentWeight = Settings.maxWeightAnimal.get(creatureEnum);
                }
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public void dieFromStarvation() {
        if (getCurrentWeight() < Settings.maxWeightAnimal.get(creatureEnum) * 0.7) {
            safeRemove();
        }
    }


    public void reproduce() {
        if (location.getQuantityParticularTypeAnimal(creatureEnum) >= Settings.maxQuantityAnimalInLocation.get(creatureEnum))
            return;
        if (this.isMultiplied() || !Rnd.probabilityEvent(50)) return;

        Set<Creature> setParents = location.getCreatureMap().get(creatureEnum);
        int childs = 0;
        for (Creature creature : setParents) {
            if (creature instanceof Animal animal) {
                if (!this.equals(animal) && !animal.isMultiplied()) {

                    for (int i = 0; i < Settings.quantityChildren.get(creatureEnum); i++) {
                        if (location.getQuantityParticularTypeAnimal(creatureEnum) >= Settings.maxQuantityAnimalInLocation.get(creatureEnum)) {
                            return;
                        }
                        childs++;
                        this.setMultiplied(true);
                        animal.setMultiplied(true);
                    }
                    for (int i = 0; i < childs; i++) {
                        safeCreate(creatureEnum, location);
                    }
                    return;
                }
            }

        }
    }


    public void setMultiplied(boolean multiplied) {
        this.multiplied = multiplied;
    }

    public boolean isMultiplied() {
        return multiplied;
    }

}
