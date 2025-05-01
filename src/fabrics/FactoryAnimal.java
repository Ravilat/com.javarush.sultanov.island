package fabrics;

import model.entity.Location;
import model.entity.animal.Animal;
import model.entity.animal.herbivores.*;
import model.entity.animal.predators.*;
import util.AnimalsEnum;

public class FactoryAnimal {


    Location location;

    public FactoryAnimal(Location location) {
        this.location = location;
    }

    public Animal createAnimal(AnimalsEnum animalsEnum) {
        return switch (animalsEnum) {
            case WOLF -> new Wolf(location, animalsEnum);
            case BOA -> new Boa(location, animalsEnum);
            case FOX -> new Fox(location, animalsEnum);
            case BEAR -> new Bear(location, animalsEnum);
            case EAGLE -> new Eagle(location, animalsEnum);
            case HORSE -> new Horse(location, animalsEnum);
            case DEER -> new Deer(location, animalsEnum);
            case RABBIT -> new Rabbit(location, animalsEnum);
            case MOUSE -> new Mouse(location, animalsEnum);
            case GOAT -> new Goat(location, animalsEnum);
            case SHEEP -> new Sheep(location, animalsEnum);
            case BOAR -> new Boar(location, animalsEnum);
            case BUFFALO -> new Buffalo(location, animalsEnum);
            case DUCK -> new Duck(location, animalsEnum);
            case CATERPILLAR -> new Caterpillar(location, animalsEnum);
        };
    }
}



