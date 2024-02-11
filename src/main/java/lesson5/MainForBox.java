/*     2. Задача:
        1. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
        2. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
        3. Для хранения фруктов внутри коробки можно использовать ArrayList;
        4. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
        5. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
        6. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами. Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
        7. Не забываем про метод добавления фрукта в коробку.
*/

package lesson5;

import java.util.List;

public class MainForBox {
    public static void main(String[] args) {

        Box<Apple> boxOfApples1 = new Box<>();
        Box<Apple> boxOfApples2 = new Box<>();
        Box<Orange> boxOfOranges1 = new Box<>();
        Box<Orange> boxOfOranges2 = new Box<>();

        boxOfApples1.addFruit(new Apple());
        boxOfApples1.addFruit(new Apple());
        boxOfApples1.addFruit(new Apple());

        boxOfApples2.addFruit(new Apple());
        boxOfApples2.addFruit(new Apple());
        boxOfApples2.addFruit(new Apple());
        boxOfApples2.addFruit(new Apple());

        boxOfOranges1.addFruit(new Orange());
        boxOfOranges1.addFruit(new Orange());

        boxOfOranges2.addFruit(new Orange());
        boxOfOranges2.addFruit(new Orange());
        boxOfOranges2.addFruit(new Orange());
        boxOfOranges2.addFruit(new Orange());
        boxOfOranges2.addFruit(new Orange());


        System.out.println("The weight of boxOfApples1 is: " + boxOfApples1.getSumWeight());
        System.out.println("The weight of boxOfApples2 is: " + boxOfApples2.getSumWeight());
        System.out.println("The weight of boxOfOranges1 is: " + boxOfOranges1.getSumWeight());
        System.out.println("The weight of boxOfOranges2 is: " + boxOfOranges2.getSumWeight());
        System.out.println("................");

        System.out.println(boxOfApples1.compare(boxOfApples2));
        System.out.println(boxOfApples1.compare(boxOfOranges1));
        System.out.println(boxOfOranges1.compare(boxOfOranges2));
        System.out.println("................");

        boxOfApples1.pourOut(boxOfApples2);
        boxOfOranges2.pourOut(boxOfOranges1);
        //boxOfApples1.pourOut(boxOfOranges1); - incompatible types

        System.out.println("The weights after the pouring out: ");
        System.out.println("The weight of boxOfApples1 is: " + boxOfApples1.getSumWeight());
        System.out.println("The weight of boxOfApples2 is: " + boxOfApples2.getSumWeight());
        System.out.println("The weight of boxOfOranges1 is: " + boxOfOranges1.getSumWeight());
        System.out.println("The weight of boxOfOranges2 is: " + boxOfOranges2.getSumWeight());
    }
}
