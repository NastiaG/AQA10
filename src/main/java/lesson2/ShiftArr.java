/* Task (***): Написать метод, которому на вход подается одномерный массив и число n
        (может быть положительным, или отрицательным), при этом метод должен сместить
        все элементы массива на n позиций. Элементы смещаются циклично.
        Для усложнения задачи нельзя пользоваться вспомогательными массивами.
        Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1]
        при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
        При каком n в какую сторону сдвиг можете выбирать сами. */

package lesson2;


public class ShiftArr {
    public static int[] shiftArr (int[] arr, int n) {
        int qShift = n % arr.length;
        if (n > 0) {
            for (int i = 0; i < qShift; i++) {
                arr = shiftRight(arr);
            }
        } else if (n < 0) {
            for (int i = 0; i < -qShift; i++) {
                arr = shiftLeft(arr);
            }
        }
        return arr;
    }

    public static int[] shiftRight (int[] arr) {
        int length = arr.length;
        int temp = arr[length - 1];
        for (int i = length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        return arr;
    }

    public static int[] shiftLeft (int[] arr) {
        int length = arr.length;
        int temp = arr[0];
        for (int i = 0; i < length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[length - 1] = temp;
        return arr;
    }
}
