package lesson4;

import static lesson4.ArrayOfCats.arrayOfCats;

public class EatingCats {
    public static void eatingCats() {
        Cat[] arrEatingCats = arrayOfCats();
        Plate plate = new Plate(10);

        for (Cat c: arrEatingCats) {
            c.eat(plate);
            if (c.getFullness()) {
                System.out.println(c.getName() + " is full");
            } else {
                System.out.println(c.getName() + " is hungry");
            }
        }
    }
}
