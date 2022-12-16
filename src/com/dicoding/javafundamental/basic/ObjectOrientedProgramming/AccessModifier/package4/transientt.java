package com.dicoding.javafundamental.basic.ObjectOrientedProgramming.AccessModifier.package4;

import java.io.Serializable;

public class transientt {
   // Transient memiliki hubungan dengan proses serialisasi (serializing).
   // Serialisasi adalah proses konversi suatu objek menjadi byte agar dapat ditransmisikan.

  //  Variabel yang dideklarasikan sebagai transient maka akan tidak dijaga nilainya
  //  di dalam proses serialisasi.Contoh penggunaannya adalah seperti ini
    class Test implements Serializable {

        // Variabel ini tidak akan dijaga nilainya
        transient int nilaiA;

        // Variabel ini akan dijaga nilainya
        double nilaiB;
        String nilaiC;

    }
}
