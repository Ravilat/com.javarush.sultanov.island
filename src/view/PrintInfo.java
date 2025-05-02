package view;

import entity.map.Island;
import util.CreatureEnum;
import java.util.Arrays;

public class PrintInfo {

    Island island;

    public PrintInfo(Island island) {
        this.island = island;
    }


    public void print() {

//        for (Location[] location: island.getLocations()) {
//            for (Location location1 : location) {
//                for (CreatureEnum creatureEnum : CreatureEnum.values()) {
//                    System.out.print(stringPicture(creatureEnum) + "-"+location1.getQuantityParticularTypeAnimal(creatureEnum)+"||");
//                }
//                System.out.println();
//            }
//        }
//        System.out.println();

        for (CreatureEnum creatureEnum : CreatureEnum.values()) {
            long count = Arrays.stream(island.getLocations())
                    .flatMap(Arrays::stream)
                    .mapToInt(x -> x.getQuantityParticularTypeAnimal(creatureEnum))
                            .sum();

            System.out.print(stringPicture(creatureEnum) + "=" + count+"||");
        }
        System.out.println();
        System.out.println("_".repeat(30));
    }

    String stringPicture(CreatureEnum creatureEnum) {

        switch (creatureEnum) {
            case BOA -> {
                return "\uD83D\uDC0D (Boa)";
            }
            case BEAR -> {
                return "\uD83D\uDC3B (Bear)";
            }
            case BUFFALO -> {
                return "\uD83D\uDC03 (Buffalo)";
            }
            case BOAR -> {
                return "\uD83D\uDC17 (Boar)";
            }
            case FOX -> {
                return "\uD83E\uDD8A (Fox)";
            }
            case WOLF -> {
                return "\uD83D\uDC3A (Wolf)";
            }
            case EAGLE -> {
                return "\uD83E\uDD85 (Eagle)";
            }
            case HORSE -> {
                return "\uD83D\uDC0E (Horse)";
            }
            case DEER -> {
                return "\uD83E\uDD8C (Deer)";
            }
            case MOUSE -> {
                return "\uD83D\uDC01 (Mouse)";
            }
            case SHEEP -> {
                return "\uD83D\uDC11 (Sheep)";
            }
            case GOAT -> {
                return "\uD83D\uDC10 (Goat)";
            }
            case CATERPILLAR -> {
                return "\uD83D\uDC1B (Caterpillar)";
            }
            case DUCK -> {
                return "\uD83E\uDD86 (Duck)";
            }
            case RABBIT -> {
                return "\uD83D\uDC07 (Rabbit)";
            }
        }
        return "PLANT";
    }
}
