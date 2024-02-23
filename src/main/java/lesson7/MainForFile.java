/*
    1. Реализовать сохранение данных в csv файл;
    2. Реализовать загрузку данных из csv файла. Файл читается целиком.

    Структура csv файла:
    Строка заголовок с набором столбцов
    Набор строк с целочисленными значениями
    Разделитель между столбцами - символ точка с запятой (;)

    Пример:
    Value 1;Value 2;Value 3
    100;200;123
    300;400;500

    Для хранения данных использовать класс вида:
    public class AppData {
        private String[] header;
        private int[][] data;
        // ...
    }

    Если выполняется save(AppData data), то старые данные в файле полностью перезаписываются.
*/

package lesson7;

import java.io.IOException;

import static lesson7.Load.load;
import static lesson7.Save.save;


public class MainForFile {
    public static void main(String[] args) {
        String[] testHeader = {"Value 1","Value 2","Value 3"};
        int[][] testData = {
                {100,200,123},
                {300,400,500}
        };

        String fileName = "table.csv";

        AppData testTable = new AppData();

        testTable.setHeader(testHeader);
        testTable.setData(testData);


        try {
            save(testTable, fileName);
            System.out.println("Data successfully saved to file " + fileName);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            AppData appDataRead = load(fileName, testData.length, testData[0].length);

            System.out.println("\nData read from file:");
            System.out.println(appDataRead);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}