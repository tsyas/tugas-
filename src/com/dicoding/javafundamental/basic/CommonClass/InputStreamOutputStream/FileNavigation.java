package com.dicoding.javafundamental.basic.CommonClass.InputStreamOutputStream;

import java.io.File;

public class FileNavigation {
    public static void main(String[] args) {
        String dirname = "/java/latihan1";
        File file = new File(dirname);
        // Buat directory
        file.mkdirs();
    }
}
