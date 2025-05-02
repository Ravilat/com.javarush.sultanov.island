package entity.animal.herbivores;

import entity.map.Location;
import entity.animal.Animal;
import util.CreatureEnum;

public abstract class Herbivore extends Animal {

    public Herbivore(Location location, CreatureEnum animalsEnum) {
        super(location, animalsEnum);
    }

}
