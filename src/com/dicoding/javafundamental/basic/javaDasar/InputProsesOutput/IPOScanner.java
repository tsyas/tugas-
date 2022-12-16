package com.dicoding.javafundamental.basic.javaDasar.InputProsesOutput;

import java.util.Scanner;

public class IPOScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program penjumlahan sangat sederhana ");
        System.out.print("Masukan angka pertama : ");
        int value = scanner.nextInt();
        System.out.print("masukan angka kedua : ");
        int anotherValue = scanner.nextInt();
        int result = value + anotherValue;
        System.out.println("Hasilnya adalah :" + result);
    }
}
