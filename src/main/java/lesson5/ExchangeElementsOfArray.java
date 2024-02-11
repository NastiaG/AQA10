package lesson5;

public class ExchangeElementsOfArray {
    public static <T> void exchangeElementsOfArray(T[] arr, int index1, int index2) {
        T temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
