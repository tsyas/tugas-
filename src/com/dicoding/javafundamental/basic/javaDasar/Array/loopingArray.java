package com.dicoding.javafundamental.basic.javaDasar.Array;

public class loopingArray {
    public static void main(String [] args){
        int[] arrInt = new int[100];

        for (int x = 0; x < arrInt.length; x++) {
            arrInt[x] = x + 1;
            System.out.println(arrInt[x]);
        }
    }
}
