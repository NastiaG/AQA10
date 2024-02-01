/*Task 3: Написать метод, которому в качестве параметра передается целое число.
Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
Замечание: ноль считаем положительным числом.*/

package lesson2;

public class IsNegative {
    public static boolean isNegative(int num) {
        boolean result;
        if (num < 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
