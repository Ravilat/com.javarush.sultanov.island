package model.entity.animal.predators;

import model.entity.Creature;
import model.entity.Location;
import model.entity.Plant;
import model.entity.animal.herbivores.*;
import util.AnimalsEnum;

import java.util.concurrent.ThreadLocalRandom;

public class Fox extends Predator {

    public Fox(Location location, AnimalsEnum animalsEnum) {
        super(location, animalsEnum);
    }
}
