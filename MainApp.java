package ru.geekbrains.lesson1;

public class MainApp {

    public static void main(String[] args) {
 getResult();
 sum(2,7);
 numberSim(-65);
 aAndB(5,8);
 hello("Ольга");


    }
//Задание 2
    byte varA =-18;
    short varB = 15467;
    int varC = 234567;
    long varD = 3400000000000L;
    float varE = 23.34f;
    double varF = 243.234;
    char varG = '\u2334';
    boolean varJ = true;

    //Задание 3
    public static float getResult()  {
       float a = 2.3f;
       float b = 2.4f;
       float c = 3.4f;
       float d = 3.5f;

       float result =  (a * (b + (c / d)));
       System.out.println(result);
        return result;
    }

  // Задание 4
   public static boolean sum(int a, int b) {
    int c = a + b;
    if (c >= 10 && c <= 20) {
        System.out.println(true);
        return true;
        }  else {
        System.out.println(false);
        return false;
    }
    }
// задание 5
public static int numberSim(int varA) {
    if (varA < 0) {
        System.out.println(varA + " - отрицательное число");
        return varA;
    } else {
        System.out.println(varA + " - положительное число");
        }
    return varA;
}
//Задание 6
public static boolean aAndB(int a, int b) {
        if (a < 0) {
            System.out.println(true);
            return true;
    } else {
        System.out.println(false);
            return false;
    }
    }


// Задание 7
    public static void hello(String name) {
        System.out.println("Привет " + name);

    }

}

