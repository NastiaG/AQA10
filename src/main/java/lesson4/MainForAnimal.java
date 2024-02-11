/* 1. Создать классы Собака и Кот с наследованием от класса Животное.
   2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
   Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
   3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать,
   собака 10 м.).
   4. * Добавить подсчет созданных котов, собак и животных.
   5. Расширить задачу про котов и тарелки с едой, выполнив следующие пункты:
   •  Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
   •  Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
   • Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
   • Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
   • Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку. */


package lesson4;

import static lesson4.ArrayOfCats.arrayOfCats;
import static lesson4.EatingCats.eatingCats;

public class MainForAnimal {
    public static void main(String[] args) {

        // Tests for tasks 1-4
        Dog dog1 = new Dog("Tuzik");
        dog1.run(501);
        dog1.run(500);
        dog1.run(-1);
        dog1.swim(10);
        dog1.swim(11);
        dog1.swim(-1);

        Cat[] arrSportCats = arrayOfCats();
        arrSportCats[0].run(200);
        arrSportCats[1].run(201);
        arrSportCats[2].run(-1);
        arrSportCats[0].swim(15);
        arrSportCats[1].swim(-1);
        arrSportCats[2].swim(0);

        System.out.println();
        System.out.println("The total amount of created animals is " + Animal.count);
        System.out.println("The total amount of created cats is " + Cat.count);
        System.out.println("The total amount of created dogs is " + Dog.count);

        // Test for task 5
        System.out.println("..................");
        eatingCats();
    }
}
