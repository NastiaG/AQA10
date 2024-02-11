/* Task 1: Написать метод, принимающий на вход два целых числа и проверяющий,
что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
в противном случае – false.*/

package lesson2;

public class SumBetween10and20 {

    public static boolean isSumBetween10and20(int firstNum, int secondNum) {
        int sum = firstNum + secondNum;
        boolean result;
        if (sum >= 10 && sum <= 20) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}