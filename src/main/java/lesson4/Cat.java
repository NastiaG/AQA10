package lesson4;

public class Cat extends Animal {
    private int appetite;
    private boolean fullness;

    public static int count;

    public Cat(String name, int appetite) {
        super(name,200, 0);
        this.appetite = appetite;
        count++;
    }

    @Override
    public void swim(int distance) {
        System.out.println(getName() + " can't swim");
    }

    public void eat(Plate p) {
       if (p.decreaseFood(appetite)) {
           fullness = true;
       }
    }

    public boolean getFullness() {
        return fullness;
    }
}
