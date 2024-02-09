package lesson4;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if (n <= food) {
            if (n >= 0) {
                food -= n;
            }
            return true;
        } else {
            return false;
        }
    }

    public int increaseFood(int n) {
        food += n;
        return food;
    }
}
