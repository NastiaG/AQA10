// 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.

package lesson3;

import static lesson3.ListOfEmployees.listOfEmployees;

public class SortByAge {
    public static void sortByAge() {
        Employee[] arr = listOfEmployees();
        for(int i = 0; i < arr.length; i++) {
            if (arr[i].age > 40) {
                arr[i].getInfo();
            }
        }
    }
}
