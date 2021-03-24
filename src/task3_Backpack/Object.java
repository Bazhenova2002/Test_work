package task3_Backpack;

public class Object {
    private final int value;
    private final int weight;
    private final double valuePerWeight;

    public int getValue() {
        return value;
    }

    public int getWeight() {
        return weight;
    }

    public double getValuePerWeight() {
        return valuePerWeight;
    }

    public Object(int value, int weight) {
        this.value = value;
        this.weight = weight;
        this.valuePerWeight = (double) value / weight;
    }
    @Override
    public String toString() {
        return String.format("Object{%s UAH; %s kg; %.2f UAH/kg}", value, weight, valuePerWeight);
    }
}
