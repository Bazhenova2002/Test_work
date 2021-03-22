package task1_TimeSpan;

public class Main {
    public static void main(String[] args) {
        TimeSpan timeSpan1 = new TimeSpan(2, 15);
        TimeSpan timeSpan2 = new TimeSpan(2, 10);
        timeSpan1.add(timeSpan2);
        System.out.println("add = " + timeSpan1.toString());
        timeSpan1.sub(timeSpan2);
        System.out.println("sub = " + timeSpan1.toString());
        timeSpan2.mult(0.5);
        System.out.println("mult = " + timeSpan2.toString());
    }
}
