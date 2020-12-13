package Lesson5HomeWork;

public class Employee {

    protected String name;
    protected String position;
    protected String email;
    protected String phoneNumber;
    protected int salary;
    public int age;


    public Employee(String name, String position, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;

        // System.out.println("ФИО: " + name + "Должность: " + position + "e-mail: " + email + "Номер телефона: " + phoneNumber + "Оклад: " + salary + "Возраст: " + age);
    }


    public int getAge() {
        return age;
        }
       public void printInfo() {
        System.out.println(name + position + email + phoneNumber + salary + age);
       }
}
