package model.entity.animal.herbivores;

import model.entity.Creature;
import model.entity.Location;
import model.entity.Plant;
import util.AnimalsEnum;

import java.util.concurrent.ThreadLocalRandom;

public class Boar extends Herbivore {

    public Boar(Location location, AnimalsEnum animalsEnum) {
        super(location, animalsEnum);
    }

}
