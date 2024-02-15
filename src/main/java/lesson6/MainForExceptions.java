/*
    1. 	Напишите метод, на вход которого подается двумерный строковый массив размером 4х4.
        При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
    2. 	Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
        Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
        должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
    3. 	В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException
        и вывести результат расчета.
*/

package lesson6;

import static lesson6.ArrayForExceptions.arrayForExceptions;

public class MainForExceptions {
    public static void main(String[] args) {

        String[][] array1 = new String[][]{
                {"1", "2", "3", "c", "4"},
                {"?", "/", "5", "6"},
                {"a", "2", "3", "c"},
                {"?", "/", "5", "6"}
        };

        String[][] array2 = new String[][]{
                {"1", "2", "3", "0"},
                {"8", "5", "5", "6"},
                {"9", "2", "3", "4"},
                {"7", "1", "5", "6"}
        };

        String[][] array3 = new String[][]{
                {"1", "2", "3", "c"},
                {"?", "/", "5", "6"},
                {"a", "2", "3", "c"},
                {"?", "/", "5", "6"}
        };

        testExceptions(array1);
        testExceptions(array2);
        testExceptions(array3);
    }

    public static void testExceptions(String[][] arr) {
        try {
            System.out.println("The sum of int elements: " + arrayForExceptions(arr));
        } catch (MyArraySizeException e) {
            System.out.println("Wrong array size. It must be 4x4");
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("...............");
    }
}
