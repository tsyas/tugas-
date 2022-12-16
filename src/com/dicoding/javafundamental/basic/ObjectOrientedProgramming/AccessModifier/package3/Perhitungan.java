package com.dicoding.javafundamental.basic.ObjectOrientedProgramming.AccessModifier.package3;

public class Perhitungan {
    public static int nilai = 0;

    protected static int getNilai(){
      return nilai;
    }

    Perhitungan(){
        nilai++;
    }
}
