package com.google.rw.javacore.Bintroducaometodos.test;

import com.google.rw.javacore.Bintroducaometodos.dominio.Estudante;
import com.google.rw.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.name = "Maria Luiza de Melo";
        estudante01.age = 19;
        estudante01.sex = 'F';

        estudante02.name = "Clarice Bento de Oliveira";
        estudante02.age = 17;
        estudante02.sex = 'F';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);



    }
}
