/* Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа). */

package lesson5;

import lesson4.Cat;

import java.util.Arrays;

import static lesson5.ExchangeElementsOfArray.exchangeElementsOfArray;

public class MainForExchangeElementsOfArray {
    public static void main(String[] args) {
        String[] stringArr = {"text0", "text1", "text2", "text3"};
        exchangeElementsOfArray(stringArr, 0, 2);
        System.out.println(Arrays.toString(stringArr));

        Integer[] intArr = {0,1,2,3};
        exchangeElementsOfArray(intArr, 1, 3);
        System.out.println(Arrays.toString(intArr));
    }
}
