package task3_Backpack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static final int SIZE = 10;
    public static final Random RANDOM = new Random();

    public static void main(String[] args) {

        Backpack backpack = new Backpack();
        System.out.println(backpack);
        List<Object> objectList = new ArrayList<>();
        generateProductList(objectList);
        sortByWeightFromMaxToMin(objectList);
        sortByValuePerWeightFromMaxToMin(objectList);
        printProductsList(objectList);
        fillBackpack(backpack, objectList);
        backpack.showProducts();
    }

    private static void fillBackpack(Backpack backpack, List<Object> objectList) {

        for (Object object : objectList) {
            if (backpack.getRestWeight() >= object.getWeight()) {
                backpack.add(object);
            } else if (backpack.getRestWeight() == 0) {
                break;
            } else {
                findAndAddObjectByWeight(backpack, objectList);
            }
        }
    }

    private static void findAndAddObjectByWeight(Backpack backpack, List<Object> objectList) {
        for (Object object : objectList) {
            if (object.getWeight() <= backpack.getRestWeight()) {
                backpack.add(object);
                if (backpack.getRestWeight() == 0) {
                    break;
                }
            }
        }
    }

    private static void printProductsList(List<Object> objectList) {
        System.out.println("List of objects:");
        int counter = 0;
        for (Object object : objectList) {
            counter++;
            System.out.println(counter + ": " + object);
        }
    }

    private static void sortByValuePerWeightFromMaxToMin(List<Object> objectList) {
        objectList.sort((o1, o2) -> (int) (o2.getValuePerWeight() * 100 - o1.getValuePerWeight() * 100));
    }

    private static void sortByWeightFromMaxToMin(List<Object> objectList) {
        objectList.sort((o1, o2) -> o2.getWeight() - o1.getWeight());
    }

    private static void generateProductList(List<Object> list) {
        for (int i = 0; i < SIZE; i++) {
            int someWeight = RANDOM.nextInt(10) + 1;
            int someValue = RANDOM.nextInt(10) + 1;
            Object someObject = new Object(someValue, someWeight);
            list.add(someObject);
        }
    }
}
