package com.google.rw.javacore.Bintroducaometodos.test;

import com.google.rw.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.name = "Henia";
        estudante01.age = 19;
        estudante01.sex = 'F';
        estudante02.name = "Vanessa";
        estudante02.age = 19;
        estudante02.sex = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}
