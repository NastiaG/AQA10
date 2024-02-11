/* Task 2: Написать метод, которому в качестве параметра передается целое число, метод должен
напечатать в консоль, положительное ли число передали или отрицательное.
Замечание: ноль считаем положительным числом.*/

package lesson2;

public class PositiveOrNegative {
    public static void isPositiveOrNegative(int num) {
        if (num >= 0) {
            System.out.println("Число положительное");
        } else if (num < 0) {
            System.out.println("Число отрицательное");
        }
    }
}
