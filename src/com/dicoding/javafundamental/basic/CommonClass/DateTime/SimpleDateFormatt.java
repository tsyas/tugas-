package com.dicoding.javafundamental.basic.CommonClass.DateTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatt {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
        String dateFormated = sdf.format(new Date());
        System.out.println("Format tanggal default : " + new Date());
        System.out.println("Format tanggal dengan format : " + dateFormated);
    }
}
