package services;

import config.Settings;
import entity.Creature;
import entity.Plant;
import entity.animal.Animal;
import entity.map.Location;
import util.CreatureEnum;

public class Task {

    private final Creature creature;


    public Task(Creature creature) {
        this.creature = creature;

    }

    public void doTask() {

        if (creature instanceof Animal animal) {
            Location location = creature.getLocation();
            location.searchForEat(animal);
            animal.reproduce();
            animal.safeMove(Settings.movingSpeed.get(creature.getCreatureEnum()));
            if (animal.getCreatureEnum() != CreatureEnum.CATERPILLAR) {
                animal.setCurrentWeight(creature.getCurrentWeight() - Settings.maxWeightAnimal.get(creature.getCreatureEnum()) * 0.05);
            }
            animal.dieFromStarvation();
        }
        if (creature instanceof Plant) {
            creature.getLocation().growPlants();
        }
    }

}
