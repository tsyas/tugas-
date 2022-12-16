package com.dicoding.javafundamental.basic.javaDasar.Array;

public class multidimensionalArr {
    public static void main (String[] args) {
      char[][] arrChar = new char[2][];
      arrChar[0] = new char[2];
      arrChar[1] = new char[3];

      // Dimensi 1 yang indeksnya 0 memiliki panjang elemen 2
      arrChar[0][0] = 'a';
      arrChar[0][1] = 'b';

      // Dimensi 1 yang indeksnya 1 memiliki panjang elemen 3
      arrChar[1][0] = 'c';
      arrChar[1][1] = 'd';
      arrChar[1][2] = 'e';

      // Tampilkan semua data dari dimensi 1 yang memiliki indeks 0
        System.out.println("Dimensi 1 dengan indeks 0 dan Dimensi 2 dengan indeks 0 : " + arrChar[0][0]);
        System.out.println("Dimensi 1 dengan indeks 0 dan Dimensi 2 dengan indeks 1 : " + arrChar[0][1]);
      // Tampilkan semua data dari dimensi 1 yang memiliki indeks 1
        System.out.println("Dimensi 1 dengan indeks 1 dan Dimensi 2 dengan indeks 0 : " + arrChar[1][0]);
        System.out.println("Dimensi 1 dengan indeks 1 dan Dimensi 2 dengan indeks 1 : " + arrChar[1][1]);
        System.out.println("Dimensi 1 dengan indeks 1 dan Dimensi 2 dengan indeks 2 : " + arrChar[1][2]);
    }

}

