package model.entity;

import model.entity.animal.Animal;
import model.entity.animal.herbivores.*;
import model.entity.animal.predators.*;
import fabrics.*;
import util.AnimalsEnum;
import util.PrintInfo;

import java.util.*;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class Location implements Runnable {

    Map<AnimalsEnum, List<Animal>> animalMap;
    List<Animal> allAnimals;
    List<Plant> plants = new ArrayList<>();
    List<Creature> allAnimalsAndPlants;
    FactoryAnimal factoryAnimal;
    ReentrantLock lock = new ReentrantLock();

    public Map<AnimalsEnum, List<Animal>> createStartAnimals(Location location) {

        Map<AnimalsEnum, List<Animal>> map = new HashMap<>();
        this.factoryAnimal = new FactoryAnimal(location);
        AnimalsEnum[] animalsEnum = AnimalsEnum.values();
        for (AnimalsEnum animalEnum : animalsEnum) {
            int quantity = Settings.quantityByCreation.get(animalEnum);
            List<Animal> list = new ArrayList<>();
            for (int j = 0; j < quantity; j++) {
                list.add(factoryAnimal.createAnimal(animalEnum));
            }
            map.put(animalEnum, list);
        }
        return map;
    }

    public int getQuantityParticularTypeAnimal(AnimalsEnum a) {
        return animalMap.get(a).size();
    }

    public List<Animal> getListByAnimalType(AnimalsEnum a) {
        return animalMap.get(a);
    }

    public void growPlants() {
        int currentNumberPlants = plants.size();
        int missingQuantity = Settings.maxPlansNumbers - currentNumberPlants;
        for (int i = 0; i < missingQuantity; i++) {
            plants.add(new Plant(this));
        }
    }

    public List<Animal> getListAllAnimalsInLocation(Map<AnimalsEnum, List<Animal>> map) {
        List<Animal> result = new ArrayList<>();
        for (AnimalsEnum key : map.keySet()) {
            result.addAll(map.get(key));
        }
        return result;
    }

    public List<Creature> getListAllAnimalsAndPlants(List<Animal> listAnimal, List<Plant> listPlants) {
        List<Creature> result = new ArrayList<>();
        result.addAll(listAnimal);
        result.addAll(listPlants);
        return result;
    }


    public FactoryAnimal getFactoryAnimal() {
        return factoryAnimal;
    }

    public void setFactoryAnimal(FactoryAnimal factoryAnimal) {
        this.factoryAnimal = factoryAnimal;
    }

    public Location() {
        animalMap = createStartAnimals(this);
        allAnimals = getListAllAnimalsInLocation(animalMap);
        growPlants();
        allAnimalsAndPlants = getListAllAnimalsAndPlants(allAnimals, plants);
        Collections.shuffle(allAnimals);
        Collections.shuffle(allAnimalsAndPlants);
    }

    private boolean checkAliveAnimal(Map<AnimalsEnum, List<Animal>> map) {

        for (List<Animal> list : map.values()) {
            if (!list.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private void searchForEat(Animal animal, List<Creature> lunch) {
        for (Creature creature : lunch) {
            if (animal.eat(creature)) {
                return;
            }
        }
    }

    @Override
    public void run() {

        new PrintInfo(this).print();

        while (checkAliveAnimal(animalMap)) {

            for (Animal animal : allAnimals) {
                if (animal.isDied()) continue;
                if (animal.dieFromStarvation()) continue;
                searchForEat(animal, allAnimalsAndPlants);
                animal.reproduce(animalMap);
                animal.move();
            }

            animalMap.keySet().stream().filter(animalsEnum -> animalsEnum != AnimalsEnum.CATERPILLAR)
                    .forEach(animalsEnum -> animalMap.get(animalsEnum)
                            .forEach(animal -> animal.setCurrentWeight(animal.getCurrentWeight() - Settings.maxWeightAnimal.get(animal.getAnimalsEnum()) * 0.05)));

            animalMap.values().forEach(list -> list.removeIf(Creature::isDied));
            animalMap.values().forEach(list -> list.forEach(animal -> animal.setMultiplied(false)));

            allAnimals.clear();
            allAnimalsAndPlants.clear();
            allAnimals = getListAllAnimalsInLocation(animalMap);
            growPlants();
            allAnimalsAndPlants = getListAllAnimalsAndPlants(allAnimals, plants);
            Collections.shuffle(allAnimals);
            Collections.shuffle(allAnimalsAndPlants);
            new PrintInfo(this).print();
        }
    }

    private void removeAnimal(List<Animal> list) {
        list.removeIf(Creature::isDied);
    }

}
