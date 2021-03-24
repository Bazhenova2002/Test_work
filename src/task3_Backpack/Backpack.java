package task3_Backpack;

import java.util.ArrayList;
import java.util.List;

public class Backpack {
    private final int MAX_WEIGHT = 15;
    private final int summaryValue = 0;
    private int summaryWeight = 0;
    private final List<Object> objectList = new ArrayList<>();

    public void add(Object object) {
        this.objectList.add(object);
        this.summaryWeight += object.getWeight();
    }

    public int getSummaryValue() {
        int summaryValue = 0;
        for (Object object : objectList) {
            summaryValue += object.getValue();
        }
        return summaryValue;
    }

    public void showProducts() {
        System.out.println("Object in backpack");
        for (Object object : objectList) {
            System.out.println(object.toString());
        }
        System.out.println("Backpacks total weight is: " + this.getSummaryWeight() +
                ", total value is: " + this.getSummaryValue());
    }

    public int getSummaryWeight() {
        return summaryWeight;
    }

    public int getRestWeight() {
        return MAX_WEIGHT - this.summaryWeight;
    }

    @Override
    public String toString() {
        return "Backpack{" +
                "summaryValue=" + summaryValue +
                ", summaryWeight=" + summaryWeight +
                '}';
    }
}
