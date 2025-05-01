package util;

import model.entity.Location;
import model.entity.animal.herbivores.*;
import model.entity.animal.predators.*;

public class PrintInfo {

    Location location;

    public PrintInfo(Location location) {
        this.location = location;
    }

    public void print() {
        System.out.println("\uD83D\uDC03 (Buffalo) = " + location.getQuantityParticularTypeAnimal(AnimalsEnum.WOLF));
        System.out.println("\uD83D\uDC3B (Bear) = " + location.getQuantityParticularTypeAnimal(AnimalsEnum.BEAR));
        System.out.println("\uD83D\uDC0E (Horse) = " + location.getQuantityParticularTypeAnimal(AnimalsEnum.HORSE));
        System.out.println("\uD83E\uDD8C (Deer) = " + location.getQuantityParticularTypeAnimal(AnimalsEnum.DEER));
        System.out.println("\uD83D\uDC17 (Boar) = " + location.getQuantityParticularTypeAnimal(AnimalsEnum.BOAR));
        System.out.println("\uD83D\uDC11 (Sheep) = " + location.getQuantityParticularTypeAnimal(AnimalsEnum.SHEEP));
        System.out.println("\uD83D\uDC10 (Goat) = " + location.getQuantityParticularTypeAnimal(AnimalsEnum.GOAT));
        System.out.println("\uD83D\uDC3A (Wolf) = " + location.getQuantityParticularTypeAnimal(AnimalsEnum.WOLF));
        System.out.println("\uD83D\uDC0D (Boa) = " + location.getQuantityParticularTypeAnimal(AnimalsEnum.BOA));
        System.out.println("\uD83E\uDD8A (Fox) = " + location.getQuantityParticularTypeAnimal(AnimalsEnum.FOX));
        System.out.println("\uD83E\uDD85 (Eagle) = " + location.getQuantityParticularTypeAnimal(AnimalsEnum.EAGLE));
        System.out.println("\uD83D\uDC07 (Rabbit) = " + location.getQuantityParticularTypeAnimal(AnimalsEnum.RABBIT));
        System.out.println("\uD83E\uDD86 (Duck) = " + location.getQuantityParticularTypeAnimal(AnimalsEnum.DUCK));
        System.out.println("\uD83D\uDC01 (Mouse) = " + location.getQuantityParticularTypeAnimal(AnimalsEnum.MOUSE));
        System.out.println("\uD83D\uDC1B (Caterpillar) = " + location.getQuantityParticularTypeAnimal(AnimalsEnum.CATERPILLAR));
        System.out.println("_".repeat(30));
    }
}
