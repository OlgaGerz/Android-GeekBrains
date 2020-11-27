package ru.geekbrains.lesson2;
import java.util.Arrays;
public class MainApp {
    public static void main(String[] args) {
        changeSimbols();
        fullMass();
        multiplyNumbers();
        doubleMassiv();
        getMinAndMax();

    }
    // Задание 1

    public static void changeSimbols() {
        int[] simbols = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < simbols.length; i++) {
            if (simbols[i] == 1) {
                simbols[i] = 0;
            } else {
                simbols[i] = 1;
            }
            System.out.println(simbols[i]);
        }

    }
//задание 2

    public static void fullMass() {
        int[] massiv = new int[8];
        int value = 0;
        for (int i = 0; i <= massiv.length; i++) {
            massiv[i] = value;
            value += 3;
            System.out.println(massiv[i]);
        }
    }

    // задание 3
    public static void multiplyNumbers() {
        int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 6) {
                numbers[i] = numbers[i] * 2;
            }
            System.out.println(numbers[i]);
        }
    }
// задание 4

    public static void doubleMassiv() {
        int[][] massiv = new int[4][4];
        int n = 0;
        for (int i = 0; i < massiv.length; i++) {
            for (int j = 0; j < massiv[i].length; j++) {
                massiv[0][0] = 1;
                massiv[1][1] = 1;
                massiv[2][2] = 1;
                massiv[3][0] = 1;
                massiv[2][1] = 1;
                massiv[1][2] = 1;
                massiv[0][3] = 1;
                massiv[3][3] = 1;
                massiv[i][j] = n;
            }
        }
        for (int i = 0; i < massiv.length; i++) {
            for (int j = 0; j < massiv[i].length; j++) {
                System.out.printf("%d ", massiv[i][j]);
            }
            System.out.println();
        }
    }
    // Задание 5

    public static void getMinAndMax() {
        int[] numbers = {3, 67, 1, 34, 6};

        int numberMax = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= numberMax)
                numberMax = numbers[i];
        }
        System.out.println("Максимальное число: " + numberMax);

        int numberMin = numbers[0];
        for (int i = 0  ; i < numbers.length; i++) {
            if (numbers[i] <= numberMin) ;
            numberMin = numbers[i];
        }
        System.out.println("Минимальное число: " + numberMin);
    }
    }





