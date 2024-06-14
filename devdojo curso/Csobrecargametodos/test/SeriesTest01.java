package com.google.rw.javacore.Csobrecargametodos.test;

import com.google.rw.javacore.Csobrecargametodos.dominio.Series;

public class SeriesTest01 {
    public static void main(String[] args) {

        Series series = new Series();

        series.init2("Stranger Things", "Aventura", 35, 2014);
        series.setAno(2014);
        series.imprime();

    }
}
