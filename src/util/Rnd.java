package util;

import java.util.concurrent.ThreadLocalRandom;

public class Rnd {

    public static boolean probabilityEvent(int chance) {
        return ThreadLocalRandom.current().nextInt(101) <= chance;
    }

    public static int random(int max) {
        return ThreadLocalRandom.current().nextInt(max + 1);
    }

}
