package model.entity.animal.predators;

import model.entity.Location;
import model.entity.animal.Animal;
import util.AnimalsEnum;

public abstract class Predator extends Animal {

    public Predator(Location location, AnimalsEnum animalsEnum) {
        super(location, animalsEnum);
    }
}
