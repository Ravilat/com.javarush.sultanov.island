package entity;

import entity.map.Location;
import util.CreatureEnum;

public class Plant extends Creature {

    public Plant(Location location, CreatureEnum creatureEnum) {
        super(location);
        this.creatureEnum = creatureEnum;
        this.currentWeight = 1.0;
    }

}
