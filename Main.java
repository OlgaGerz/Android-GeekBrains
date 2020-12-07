package ru.geekbrains;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a = 0;
        int b = 9;
        int randomNumber = a + (int) (Math.random() * b);


        System.out.println("Угадайте число от 0 до 9 ");


        int userCounter = 3;
        int userNumber = getUserNumber();
        while (userCounter != 0) {
            System.out.println("Угадайте число от 0 до 9 ");
        }
        for (int i = 3; i < 3; i--) {
            System.out.println("У вас осталось попыток: " + i);
            if (randomNumber == userNumber) {
                System.out.println("Вы угадали!/n Повторить игру еще раз? 1 - да / 0 - нет");
                break;
            } else if (randomNumber < userNumber) {
                System.out.println("Ваше число больше, чем нужно. У вас осталось попыток: " + userCounter);
                userCounter--;
                continue;
            } else if (randomNumber > userNumber) {
                System.out.println("Ваше число меньше, чем нужно. У вас осталось попыток: " + userCounter);
                userCounter--;
                continue;
            }

        }
    }

    private static int getUserNumber() {
        Scanner number = new Scanner(System.in);
        int userNumber = number.nextInt();
        return userNumber;
    }
}





