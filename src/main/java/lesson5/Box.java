package lesson5;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getSumWeight() {
        float weight = 0.0f;
        for (T f: fruits) {
            weight += f.getWeight();
        }
        return weight;
    }

    public boolean compare(Box<?> box) {
        if (this.getSumWeight() == box.getSumWeight()) {
            return true;
        } else {
            return false;
        }
    }

    public void pourOut (Box<T> box) {
        for (T f: fruits) {
            box.addFruit(f);
        }
        fruits.clear();
    }
}
