package com.dicoding.javafundamental.basic.CommonClass.DateTime;

import java.util.Calendar;

public class SplitCalendarr {
    public static void main(String[] args) {
        // Menampilkan waktu sekarang
        Calendar calendar = Calendar.getInstance();
        System.out.println("Waktu sekarang adalah " + calendar.getTime());
        // menampilkan spesifik waktu yang diinginkan
        System.out.println("Tanggal : " + calendar.get(Calendar.DATE));
        System.out.println("Bulan   : " + calendar.get(Calendar.MONTH));
        System.out.println("Tahun   : " + calendar.get(Calendar.YEAR));
    }
}
