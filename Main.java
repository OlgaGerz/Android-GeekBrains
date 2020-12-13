package Lesson5HomeWork;

import lesson5.Cat;

public class Main {
public static void main (String[] args) {

    Employee employee1 = new Employee("Иван Иванович Иванов","Начальник", "ivanov@mail.ru", "+75674563423", 123566, 67);
    Employee employee2 = new Employee("Вероника Владимировна Сидорова", "Заместитель начальника", "sidorova@mail.ru", "+74561238945", 100456, 50);
    Employee employee3 = new Employee("Дмитрий Сергеевич Петров", "Главный специалист", "petrov@mail.ru", "+73452345678", 98567, 42);
    Employee employee4 = new Employee("Мария Ивановна Данилова", "Ведущий специалист", "danilova@mail.ru", "+78964534567", 90567, 35);
    Employee employee5 = new Employee("Сергей Олегович Костин", "Специалист", "kostin@mail.ru", "+78456335678", 50000, 25);


    Employee[] employees = {employee1, employee2, employee3, employee4, employee5};



for (Employee employee : employees) {
    if (employee.getAge() > 40) {
        employee.printInfo();
    }

}


}
}
