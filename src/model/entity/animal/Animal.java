package model.entity.animal;

import model.entity.Creature;
import model.entity.Location;
import model.entity.Plant;
import model.entity.Settings;
import model.entity.animal.herbivores.*;
import util.AnimalsEnum;
import util.Direction;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Animal extends Creature {

    protected AnimalsEnum animalsEnum;
    protected boolean multiplied = false;

    public Animal(Location location, AnimalsEnum animalsEnum) {
        super(location);
        this.animalsEnum = animalsEnum;
        this.currentWeight=Settings.maxWeightAnimal.get(animalsEnum);
    }

    //съедаем или нет входящее создание
    protected boolean isEaten(Creature creature) {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        int randomNumber = random.nextInt(1, 101);

        if (creature instanceof Plant) {
            return this instanceof Herbivore;
        }
        Animal victim = (Animal) creature;
        int chance = Settings.probabilityAnimalToEat.get(this.getAnimalsEnum()).get(victim.getAnimalsEnum());
        return randomNumber <= chance;
    }


    public AnimalsEnum getAnimalsEnum() {
        return animalsEnum;
    }

    public void setAnimalsEnum(AnimalsEnum animalsEnum) {
        this.animalsEnum = animalsEnum;
    }

    public boolean eat(Creature victim) {
        if (isEaten(victim)) {
            if (!victim.isDied()) {
                double victimWeight = victim.getCurrentWeight();
                if (victimWeight <= Settings.maxEatenWeight.get(animalsEnum)) {
                    currentWeight += victim.getCurrentWeight();
                } else {
                    currentWeight += Settings.maxEatenWeight.get(animalsEnum);
                }
                if (currentWeight > Settings.maxWeightAnimal.get(animalsEnum)) {
                    currentWeight = Settings.maxWeightAnimal.get(animalsEnum);
                }
                victim.setDied(true);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean dieFromStarvation() {
        if (getCurrentWeight() < Settings.maxWeightAnimal.get(animalsEnum) * 0.7) {
            died = true;
            return true;
        }
        return false;
    }

    public Direction chooseDirection() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        return Direction.values()[random.nextInt(Direction.values().length)];
    }

    public void move() {
        //  Direction direction = chooseDirection();
    }

    public void reproduce(Map<AnimalsEnum, List<Animal>> map) {
        if (location.getQuantityParticularTypeAnimal(animalsEnum) >= Settings.maxQuantityAnimalInLocation.get(animalsEnum))
            return;
        if (this.isMultiplied() || this.isDied()) return;
        List<Animal> animalList = map.get(animalsEnum);
        if (animalList.size() < 2) return;
        ListIterator<Animal> iterator = animalList.listIterator();
        while (iterator.hasNext()) {
            Animal pair = iterator.next();
            if (!this.equals(pair) && !pair.isMultiplied() && !pair.isDied()) {
                for (int i = 0; i < Settings.quantityChildren.get(animalsEnum); i++) {
                    if (location.getQuantityParticularTypeAnimal(animalsEnum) >= Settings.maxQuantityAnimalInLocation.get(animalsEnum)) {
                        return;
                    }
                    Animal animal = location.getFactoryAnimal().createAnimal(animalsEnum);
                    iterator.add(animal);
                    this.setMultiplied(true);
                    pair.setMultiplied(true);
                }
                return;
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
