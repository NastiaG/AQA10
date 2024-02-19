/*
    1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
    Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
    Посчитать, сколько раз встречается каждое слово. (ListOfWords)
    2. Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
    В этот телефонный справочник с помощью метода add() можно добавлять записи,
    а с помощью метода get() искать номер телефона по фамилии.
    Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
    тогда при запросе такой фамилии должны выводиться. (PhoneBook)
*/

package lesson8;

import java.util.List;
import java.util.Set;

import static lesson8.ListOfWords.*;


public class MainForCollections {
    public static void main(String[] args) {
        List<String> testInitialListOfWords = initialListOfWords();
        Set<String> testListOfUniqueWords = listOfUniqueWords(testInitialListOfWords);

        System.out.println("The initial list of words:");
        System.out.println(testInitialListOfWords);
        System.out.println("The result list of unique words:");
        System.out.println(testListOfUniqueWords);
        System.out.println("Frequency of every word: " + frequencyOfWords(testListOfUniqueWords, testInitialListOfWords));
        System.out.println("..................");


        PhoneBook testPhoneBook = new PhoneBook();
        testPhoneBook.add(123456789, "Thompson");
        testPhoneBook.add(912345678, "Dickens");
        testPhoneBook.add(123456789, "Thompson");
        testPhoneBook.add(891234567, "Rid");
        testPhoneBook.add(789123456, "Johnson");
        testPhoneBook.add(678912345, "Austen");
        testPhoneBook.add(567891234, "Fleming");
        testPhoneBook.add(456789123, "Thompson");
        testPhoneBook.add(345678912, "Thompson");
        testPhoneBook.add(234567891, "Johnson");
        testPhoneBook.add(123456780, "Rid");
        testPhoneBook.add(123456700, "Dickens");
        testPhoneBook.add(123456000, "Doyle");

        System.out.println("PhoneBook:");
        System.out.println(testPhoneBook.getPhoneBook());
        System.out.println("The result of searching phones by a surname");
        System.out.println("Number(s) for Rid: " + testPhoneBook.get("Rid"));
        System.out.println("Number(s) for Fleming: " + testPhoneBook.get("Fleming"));
        System.out.println("Number(s) for Thompson: " + testPhoneBook.get("Thompson"));
    }
}
