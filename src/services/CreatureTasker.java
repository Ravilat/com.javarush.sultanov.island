package services;

import entity.Creature;
import entity.animal.Animal;
import entity.map.Island;
import entity.map.Location;
import util.CreatureEnum;
import java.util.Collection;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Function;
import java.util.stream.Stream;

public class CreatureTasker implements Runnable {

    CreatureEnum animalsEnum;
    Island island;
    private final Queue<Task> tasks = new ConcurrentLinkedQueue<>();

    public CreatureTasker(CreatureEnum animalsEnum, Island island) {
        this.animalsEnum = animalsEnum;
        this.island = island;
    }

    @Override
    public void run() {

        for (int i = 0; i < island.getRowsCount(); i++) {
            for (int j = 0; j < island.getColumnsCount(); j++) {
                Location location = island.getLocations()[i][j];
                processOneLocation(location);
            }
        }
        resetIsMultiplied();


    }

    void processOneLocation(Location location) {
        Set<Creature> set = location.getSetByAnimalType(animalsEnum);
        if (Objects.nonNull(set)) {
            location.getLock().lock();
            try {
                set.forEach(creature -> tasks.add(new Task(creature)));
            } finally {
                location.getLock().unlock();
            }
            tasks.forEach(Task::doTask);
            tasks.clear();
        }
    }
    void resetIsMultiplied() {
        for (Location[] locations : island.getLocations()) {
            for (Location location : locations) {
                location.getCreatureMap()
                        .values()
                        .stream()
                        .flatMap((Function<Set<Creature>, Stream<Creature>>) Collection::stream)
                        .map(x -> (Animal) x)
                        .forEach(x -> x.setMultiplied(false));
            }
        }
    }

}
