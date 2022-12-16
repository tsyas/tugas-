package com.dicoding.javafundamental.basic.CommonClass.DateTime;

import java.util.Calendar;

public class Calendarr {
    public static void main(String[] args) {

        // Menampilkan waktu sekarang
        Calendar calendar = Calendar.getInstance();
        System.out.println("Waktu sekarang adalah " + calendar.getTime());
    }
}
