package model.entity;

import util.AnimalsEnum;

public abstract class Creature {

    protected Location location;
    protected double currentWeight;
    protected boolean died = false;

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

    public boolean isDied() {
        return died;
    }

    public void setDied(boolean died) {
        this.died = died;
    }

    public Creature(Location location) {
        this.location = location;
    }
}

