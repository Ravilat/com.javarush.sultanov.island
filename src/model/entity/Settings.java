package model.entity;

import util.AnimalsEnum;

import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

public class Settings {

    // размеры острова

    public final static int columnsCount = 100;
    public final static int rowsCount = 20;

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
    public final static int maxPlansNumbers = 200;

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

    public static HashMap<AnimalsEnum, Integer> maxQuantityAnimalInLocation = new HashMap<>();

    static {
        maxQuantityAnimalInLocation.put(AnimalsEnum.WOLF, maxWolfsNumbers);
        maxQuantityAnimalInLocation.put(AnimalsEnum.BOA, maxBoasNumbers);
        maxQuantityAnimalInLocation.put(AnimalsEnum.FOX, maxFoxesNumbers);
        maxQuantityAnimalInLocation.put(AnimalsEnum.BEAR, maxBearsNumbers);
        maxQuantityAnimalInLocation.put(AnimalsEnum.EAGLE, maxEaglesNumbers);
        maxQuantityAnimalInLocation.put(AnimalsEnum.HORSE, maxHorsesNumbers);
        maxQuantityAnimalInLocation.put(AnimalsEnum.DEER, maxDeerNumbers);
        maxQuantityAnimalInLocation.put(AnimalsEnum.RABBIT, maxRabbitsNumbers);
        maxQuantityAnimalInLocation.put(AnimalsEnum.MOUSE, maxMousesNumbers);
        maxQuantityAnimalInLocation.put(AnimalsEnum.GOAT, maxGoatsNumbers);
        maxQuantityAnimalInLocation.put(AnimalsEnum.SHEEP, maxSheepNumbers);
        maxQuantityAnimalInLocation.put(AnimalsEnum.BOAR, maxBoarsNumbers);
        maxQuantityAnimalInLocation.put(AnimalsEnum.BUFFALO, maxBuffaloNumbers);
        maxQuantityAnimalInLocation.put(AnimalsEnum.DUCK, maxDucksNumbers);
        maxQuantityAnimalInLocation.put(AnimalsEnum.CATERPILLAR, maxCaterpillarsNumbers);
    }

    // количество животных на старте (мапа)

    public static HashMap<AnimalsEnum, Integer> quantityByCreation = new HashMap<>();

    static {
        quantityByCreation.put(AnimalsEnum.WOLF, numberWolfes);
        quantityByCreation.put(AnimalsEnum.BOA, numberBoas);
        quantityByCreation.put(AnimalsEnum.FOX, numberFoxes);
        quantityByCreation.put(AnimalsEnum.BEAR, numberBears);
        quantityByCreation.put(AnimalsEnum.EAGLE, numberEagles);
        quantityByCreation.put(AnimalsEnum.HORSE, numberHorses);
        quantityByCreation.put(AnimalsEnum.DEER, numberDeers);
        quantityByCreation.put(AnimalsEnum.RABBIT, numberRabbits);
        quantityByCreation.put(AnimalsEnum.MOUSE, numberMouses);
        quantityByCreation.put(AnimalsEnum.GOAT, numberGoats);
        quantityByCreation.put(AnimalsEnum.SHEEP, numberSheeps);
        quantityByCreation.put(AnimalsEnum.BOAR, numberBoars);
        quantityByCreation.put(AnimalsEnum.BUFFALO, numberBuffalos);
        quantityByCreation.put(AnimalsEnum.DUCK, numberDucks);
        quantityByCreation.put(AnimalsEnum.CATERPILLAR, numberCaterpillars);
    }

    // максимальный вес животного (стартовый)

    public static HashMap<AnimalsEnum, Double> maxWeightAnimal = new HashMap<>();

    static {
        maxWeightAnimal.put(AnimalsEnum.WOLF, 50.0);
        maxWeightAnimal.put(AnimalsEnum.BOA, 15.0);
        maxWeightAnimal.put(AnimalsEnum.FOX, 8.0);
        maxWeightAnimal.put(AnimalsEnum.BEAR, 500.0);
        maxWeightAnimal.put(AnimalsEnum.EAGLE, 6.0);
        maxWeightAnimal.put(AnimalsEnum.HORSE, 400.0);
        maxWeightAnimal.put(AnimalsEnum.DEER, 300.0);
        maxWeightAnimal.put(AnimalsEnum.RABBIT, 2.0);
        maxWeightAnimal.put(AnimalsEnum.MOUSE, 0.05);
        maxWeightAnimal.put(AnimalsEnum.GOAT, 60.0);
        maxWeightAnimal.put(AnimalsEnum.SHEEP, 70.0);
        maxWeightAnimal.put(AnimalsEnum.BOAR, 400.0);
        maxWeightAnimal.put(AnimalsEnum.BUFFALO, 700.0);
        maxWeightAnimal.put(AnimalsEnum.DUCK, 1.0);
        maxWeightAnimal.put(AnimalsEnum.CATERPILLAR, 0.01);
    }

    // максимальная скорость перемещения, клеток за ход

    public static HashMap<AnimalsEnum, Integer> movingSpeed = new HashMap<>();

    static {
        movingSpeed.put(AnimalsEnum.WOLF, 3);
        movingSpeed.put(AnimalsEnum.BOA, 1);
        movingSpeed.put(AnimalsEnum.FOX, 2);
        movingSpeed.put(AnimalsEnum.BEAR, 2);
        movingSpeed.put(AnimalsEnum.EAGLE, 3);
        movingSpeed.put(AnimalsEnum.HORSE, 4);
        movingSpeed.put(AnimalsEnum.DEER, 5);
        movingSpeed.put(AnimalsEnum.RABBIT, 2);
        movingSpeed.put(AnimalsEnum.MOUSE, 1);
        movingSpeed.put(AnimalsEnum.GOAT, 3);
        movingSpeed.put(AnimalsEnum.SHEEP, 3);
        movingSpeed.put(AnimalsEnum.BOAR, 2);
        movingSpeed.put(AnimalsEnum.BUFFALO, 3);
        movingSpeed.put(AnimalsEnum.DUCK, 4);
        movingSpeed.put(AnimalsEnum.CATERPILLAR, 0);
    }

    // максимальное количество килограмм для насыщения

    public static HashMap<AnimalsEnum, Double> maxEatenWeight = new HashMap<>();

    static {
        maxEatenWeight.put(AnimalsEnum.WOLF, 8.0);
        maxEatenWeight.put(AnimalsEnum.BOA, 3.0);
        maxEatenWeight.put(AnimalsEnum.FOX, 2.0);
        maxEatenWeight.put(AnimalsEnum.BEAR, 80.0);
        maxEatenWeight.put(AnimalsEnum.EAGLE, 1.0);
        maxEatenWeight.put(AnimalsEnum.HORSE, 60.0);
        maxEatenWeight.put(AnimalsEnum.DEER, 50.0);
        maxEatenWeight.put(AnimalsEnum.RABBIT, 0.45);
        maxEatenWeight.put(AnimalsEnum.MOUSE, 0.01);
        maxEatenWeight.put(AnimalsEnum.GOAT, 10.0);
        maxEatenWeight.put(AnimalsEnum.SHEEP, 15.0);
        maxEatenWeight.put(AnimalsEnum.BOAR, 50.0);
        maxEatenWeight.put(AnimalsEnum.BUFFALO, 100.0);
        maxEatenWeight.put(AnimalsEnum.DUCK, 0.15);
        maxEatenWeight.put(AnimalsEnum.CATERPILLAR, 0.0);
    }

    // максимальное количество детей (мапа)

    public static HashMap<AnimalsEnum, Integer> quantityChildren = new HashMap<>();

    static {
        quantityChildren.put(AnimalsEnum.WOLF, numberChildWolf);
        quantityChildren.put(AnimalsEnum.BOA, numberChildBoa);
        quantityChildren.put(AnimalsEnum.FOX, numberChildFox);
        quantityChildren.put(AnimalsEnum.BEAR, numberChildBear);
        quantityChildren.put(AnimalsEnum.EAGLE, numberChildEagle);
        quantityChildren.put(AnimalsEnum.HORSE, numberChildHorse);
        quantityChildren.put(AnimalsEnum.DEER, numberChildDeer);
        quantityChildren.put(AnimalsEnum.RABBIT, numberChildRabbit);
        quantityChildren.put(AnimalsEnum.MOUSE, numberChildMouse);
        quantityChildren.put(AnimalsEnum.GOAT, numberChildGoat);
        quantityChildren.put(AnimalsEnum.SHEEP, numberChildSheep);
        quantityChildren.put(AnimalsEnum.BOAR, numberChildBoar);
        quantityChildren.put(AnimalsEnum.BUFFALO, numberChildBuffalo);
        quantityChildren.put(AnimalsEnum.DUCK, numberChildDuck);
        quantityChildren.put(AnimalsEnum.CATERPILLAR, numberChildCaterpillar);
    }

    // шанс съедения одним животным другого при нахождении на одной клетке

    public static HashMap<AnimalsEnum, HashMap<AnimalsEnum, Integer>> probabilityAnimalToEat = new HashMap<>();

    public static HashMap<AnimalsEnum, Integer> probabilityWolfToEat = new HashMap<>();
    public static HashMap<AnimalsEnum, Integer> probabilityBoaToEat = new HashMap<>();
    public static HashMap<AnimalsEnum, Integer> probabilityFoxToEat = new HashMap<>();
    public static HashMap<AnimalsEnum, Integer> probabilityBearToEat = new HashMap<>();
    public static HashMap<AnimalsEnum, Integer> probabilityEagleToEat = new HashMap<>();
    public static HashMap<AnimalsEnum, Integer> probabilityHerbivoresToEat = new HashMap<>();
    public static HashMap<AnimalsEnum, Integer> probabilityMouseAndDuckToEat = new HashMap<>();
    public static HashMap<AnimalsEnum, Integer> probabilityBoarToEat = new HashMap<>();

    static {
        probabilityWolfToEat.put(AnimalsEnum.WOLF, 0);
        probabilityWolfToEat.put(AnimalsEnum.BOA, 0);
        probabilityWolfToEat.put(AnimalsEnum.FOX, 0);
        probabilityWolfToEat.put(AnimalsEnum.BEAR, 0);
        probabilityWolfToEat.put(AnimalsEnum.EAGLE, 0);
        probabilityWolfToEat.put(AnimalsEnum.HORSE, 10);
        probabilityWolfToEat.put(AnimalsEnum.DEER, 15);
        probabilityWolfToEat.put(AnimalsEnum.RABBIT, 60);
        probabilityWolfToEat.put(AnimalsEnum.MOUSE, 80);
        probabilityWolfToEat.put(AnimalsEnum.GOAT, 60);
        probabilityWolfToEat.put(AnimalsEnum.SHEEP, 70);
        probabilityWolfToEat.put(AnimalsEnum.BOAR, 15);
        probabilityWolfToEat.put(AnimalsEnum.BUFFALO, 10);
        probabilityWolfToEat.put(AnimalsEnum.DUCK, 40);
        probabilityWolfToEat.put(AnimalsEnum.CATERPILLAR, 0);

        probabilityBoaToEat.put(AnimalsEnum.WOLF, 0);
        probabilityBoaToEat.put(AnimalsEnum.BOA, 0);
        probabilityBoaToEat.put(AnimalsEnum.FOX, 15);
        probabilityBoaToEat.put(AnimalsEnum.BEAR, 0);
        probabilityBoaToEat.put(AnimalsEnum.EAGLE, 0);
        probabilityBoaToEat.put(AnimalsEnum.HORSE, 0);
        probabilityBoaToEat.put(AnimalsEnum.DEER, 0);
        probabilityBoaToEat.put(AnimalsEnum.RABBIT, 20);
        probabilityBoaToEat.put(AnimalsEnum.MOUSE, 40);
        probabilityBoaToEat.put(AnimalsEnum.GOAT, 0);
        probabilityBoaToEat.put(AnimalsEnum.SHEEP, 0);
        probabilityBoaToEat.put(AnimalsEnum.BOAR, 0);
        probabilityBoaToEat.put(AnimalsEnum.BUFFALO, 0);
        probabilityBoaToEat.put(AnimalsEnum.DUCK, 10);
        probabilityBoaToEat.put(AnimalsEnum.CATERPILLAR, 0);

        probabilityFoxToEat.put(AnimalsEnum.WOLF, 0);
        probabilityFoxToEat.put(AnimalsEnum.BOA, 0);
        probabilityFoxToEat.put(AnimalsEnum.FOX, 0);
        probabilityFoxToEat.put(AnimalsEnum.BEAR, 0);
        probabilityFoxToEat.put(AnimalsEnum.EAGLE, 0);
        probabilityFoxToEat.put(AnimalsEnum.HORSE, 0);
        probabilityFoxToEat.put(AnimalsEnum.DEER, 0);
        probabilityFoxToEat.put(AnimalsEnum.RABBIT, 70);
        probabilityFoxToEat.put(AnimalsEnum.MOUSE, 90);
        probabilityFoxToEat.put(AnimalsEnum.GOAT, 0);
        probabilityFoxToEat.put(AnimalsEnum.SHEEP, 0);
        probabilityFoxToEat.put(AnimalsEnum.BOAR, 0);
        probabilityFoxToEat.put(AnimalsEnum.BUFFALO, 0);
        probabilityFoxToEat.put(AnimalsEnum.DUCK, 60);
        probabilityFoxToEat.put(AnimalsEnum.CATERPILLAR, 40);

        probabilityBearToEat.put(AnimalsEnum.WOLF, 0);
        probabilityBearToEat.put(AnimalsEnum.BOA, 80);
        probabilityBearToEat.put(AnimalsEnum.FOX, 0);
        probabilityBearToEat.put(AnimalsEnum.BEAR, 0);
        probabilityBearToEat.put(AnimalsEnum.EAGLE, 0);
        probabilityBearToEat.put(AnimalsEnum.HORSE, 40);
        probabilityBearToEat.put(AnimalsEnum.DEER, 80);
        probabilityBearToEat.put(AnimalsEnum.RABBIT, 80);
        probabilityBearToEat.put(AnimalsEnum.MOUSE, 90);
        probabilityBearToEat.put(AnimalsEnum.GOAT, 70);
        probabilityBearToEat.put(AnimalsEnum.SHEEP, 70);
        probabilityBearToEat.put(AnimalsEnum.BOAR, 50);
        probabilityBearToEat.put(AnimalsEnum.BUFFALO, 20);
        probabilityBearToEat.put(AnimalsEnum.DUCK, 10);
        probabilityBearToEat.put(AnimalsEnum.CATERPILLAR, 0);

        probabilityEagleToEat.put(AnimalsEnum.WOLF, 0);
        probabilityEagleToEat.put(AnimalsEnum.BOA, 0);
        probabilityEagleToEat.put(AnimalsEnum.FOX, 10);
        probabilityEagleToEat.put(AnimalsEnum.BEAR, 0);
        probabilityEagleToEat.put(AnimalsEnum.EAGLE, 0);
        probabilityEagleToEat.put(AnimalsEnum.HORSE, 0);
        probabilityEagleToEat.put(AnimalsEnum.DEER, 0);
        probabilityEagleToEat.put(AnimalsEnum.RABBIT, 90);
        probabilityEagleToEat.put(AnimalsEnum.MOUSE, 90);
        probabilityEagleToEat.put(AnimalsEnum.GOAT, 0);
        probabilityEagleToEat.put(AnimalsEnum.SHEEP, 0);
        probabilityEagleToEat.put(AnimalsEnum.BOAR, 0);
        probabilityEagleToEat.put(AnimalsEnum.BUFFALO, 0);
        probabilityEagleToEat.put(AnimalsEnum.DUCK, 80);
        probabilityEagleToEat.put(AnimalsEnum.CATERPILLAR, 0);

        probabilityHerbivoresToEat.put(AnimalsEnum.WOLF, 0);
        probabilityHerbivoresToEat.put(AnimalsEnum.BOA, 0);
        probabilityHerbivoresToEat.put(AnimalsEnum.FOX, 0);
        probabilityHerbivoresToEat.put(AnimalsEnum.BEAR, 0);
        probabilityHerbivoresToEat.put(AnimalsEnum.EAGLE, 0);
        probabilityHerbivoresToEat.put(AnimalsEnum.HORSE, 0);
        probabilityHerbivoresToEat.put(AnimalsEnum.DEER, 0);
        probabilityHerbivoresToEat.put(AnimalsEnum.RABBIT, 0);
        probabilityHerbivoresToEat.put(AnimalsEnum.MOUSE, 0);
        probabilityHerbivoresToEat.put(AnimalsEnum.GOAT, 0);
        probabilityHerbivoresToEat.put(AnimalsEnum.SHEEP, 0);
        probabilityHerbivoresToEat.put(AnimalsEnum.BOAR, 0);
        probabilityHerbivoresToEat.put(AnimalsEnum.BUFFALO, 0);
        probabilityHerbivoresToEat.put(AnimalsEnum.DUCK, 0);
        probabilityHerbivoresToEat.put(AnimalsEnum.CATERPILLAR, 0);

        probabilityMouseAndDuckToEat.put(AnimalsEnum.WOLF, 0);
        probabilityMouseAndDuckToEat.put(AnimalsEnum.BOA, 0);
        probabilityMouseAndDuckToEat.put(AnimalsEnum.FOX, 0);
        probabilityMouseAndDuckToEat.put(AnimalsEnum.BEAR, 0);
        probabilityMouseAndDuckToEat.put(AnimalsEnum.EAGLE, 0);
        probabilityMouseAndDuckToEat.put(AnimalsEnum.HORSE, 0);
        probabilityMouseAndDuckToEat.put(AnimalsEnum.DEER, 0);
        probabilityMouseAndDuckToEat.put(AnimalsEnum.RABBIT, 0);
        probabilityMouseAndDuckToEat.put(AnimalsEnum.MOUSE, 0);
        probabilityMouseAndDuckToEat.put(AnimalsEnum.GOAT, 0);
        probabilityMouseAndDuckToEat.put(AnimalsEnum.SHEEP, 0);
        probabilityMouseAndDuckToEat.put(AnimalsEnum.BOAR, 0);
        probabilityMouseAndDuckToEat.put(AnimalsEnum.BUFFALO, 0);
        probabilityMouseAndDuckToEat.put(AnimalsEnum.DUCK, 0);
        probabilityMouseAndDuckToEat.put(AnimalsEnum.CATERPILLAR, 90);


        probabilityBoarToEat.put(AnimalsEnum.WOLF, 0);
        probabilityBoarToEat.put(AnimalsEnum.BOA, 0);
        probabilityBoarToEat.put(AnimalsEnum.FOX, 0);
        probabilityBoarToEat.put(AnimalsEnum.BEAR, 0);
        probabilityBoarToEat.put(AnimalsEnum.EAGLE, 0);
        probabilityBoarToEat.put(AnimalsEnum.HORSE, 0);
        probabilityBoarToEat.put(AnimalsEnum.DEER, 0);
        probabilityBoarToEat.put(AnimalsEnum.RABBIT, 0);
        probabilityBoarToEat.put(AnimalsEnum.MOUSE, 50);
        probabilityBoarToEat.put(AnimalsEnum.GOAT, 0);
        probabilityBoarToEat.put(AnimalsEnum.SHEEP, 0);
        probabilityBoarToEat.put(AnimalsEnum.BOAR, 0);
        probabilityBoarToEat.put(AnimalsEnum.BUFFALO, 0);
        probabilityBoarToEat.put(AnimalsEnum.DUCK, 0);
        probabilityBoarToEat.put(AnimalsEnum.CATERPILLAR, 90);


        probabilityAnimalToEat.put(AnimalsEnum.WOLF, probabilityWolfToEat);
        probabilityAnimalToEat.put(AnimalsEnum.BOA, probabilityBoaToEat);
        probabilityAnimalToEat.put(AnimalsEnum.FOX, probabilityFoxToEat);
        probabilityAnimalToEat.put(AnimalsEnum.BEAR, probabilityBearToEat);
        probabilityAnimalToEat.put(AnimalsEnum.EAGLE, probabilityEagleToEat);
        probabilityAnimalToEat.put(AnimalsEnum.HORSE, probabilityHerbivoresToEat);
        probabilityAnimalToEat.put(AnimalsEnum.DEER, probabilityHerbivoresToEat);
        probabilityAnimalToEat.put(AnimalsEnum.RABBIT, probabilityHerbivoresToEat);
        probabilityAnimalToEat.put(AnimalsEnum.MOUSE, probabilityMouseAndDuckToEat);
        probabilityAnimalToEat.put(AnimalsEnum.GOAT, probabilityHerbivoresToEat);
        probabilityAnimalToEat.put(AnimalsEnum.SHEEP, probabilityHerbivoresToEat);
        probabilityAnimalToEat.put(AnimalsEnum.BOAR, probabilityBoarToEat);
        probabilityAnimalToEat.put(AnimalsEnum.BUFFALO, probabilityHerbivoresToEat);
        probabilityAnimalToEat.put(AnimalsEnum.DUCK, probabilityMouseAndDuckToEat);
        probabilityAnimalToEat.put(AnimalsEnum.CATERPILLAR, probabilityHerbivoresToEat);
    }

}
