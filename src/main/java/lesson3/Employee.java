/*  1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
    2. Конструктор класса должен заполнять эти поля при создании объекта.
    3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.*/

package lesson3;

public class Employee {
    public String fio;
    public String position;
    public String email;
    public String phoneNumber;
    public int salary;
    public int age;

    public Employee(String fio, String position, String email, String phoneNumber, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void getInfo() {
        System.out.println();
        System.out.println("FIO of the Employee is: " + fio);
        System.out.println("Position of the Employee is: " + position);
        System.out.println("Email of the Employee is: " + email);
        System.out.println("Phone number of the Employee is: " + phoneNumber);
        System.out.println("Salary of the Employee is: " + salary);
        System.out.println("Age of the Employee is: " + age);
    }
}
