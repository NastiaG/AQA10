// 4. Создать массив из 5 сотрудников.

package lesson3;

public class ListOfEmployees {
    public static Employee[] listOfEmployees() {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Ivanov Ivan Ivanovich", "Sales manager", "saleman@gmail.com", "123456789", 20000, 20);
        employeeArray[1] = new Employee("Petrov Piotr Petrovich", "Engineer", "engin@gmail.com", "234567891", 25000, 41);
        employeeArray[2] = new Employee("Anina Anna Janinovna", "Soft Developer", "softdev@gmail.com", "345678912", 30000, 39);
        employeeArray[3] = new Employee("Olina Olga Olegovna", "QA Engineer", "qaengin@gmail.com", "456789123", 25000, 55);
        employeeArray[4] = new Employee("Alexandrova Alexandra Alexandrovna", "Designer", "design@gmail.com", "567891234", 25000, 40);
        return employeeArray;
    }





}
