package lesson2;

import java.util.Arrays;

import static lesson2.SumBetween10and20.isSumBetween10and20;
import static lesson2.PositiveOrNegative.isPositiveOrNegative;
import static lesson2.IsNegative.isNegative;
import static lesson2.PrintStringNTimes.printStringNTimes;
import static lesson2.LeapYear.isLeapYear;
import static lesson2.InvertArr.invertArr;
import static lesson2.FillArr.fillArr;
import static lesson2.ChangeBySixArr.changeBySixArr;
import static lesson2.FillDiagArr.fillDiagArr;
import static lesson2.ArrLenInit.arrLenInit;
import static lesson2.ArrLenInit.printArrLenInit;
import static lesson2.ShiftArr.shiftArr;


public class MainClass {
    public static void main(String[] args) {
        /* Task 1: Написать метод, принимающий на вход два целых числа и проверяющий,
        что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
        в противном случае – false.*/
        System.out.println("---------Task 1---------");
        System.out.println(isSumBetween10and20(5, 5));
        System.out.println(isSumBetween10and20(0, 5));
        System.out.println(isSumBetween10and20(25, 5));


        /* Task 2: Написать метод, которому в качестве параметра передается целое число, метод должен
        напечатать в консоль, положительное ли число передали или отрицательное.
        Замечание: ноль считаем положительным числом.*/
        System.out.println("---------Task 2---------");
        isPositiveOrNegative(-1);
        isPositiveOrNegative(0);
        isPositiveOrNegative(1);


        /*Task 3: Написать метод, которому в качестве параметра передается целое число.
        Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
        Замечание: ноль считаем положительным числом.*/
        System.out.println("---------Task 3---------");
        System.out.println(isNegative(-1));
        System.out.println(isNegative(0));
        System.out.println(isNegative(1));


        /*Task 4: Написать метод, которому в качестве аргументов передается строка и число,
        метод должен отпечатать в консоль указанную строку, указанное количество раз*/
        System.out.println("---------Task 4---------");
        printStringNTimes("Text", 5);
        printStringNTimes("Another text", 3);
        printStringNTimes("Never printed text", 0);


        /* Task(*):Написать метод, который определяет, является ли год високосным,
        и возвращает boolean (високосный - true, не високосный - false).
        Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.*/
        System.out.println("---------Task *---------");
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2100));
        System.out.println(isLeapYear(1999));
        System.out.println(isLeapYear(1804));

        /*Task 5: Задать целочисленный массив, состоящий из элементов 0 и 1.
        Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0*/
        System.out.println("---------Task 5---------");
        invertArr();

        /* Task 6: Задать пустой целочисленный массив длиной 100.
        С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100.*/
        System.out.println("---------Task 6---------");
        fillArr();

        /* Task 7: Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
        и числа меньшие 6 умножить на 2 */
        System.out.println("---------Task 7---------");
        changeBySixArr();

        /* Task 8: Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
        если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
        индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n] */
        System.out.println("---------Task 8---------");
        fillDiagArr();

        /* Task 9(*): Написать метод, принимающий на вход два аргумента: len и initialValue,
        и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue*/
        System.out.println("---------Task 9---------");
        printArrLenInit(arrLenInit(3, 5));
        printArrLenInit(arrLenInit(10, 2));
        printArrLenInit(arrLenInit(1, 7));

        /* Task (***): Написать метод, которому на вход подается одномерный массив и число n
        (может быть положительным, или отрицательным), при этом метод должен сместить
        все элементы массива на n позиций. Элементы смещаются циклично.
        Для усложнения задачи нельзя пользоваться вспомогательными массивами.
        Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1]
        при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
        При каком n в какую сторону сдвиг можете выбирать сами. */
        System.out.println("---------Task ***---------");
        System.out.println(Arrays.toString(shiftArr(new int[] {1,2,3,4}, 5)));
        System.out.println(Arrays.toString(shiftArr(new int[] {1,2,3,4}, 4)));
        System.out.println(Arrays.toString(shiftArr(new int[] {1,2,3,4}, -7)));
        System.out.println(Arrays.toString(shiftArr(new int[] {1,2,3}, 2)));
        System.out.println(Arrays.toString(shiftArr(new int[] {1,2,3}, 0)));
        System.out.println(Arrays.toString(shiftArr(new int[] {1,2,3}, -1)));
    }
}
