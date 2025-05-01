package model.entity.animal.herbivores;

import model.entity.Creature;
import model.entity.Location;
import model.entity.Plant;
import model.entity.animal.Animal;
import util.AnimalsEnum;

import java.util.ListIterator;

public abstract class Herbivore extends Animal {

    public Herbivore(Location location, AnimalsEnum animalsEnum) {
        super(location, animalsEnum);
    }

}
