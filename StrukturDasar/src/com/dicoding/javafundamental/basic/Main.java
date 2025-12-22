package com.dicoding.javafundamental.basic;

import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;

import com.dicoding.javafundamental.basic.kendaraan.*;
import com.dicoding.javafundamental.basic.music.Gitar;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Gitar.bunyi();

        Mobil.tampilkanJumlahBan();
        Motor.tampilkanJumlahBan();
        Kereta.tampilkanJumlahBan();

        Date today = new Date();
        System.out.println("Hari ini = " + today);
        Date tomorrow = new DateUtils().addDays(today, 1);
        System.out.println("Besok = " + tomorrow);
    }
}
