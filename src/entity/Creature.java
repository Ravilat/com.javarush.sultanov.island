package entity;

import entity.map.Location;
import util.CreatureEnum;

public abstract class Creature {

    protected Location location;
    protected double currentWeight;
    protected CreatureEnum creatureEnum;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public double getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(double currentWeight) {
        this.currentWeight = currentWeight;
    }

    public Creature(Location location) {
        this.location = location;
    }

    public double safeRemove() {
        try {
            location.getLock().lock();
            location.getCreatureMap().get(this.getCreatureEnum()).remove(this);
            return this.currentWeight;
        } finally {
            location.getLock().unlock();
        }
    }

    public CreatureEnum getCreatureEnum() {
        return creatureEnum;
    }

}

