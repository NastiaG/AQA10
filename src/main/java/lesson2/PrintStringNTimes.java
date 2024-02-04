/*Task 4: Написать метод, которому в качестве аргументов передается строка и число,
метод должен отпечатать в консоль указанную строку, указанное количество раз*/

package lesson2;

public class PrintStringNTimes {
    public static void printStringNTimes(String text, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(text);
        }
    }
}
