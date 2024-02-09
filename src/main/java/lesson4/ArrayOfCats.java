package lesson4;

public class ArrayOfCats {
    public static Cat[] arrayOfCats() {
        Cat[] arrayOfCats = new Cat[3];
        arrayOfCats[0] = new Cat("Barsik", 0);
        arrayOfCats[1] = new Cat("Leopold", 8);
        arrayOfCats[2] = new Cat("Tom", 3);
        return arrayOfCats;
    }
}
