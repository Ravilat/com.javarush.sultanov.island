package entity.map;

import config.Settings;
import entity.Creature;
import entity.Plant;
import entity.animal.Animal;
import fabrics.*;
import util.CreatureEnum;

import java.util.*;
import java.util.concurrent.locks.ReentrantLock;


public class Location {

    Map<CreatureEnum, Set<Creature>> creatureMap;
    FactoryCreature factoryCreature;
    ReentrantLock lock = new ReentrantLock();
    int x;
    int y;
    Island island;

    public Map<CreatureEnum, Set<Creature>> createStartAnimals(Location location) {

        Map<CreatureEnum, Set<Creature>> map = new HashMap<>();
        this.factoryCreature = new FactoryCreature(location);
        CreatureEnum[] creatureEnums = CreatureEnum.values();
        for (CreatureEnum creatureEnum : creatureEnums) {
            int quantity = Settings.quantityByCreation.get(creatureEnum);
            Set<Creature> set = new HashSet<>();
            for (int j = 0; j < quantity; j++) {
                set.add(factoryCreature.createCreature(creatureEnum));
            }
            map.put(creatureEnum, set);
        }
        return map;
    }

    public int getQuantityParticularTypeAnimal(CreatureEnum a) {
        return creatureMap.get(a).size();
    }

    public Set<Creature> getSetByAnimalType(CreatureEnum a) {
        return creatureMap.get(a);
    }

    public void growPlants() {
        int currentNumberPlants = creatureMap.get(CreatureEnum.PLANT).size();
        int missingQuantity = Settings.maxPlantsNumbers - currentNumberPlants;
        for (int i = 0; i < missingQuantity; i++) {
            creatureMap.get(CreatureEnum.PLANT).add(new Plant(this, CreatureEnum.PLANT));
        }
    }

    public FactoryCreature getFactoryAnimal() {
        return factoryCreature;
    }

    public Location(int x, int y, Island island) {
        this.island = island;
        this.x = x;
        this.y = y;
        creatureMap = createStartAnimals(this);
    }

    public void searchForEat(Animal animal) {
        for (Set<Creature> set : creatureMap.values()) {
            for (Creature creature : set) {
                if (animal.eat(creature)) {
                    return;
                }
            }
        }
    }

    public ReentrantLock getLock() {
        return lock;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Island getIsland() {
        return island;
    }

    public Map<CreatureEnum, Set<Creature>> getCreatureMap() {
        return creatureMap;
    }
}
