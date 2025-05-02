package entity.animal.predators;

import entity.map.Location;
import entity.animal.Animal;
import util.CreatureEnum;

public abstract class Predator extends Animal {

    public Predator(Location location, CreatureEnum animalsEnum) {
        super(location, animalsEnum);
    }
}
