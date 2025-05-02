package fabrics;

import entity.Creature;
import entity.Plant;
import entity.map.Location;
import entity.animal.herbivores.*;
import entity.animal.predators.*;
import util.CreatureEnum;

public class FactoryCreature {


    Location location;

    public FactoryCreature(Location location) {
        this.location = location;
    }

    public Creature createCreature(CreatureEnum creatureEnum) {
        return switch (creatureEnum) {
            case WOLF -> new Wolf(location, creatureEnum);
            case BOA -> new Boa(location, creatureEnum);
            case FOX -> new Fox(location, creatureEnum);
            case BEAR -> new Bear(location, creatureEnum);
            case EAGLE -> new Eagle(location, creatureEnum);
            case HORSE -> new Horse(location, creatureEnum);
            case DEER -> new Deer(location, creatureEnum);
            case RABBIT -> new Rabbit(location, creatureEnum);
            case MOUSE -> new Mouse(location, creatureEnum);
            case GOAT -> new Goat(location, creatureEnum);
            case SHEEP -> new Sheep(location, creatureEnum);
            case BOAR -> new Boar(location, creatureEnum);
            case BUFFALO -> new Buffalo(location, creatureEnum);
            case DUCK -> new Duck(location, creatureEnum);
            case CATERPILLAR -> new Caterpillar(location, creatureEnum);
            case PLANT -> new Plant(location, creatureEnum);
        };
    }
}



