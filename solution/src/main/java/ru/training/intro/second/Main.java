package ru.training.intro.second;

import java.util.Scanner;

/**
 * Created by Narek on 11.12.2016.
 */
public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        MathSequence sequence=new MathSequence();
        sequence.setEpsilan(getEpsilan());
        sequence.checkSequence();
    }

    private static double getEpsilan(){
        System.out.println("Задайте эпсилан:");
        return scan.nextDouble();
    }
}
