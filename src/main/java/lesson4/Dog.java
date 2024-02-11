package lesson4;

public class Dog extends Animal {
    public static int count;
    public Dog(String name) {
        super(name, 500, 10);
        count++;
    }
}
