package ru.training.intro.second;

import static java.lang.Math.pow;

/**
 * Created by Narek on 11.12.2016.
 */
class MathSequence {
    /*Переменная epsilan - окрестность последовательности,
    * где выполняется условие М: 1/(1+i)^2
    * */
    private double epsilan;

    protected MathSequence(double epsilan){
        this.epsilan=epsilan;
    }

    /*Метод возвращающий индекс элемента
    * при котором выполняется условие M*/
    protected int checkSequence(){
        int i=1;    // индекс при a
        while(!M(i)){
            ++i;
        }
        printResult(i, epsilan); // Вывод результата
        return i;
    }

    /*Метод, последовательно проверяющий истинность
    * условия i-го элемента, при котором a<epsilan */
    private boolean M(int i){
        boolean condition=false; // condition - состояние условия неравенста
        double a=(1/pow((1+i), 2)); // a - значение i-ой последовательности
        if (a < epsilan) condition = true;

        print(i, a); // Вывод номера последовательности и его значения
        return condition;
    }

    private static void print(int i, double a){
        System.out.printf("i =%3d : a = %7.6f%n", i, a);
    }

    private static void printResult(int i, double epsilan){
        System.out.println("\nПри i = "+i+" выполняется условие М: a<epsilan" +
                "\nГде epsilan = "+epsilan);
    }
}
