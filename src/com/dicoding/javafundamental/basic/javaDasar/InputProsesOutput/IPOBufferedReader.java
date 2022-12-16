package com.dicoding.javafundamental.basic.javaDasar.InputProsesOutput;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IPOBufferedReader {
    public static void main(String[] args) {
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        System.out.println("Program penjumlhan sangat sederhana");
        int value = 0;
        int anotherValue = 0;
        try{
            System.out.print("Masukan Angka pertama : ");
            value = Integer.parseInt(bufferedReader.readLine());
            System.out.print("Masukan Angka kedua : ");
            anotherValue = Integer.parseInt(bufferedReader.readLine());

        }catch(IOException e){
            e.printStackTrace();
        }
        int result = value + anotherValue;
        System.out.println("Hasilnya adalah : " + result);

    }

}
