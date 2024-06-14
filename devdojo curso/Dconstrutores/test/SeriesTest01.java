package com.google.rw.javacore.Dconstrutores.test;

import com.google.rw.javacore.Dconstrutores.dominio.Series;

public class SeriesTest01 {
    public static void main(String[] args) {

        Series series = new Series("Stranger Things", "Aventura", 36, 2014);
        Series series2 = new Series();
        series.imprime();
        series2.imprime();

    }
}
