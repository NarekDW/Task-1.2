package ru.training.intro.second;

/**
 * Created by Narek on 11.12.2016.
 */
public class Main {
    public static void main(String[] args){
        MathSequence sequence=new MathSequence();
        sequence.setEpsilan(0.001);
        sequence.checkSequence();
    }
}
