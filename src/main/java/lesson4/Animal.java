package lesson4;

public class Animal {

    private String name;
    private int maxRun;
    private int maxSwim;

    public static int count;

    public Animal (String name, int maxRun, int maxSwim) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        count++;
    }

    public String getName() {
        return name;
    }

    public void run(int distance) {
        if (distance < 0) {
            System.out.println(name + " can't run negative distance");
        } else if (maxRun <= 0) {
            System.out.println(name + " can't run");
        } else if (distance <= maxRun) {
            System.out.println(name + " ran " + distance + " meters");
        } else {
            System.out.println(name + " ran only " + maxRun + " meters of " + distance);
        }
    }

    public void swim(int distance) {
        if (distance < 0) {
            System.out.println(name + " can't swim negative distance");
        } else if (maxSwim <= 0) {
            System.out.println(name + " can't swim");
        } else if (distance <= maxSwim) {
            System.out.println(name + " swam " + distance + " meters");
        } else {
            System.out.println(name + " swam only " + maxSwim + " meters of " + distance);
        }
    }
}
