package config;

import util.CreatureEnum;

import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

public class Settings {

    // размеры острова

    public final static int columnsCount = 20;
    public final static int rowsCount = 100;

    // максимальное количество животных каждого вида

    public final static int maxWolfsNumbers = 30;
    public final static int maxBoasNumbers = 30;
    public final static int maxFoxesNumbers = 30;
    public final static int maxBearsNumbers = 5;
    public final static int maxEaglesNumbers = 20;
    public final static int maxHorsesNumbers = 20;
    public final static int maxDeerNumbers = 20;
    public final static int maxRabbitsNumbers = 150;
    public final static int maxMousesNumbers = 500;
    public final static int maxGoatsNumbers = 140;
    public final static int maxSheepNumbers = 140;
    public final static int maxBoarsNumbers = 50;
    public final static int maxBuffaloNumbers = 10;
    public final static int maxDucksNumbers = 200;
    public final static int maxCaterpillarsNumbers = 1000;
    public final static int maxPlantsNumbers = 200;

    // количество животных каждого вида при старте

    public final static int numberWolfes = ThreadLocalRandom.current().nextInt(10, maxWolfsNumbers + 1);
    public final static int numberBoas = ThreadLocalRandom.current().nextInt(10, maxBoasNumbers + 1);
    public final static int numberFoxes = ThreadLocalRandom.current().nextInt(10, maxFoxesNumbers + 1);
    public final static int numberBears = ThreadLocalRandom.current().nextInt(2, maxBearsNumbers + 1);
    public final static int numberEagles = ThreadLocalRandom.current().nextInt(6, maxEaglesNumbers + 1);
    public final static int numberHorses = ThreadLocalRandom.current().nextInt(6, maxHorsesNumbers + 1);
    public final static int numberDeers = ThreadLocalRandom.current().nextInt(7, maxDeerNumbers + 1);
    public final static int numberRabbits = ThreadLocalRandom.current().nextInt(50, maxRabbitsNumbers + 1);
    public final static int numberMouses = ThreadLocalRandom.current().nextInt(150, maxMousesNumbers + 1);
    public final static int numberGoats = ThreadLocalRandom.current().nextInt(40, maxGoatsNumbers + 1);
    public final static int numberSheeps = ThreadLocalRandom.current().nextInt(40, maxSheepNumbers + 1);
    public final static int numberBoars = ThreadLocalRandom.current().nextInt(15, maxBoarsNumbers + 1);
    public final static int numberBuffalos = ThreadLocalRandom.current().nextInt(3, maxBuffaloNumbers + 1);
    public final static int numberDucks = ThreadLocalRandom.current().nextInt(50, maxDucksNumbers + 1);
    public final static int numberCaterpillars = ThreadLocalRandom.current().nextInt(300, maxCaterpillarsNumbers + 1);
    public final static int numberPlants = 200;

    // количество детенышей у каждого вида животных

    public final static int numberChildWolf = 1;
    public final static int numberChildBoa = 1;
    public final static int numberChildFox = 1;
    public final static int numberChildBear = 1;
    public final static int numberChildEagle = 1;
    public final static int numberChildHorse = 1;
    public final static int numberChildDeer = 1;
    public final static int numberChildRabbit = 1;
    public final static int numberChildMouse = 1;
    public final static int numberChildGoat = 1;
    public final static int numberChildSheep = 1;
    public final static int numberChildBoar = 1;
    public final static int numberChildBuffalo = 1;
    public final static int numberChildDuck = 1;
    public final static int numberChildCaterpillar = 1;

    // максимальное количество животных на одной клетке (мапа)

    public static HashMap<CreatureEnum, Integer> maxQuantityAnimalInLocation = new HashMap<>();

    static {
        maxQuantityAnimalInLocation.put(CreatureEnum.WOLF, maxWolfsNumbers);
        maxQuantityAnimalInLocation.put(CreatureEnum.BOA, maxBoasNumbers);
        maxQuantityAnimalInLocation.put(CreatureEnum.FOX, maxFoxesNumbers);
        maxQuantityAnimalInLocation.put(CreatureEnum.BEAR, maxBearsNumbers);
        maxQuantityAnimalInLocation.put(CreatureEnum.EAGLE, maxEaglesNumbers);
        maxQuantityAnimalInLocation.put(CreatureEnum.HORSE, maxHorsesNumbers);
        maxQuantityAnimalInLocation.put(CreatureEnum.DEER, maxDeerNumbers);
        maxQuantityAnimalInLocation.put(CreatureEnum.RABBIT, maxRabbitsNumbers);
        maxQuantityAnimalInLocation.put(CreatureEnum.MOUSE, maxMousesNumbers);
        maxQuantityAnimalInLocation.put(CreatureEnum.GOAT, maxGoatsNumbers);
        maxQuantityAnimalInLocation.put(CreatureEnum.SHEEP, maxSheepNumbers);
        maxQuantityAnimalInLocation.put(CreatureEnum.BOAR, maxBoarsNumbers);
        maxQuantityAnimalInLocation.put(CreatureEnum.BUFFALO, maxBuffaloNumbers);
        maxQuantityAnimalInLocation.put(CreatureEnum.DUCK, maxDucksNumbers);
        maxQuantityAnimalInLocation.put(CreatureEnum.CATERPILLAR, maxCaterpillarsNumbers);
    }

    // количество животных на старте (мапа)

    public static HashMap<CreatureEnum, Integer> quantityByCreation = new HashMap<>();

    static {
        quantityByCreation.put(CreatureEnum.WOLF, numberWolfes);
        quantityByCreation.put(CreatureEnum.BOA, numberBoas);
        quantityByCreation.put(CreatureEnum.FOX, numberFoxes);
        quantityByCreation.put(CreatureEnum.BEAR, numberBears);
        quantityByCreation.put(CreatureEnum.EAGLE, numberEagles);
        quantityByCreation.put(CreatureEnum.HORSE, numberHorses);
        quantityByCreation.put(CreatureEnum.DEER, numberDeers);
        quantityByCreation.put(CreatureEnum.RABBIT, numberRabbits);
        quantityByCreation.put(CreatureEnum.MOUSE, numberMouses);
        quantityByCreation.put(CreatureEnum.GOAT, numberGoats);
        quantityByCreation.put(CreatureEnum.SHEEP, numberSheeps);
        quantityByCreation.put(CreatureEnum.BOAR, numberBoars);
        quantityByCreation.put(CreatureEnum.BUFFALO, numberBuffalos);
        quantityByCreation.put(CreatureEnum.DUCK, numberDucks);
        quantityByCreation.put(CreatureEnum.CATERPILLAR, numberCaterpillars);
        quantityByCreation.put(CreatureEnum.PLANT, 200);
    }

    // максимальный вес животного (стартовый)

    public static HashMap<CreatureEnum, Double> maxWeightAnimal = new HashMap<>();

    static {
        maxWeightAnimal.put(CreatureEnum.WOLF, 50.0);
        maxWeightAnimal.put(CreatureEnum.BOA, 15.0);
        maxWeightAnimal.put(CreatureEnum.FOX, 8.0);
        maxWeightAnimal.put(CreatureEnum.BEAR, 500.0);
        maxWeightAnimal.put(CreatureEnum.EAGLE, 6.0);
        maxWeightAnimal.put(CreatureEnum.HORSE, 400.0);
        maxWeightAnimal.put(CreatureEnum.DEER, 300.0);
        maxWeightAnimal.put(CreatureEnum.RABBIT, 2.0);
        maxWeightAnimal.put(CreatureEnum.MOUSE, 0.05);
        maxWeightAnimal.put(CreatureEnum.GOAT, 60.0);
        maxWeightAnimal.put(CreatureEnum.SHEEP, 70.0);
        maxWeightAnimal.put(CreatureEnum.BOAR, 400.0);
        maxWeightAnimal.put(CreatureEnum.BUFFALO, 700.0);
        maxWeightAnimal.put(CreatureEnum.DUCK, 1.0);
        maxWeightAnimal.put(CreatureEnum.CATERPILLAR, 0.01);
    }

    // максимальная скорость перемещения, клеток за ход

    public static HashMap<CreatureEnum, Integer> movingSpeed = new HashMap<>();

    static {
        movingSpeed.put(CreatureEnum.WOLF, 3);
        movingSpeed.put(CreatureEnum.BOA, 1);
        movingSpeed.put(CreatureEnum.FOX, 2);
        movingSpeed.put(CreatureEnum.BEAR, 2);
        movingSpeed.put(CreatureEnum.EAGLE, 3);
        movingSpeed.put(CreatureEnum.HORSE, 4);
        movingSpeed.put(CreatureEnum.DEER, 5);
        movingSpeed.put(CreatureEnum.RABBIT, 2);
        movingSpeed.put(CreatureEnum.MOUSE, 1);
        movingSpeed.put(CreatureEnum.GOAT, 3);
        movingSpeed.put(CreatureEnum.SHEEP, 3);
        movingSpeed.put(CreatureEnum.BOAR, 2);
        movingSpeed.put(CreatureEnum.BUFFALO, 3);
        movingSpeed.put(CreatureEnum.DUCK, 4);
        movingSpeed.put(CreatureEnum.CATERPILLAR, 0);
    }

    // максимальное количество килограмм для насыщения

    public static HashMap<CreatureEnum, Double> maxEatenWeight = new HashMap<>();

    static {
        maxEatenWeight.put(CreatureEnum.WOLF, 8.0);
        maxEatenWeight.put(CreatureEnum.BOA, 3.0);
        maxEatenWeight.put(CreatureEnum.FOX, 2.0);
        maxEatenWeight.put(CreatureEnum.BEAR, 80.0);
        maxEatenWeight.put(CreatureEnum.EAGLE, 1.0);
        maxEatenWeight.put(CreatureEnum.HORSE, 60.0);
        maxEatenWeight.put(CreatureEnum.DEER, 50.0);
        maxEatenWeight.put(CreatureEnum.RABBIT, 0.45);
        maxEatenWeight.put(CreatureEnum.MOUSE, 0.01);
        maxEatenWeight.put(CreatureEnum.GOAT, 10.0);
        maxEatenWeight.put(CreatureEnum.SHEEP, 15.0);
        maxEatenWeight.put(CreatureEnum.BOAR, 50.0);
        maxEatenWeight.put(CreatureEnum.BUFFALO, 100.0);
        maxEatenWeight.put(CreatureEnum.DUCK, 0.15);
        maxEatenWeight.put(CreatureEnum.CATERPILLAR, 0.0);
    }

    // максимальное количество детей (мапа)

    public static HashMap<CreatureEnum, Integer> quantityChildren = new HashMap<>();

    static {
        quantityChildren.put(CreatureEnum.WOLF, numberChildWolf);
        quantityChildren.put(CreatureEnum.BOA, numberChildBoa);
        quantityChildren.put(CreatureEnum.FOX, numberChildFox);
        quantityChildren.put(CreatureEnum.BEAR, numberChildBear);
        quantityChildren.put(CreatureEnum.EAGLE, numberChildEagle);
        quantityChildren.put(CreatureEnum.HORSE, numberChildHorse);
        quantityChildren.put(CreatureEnum.DEER, numberChildDeer);
        quantityChildren.put(CreatureEnum.RABBIT, numberChildRabbit);
        quantityChildren.put(CreatureEnum.MOUSE, numberChildMouse);
        quantityChildren.put(CreatureEnum.GOAT, numberChildGoat);
        quantityChildren.put(CreatureEnum.SHEEP, numberChildSheep);
        quantityChildren.put(CreatureEnum.BOAR, numberChildBoar);
        quantityChildren.put(CreatureEnum.BUFFALO, numberChildBuffalo);
        quantityChildren.put(CreatureEnum.DUCK, numberChildDuck);
        quantityChildren.put(CreatureEnum.CATERPILLAR, numberChildCaterpillar);
    }

    // шанс съедения одним животным другого при нахождении на одной клетке

    public static HashMap<CreatureEnum, HashMap<CreatureEnum, Integer>> probabilityAnimalToEat = new HashMap<>();

    public static HashMap<CreatureEnum, Integer> probabilityWolfToEat = new HashMap<>();
    public static HashMap<CreatureEnum, Integer> probabilityBoaToEat = new HashMap<>();
    public static HashMap<CreatureEnum, Integer> probabilityFoxToEat = new HashMap<>();
    public static HashMap<CreatureEnum, Integer> probabilityBearToEat = new HashMap<>();
    public static HashMap<CreatureEnum, Integer> probabilityEagleToEat = new HashMap<>();
    public static HashMap<CreatureEnum, Integer> probabilityHerbivoresToEat = new HashMap<>();
    public static HashMap<CreatureEnum, Integer> probabilityMouseAndDuckToEat = new HashMap<>();
    public static HashMap<CreatureEnum, Integer> probabilityBoarToEat = new HashMap<>();

    static {
        probabilityWolfToEat.put(CreatureEnum.WOLF, 0);
        probabilityWolfToEat.put(CreatureEnum.BOA, 0);
        probabilityWolfToEat.put(CreatureEnum.FOX, 0);
        probabilityWolfToEat.put(CreatureEnum.BEAR, 0);
        probabilityWolfToEat.put(CreatureEnum.EAGLE, 0);
        probabilityWolfToEat.put(CreatureEnum.HORSE, 10);
        probabilityWolfToEat.put(CreatureEnum.DEER, 15);
        probabilityWolfToEat.put(CreatureEnum.RABBIT, 60);
        probabilityWolfToEat.put(CreatureEnum.MOUSE, 80);
        probabilityWolfToEat.put(CreatureEnum.GOAT, 60);
        probabilityWolfToEat.put(CreatureEnum.SHEEP, 70);
        probabilityWolfToEat.put(CreatureEnum.BOAR, 15);
        probabilityWolfToEat.put(CreatureEnum.BUFFALO, 10);
        probabilityWolfToEat.put(CreatureEnum.DUCK, 40);
        probabilityWolfToEat.put(CreatureEnum.CATERPILLAR, 0);

        probabilityBoaToEat.put(CreatureEnum.WOLF, 0);
        probabilityBoaToEat.put(CreatureEnum.BOA, 0);
        probabilityBoaToEat.put(CreatureEnum.FOX, 15);
        probabilityBoaToEat.put(CreatureEnum.BEAR, 0);
        probabilityBoaToEat.put(CreatureEnum.EAGLE, 0);
        probabilityBoaToEat.put(CreatureEnum.HORSE, 0);
        probabilityBoaToEat.put(CreatureEnum.DEER, 0);
        probabilityBoaToEat.put(CreatureEnum.RABBIT, 20);
        probabilityBoaToEat.put(CreatureEnum.MOUSE, 40);
        probabilityBoaToEat.put(CreatureEnum.GOAT, 0);
        probabilityBoaToEat.put(CreatureEnum.SHEEP, 0);
        probabilityBoaToEat.put(CreatureEnum.BOAR, 0);
        probabilityBoaToEat.put(CreatureEnum.BUFFALO, 0);
        probabilityBoaToEat.put(CreatureEnum.DUCK, 10);
        probabilityBoaToEat.put(CreatureEnum.CATERPILLAR, 0);

        probabilityFoxToEat.put(CreatureEnum.WOLF, 0);
        probabilityFoxToEat.put(CreatureEnum.BOA, 0);
        probabilityFoxToEat.put(CreatureEnum.FOX, 0);
        probabilityFoxToEat.put(CreatureEnum.BEAR, 0);
        probabilityFoxToEat.put(CreatureEnum.EAGLE, 0);
        probabilityFoxToEat.put(CreatureEnum.HORSE, 0);
        probabilityFoxToEat.put(CreatureEnum.DEER, 0);
        probabilityFoxToEat.put(CreatureEnum.RABBIT, 70);
        probabilityFoxToEat.put(CreatureEnum.MOUSE, 90);
        probabilityFoxToEat.put(CreatureEnum.GOAT, 0);
        probabilityFoxToEat.put(CreatureEnum.SHEEP, 0);
        probabilityFoxToEat.put(CreatureEnum.BOAR, 0);
        probabilityFoxToEat.put(CreatureEnum.BUFFALO, 0);
        probabilityFoxToEat.put(CreatureEnum.DUCK, 60);
        probabilityFoxToEat.put(CreatureEnum.CATERPILLAR, 40);

        probabilityBearToEat.put(CreatureEnum.WOLF, 0);
        probabilityBearToEat.put(CreatureEnum.BOA, 80);
        probabilityBearToEat.put(CreatureEnum.FOX, 0);
        probabilityBearToEat.put(CreatureEnum.BEAR, 0);
        probabilityBearToEat.put(CreatureEnum.EAGLE, 0);
        probabilityBearToEat.put(CreatureEnum.HORSE, 40);
        probabilityBearToEat.put(CreatureEnum.DEER, 80);
        probabilityBearToEat.put(CreatureEnum.RABBIT, 80);
        probabilityBearToEat.put(CreatureEnum.MOUSE, 90);
        probabilityBearToEat.put(CreatureEnum.GOAT, 70);
        probabilityBearToEat.put(CreatureEnum.SHEEP, 70);
        probabilityBearToEat.put(CreatureEnum.BOAR, 50);
        probabilityBearToEat.put(CreatureEnum.BUFFALO, 20);
        probabilityBearToEat.put(CreatureEnum.DUCK, 10);
        probabilityBearToEat.put(CreatureEnum.CATERPILLAR, 0);

        probabilityEagleToEat.put(CreatureEnum.WOLF, 0);
        probabilityEagleToEat.put(CreatureEnum.BOA, 0);
        probabilityEagleToEat.put(CreatureEnum.FOX, 10);
        probabilityEagleToEat.put(CreatureEnum.BEAR, 0);
        probabilityEagleToEat.put(CreatureEnum.EAGLE, 0);
        probabilityEagleToEat.put(CreatureEnum.HORSE, 0);
        probabilityEagleToEat.put(CreatureEnum.DEER, 0);
        probabilityEagleToEat.put(CreatureEnum.RABBIT, 90);
        probabilityEagleToEat.put(CreatureEnum.MOUSE, 90);
        probabilityEagleToEat.put(CreatureEnum.GOAT, 0);
        probabilityEagleToEat.put(CreatureEnum.SHEEP, 0);
        probabilityEagleToEat.put(CreatureEnum.BOAR, 0);
        probabilityEagleToEat.put(CreatureEnum.BUFFALO, 0);
        probabilityEagleToEat.put(CreatureEnum.DUCK, 80);
        probabilityEagleToEat.put(CreatureEnum.CATERPILLAR, 0);

        probabilityHerbivoresToEat.put(CreatureEnum.WOLF, 0);
        probabilityHerbivoresToEat.put(CreatureEnum.BOA, 0);
        probabilityHerbivoresToEat.put(CreatureEnum.FOX, 0);
        probabilityHerbivoresToEat.put(CreatureEnum.BEAR, 0);
        probabilityHerbivoresToEat.put(CreatureEnum.EAGLE, 0);
        probabilityHerbivoresToEat.put(CreatureEnum.HORSE, 0);
        probabilityHerbivoresToEat.put(CreatureEnum.DEER, 0);
        probabilityHerbivoresToEat.put(CreatureEnum.RABBIT, 0);
        probabilityHerbivoresToEat.put(CreatureEnum.MOUSE, 0);
        probabilityHerbivoresToEat.put(CreatureEnum.GOAT, 0);
        probabilityHerbivoresToEat.put(CreatureEnum.SHEEP, 0);
        probabilityHerbivoresToEat.put(CreatureEnum.BOAR, 0);
        probabilityHerbivoresToEat.put(CreatureEnum.BUFFALO, 0);
        probabilityHerbivoresToEat.put(CreatureEnum.DUCK, 0);
        probabilityHerbivoresToEat.put(CreatureEnum.CATERPILLAR, 0);

        probabilityMouseAndDuckToEat.put(CreatureEnum.WOLF, 0);
        probabilityMouseAndDuckToEat.put(CreatureEnum.BOA, 0);
        probabilityMouseAndDuckToEat.put(CreatureEnum.FOX, 0);
        probabilityMouseAndDuckToEat.put(CreatureEnum.BEAR, 0);
        probabilityMouseAndDuckToEat.put(CreatureEnum.EAGLE, 0);
        probabilityMouseAndDuckToEat.put(CreatureEnum.HORSE, 0);
        probabilityMouseAndDuckToEat.put(CreatureEnum.DEER, 0);
        probabilityMouseAndDuckToEat.put(CreatureEnum.RABBIT, 0);
        probabilityMouseAndDuckToEat.put(CreatureEnum.MOUSE, 0);
        probabilityMouseAndDuckToEat.put(CreatureEnum.GOAT, 0);
        probabilityMouseAndDuckToEat.put(CreatureEnum.SHEEP, 0);
        probabilityMouseAndDuckToEat.put(CreatureEnum.BOAR, 0);
        probabilityMouseAndDuckToEat.put(CreatureEnum.BUFFALO, 0);
        probabilityMouseAndDuckToEat.put(CreatureEnum.DUCK, 0);
        probabilityMouseAndDuckToEat.put(CreatureEnum.CATERPILLAR, 90);


        probabilityBoarToEat.put(CreatureEnum.WOLF, 0);
        probabilityBoarToEat.put(CreatureEnum.BOA, 0);
        probabilityBoarToEat.put(CreatureEnum.FOX, 0);
        probabilityBoarToEat.put(CreatureEnum.BEAR, 0);
        probabilityBoarToEat.put(CreatureEnum.EAGLE, 0);
        probabilityBoarToEat.put(CreatureEnum.HORSE, 0);
        probabilityBoarToEat.put(CreatureEnum.DEER, 0);
        probabilityBoarToEat.put(CreatureEnum.RABBIT, 0);
        probabilityBoarToEat.put(CreatureEnum.MOUSE, 50);
        probabilityBoarToEat.put(CreatureEnum.GOAT, 0);
        probabilityBoarToEat.put(CreatureEnum.SHEEP, 0);
        probabilityBoarToEat.put(CreatureEnum.BOAR, 0);
        probabilityBoarToEat.put(CreatureEnum.BUFFALO, 0);
        probabilityBoarToEat.put(CreatureEnum.DUCK, 0);
        probabilityBoarToEat.put(CreatureEnum.CATERPILLAR, 90);


        probabilityAnimalToEat.put(CreatureEnum.WOLF, probabilityWolfToEat);
        probabilityAnimalToEat.put(CreatureEnum.BOA, probabilityBoaToEat);
        probabilityAnimalToEat.put(CreatureEnum.FOX, probabilityFoxToEat);
        probabilityAnimalToEat.put(CreatureEnum.BEAR, probabilityBearToEat);
        probabilityAnimalToEat.put(CreatureEnum.EAGLE, probabilityEagleToEat);
        probabilityAnimalToEat.put(CreatureEnum.HORSE, probabilityHerbivoresToEat);
        probabilityAnimalToEat.put(CreatureEnum.DEER, probabilityHerbivoresToEat);
        probabilityAnimalToEat.put(CreatureEnum.RABBIT, probabilityHerbivoresToEat);
        probabilityAnimalToEat.put(CreatureEnum.MOUSE, probabilityMouseAndDuckToEat);
        probabilityAnimalToEat.put(CreatureEnum.GOAT, probabilityHerbivoresToEat);
        probabilityAnimalToEat.put(CreatureEnum.SHEEP, probabilityHerbivoresToEat);
        probabilityAnimalToEat.put(CreatureEnum.BOAR, probabilityBoarToEat);
        probabilityAnimalToEat.put(CreatureEnum.BUFFALO, probabilityHerbivoresToEat);
        probabilityAnimalToEat.put(CreatureEnum.DUCK, probabilityMouseAndDuckToEat);
        probabilityAnimalToEat.put(CreatureEnum.CATERPILLAR, probabilityHerbivoresToEat);
    }

}
