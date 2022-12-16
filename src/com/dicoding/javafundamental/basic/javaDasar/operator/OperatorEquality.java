package com.dicoding.javafundamental.basic.javaDasar.operator;
//anastasya sabrina 2602174623
public class OperatorEquality {
    public static void main (String[] args) {
        int value = 5;
        int anotherValue = 4;
        boolean result;
        result = value == anotherValue;

        System.out.println("Hasil 'value == anotherValue' adalah" + result);
        System.out.println();

        System.out.println("Lebih besar dari..");
        result = value > anotherValue;
        System.out.println(" Hasil 'value > anotherValue' adalah" + result);
        System.out.println();

        System.out.println(" Sama atau lebih besar dari..");
        result = value >= anotherValue;
        System.out.println("Hasil 'value >= anotherValue' adalah" + result);
        System.out.println();

        System.out.println("Kurang dari..");
        result = value < anotherValue;
        System.out.println("Hasil 'value < anotherValue' adalah" + result);
        System.out.println();

        System.out.println("Sama atau kurang dari dengan..");
        result = value <= anotherValue;
        System.out.println("Hasil 'result <= anotherValue' adalah" + result);
        System.out.println();
    }
}
