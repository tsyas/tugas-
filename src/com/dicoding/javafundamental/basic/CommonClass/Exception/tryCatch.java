package com.dicoding.javafundamental.basic.CommonClass.Exception;

import java.io.FileReader;
import java.io.File;


public class tryCatch {
    public static void main(String[] args) {
        try {
            String location = "D://namafile.txt";
            File file = new File(location);
            FileReader fr = new FileReader(file);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
