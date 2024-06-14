package com.google.rw.javacore.Bintroducaometodos.test;


import com.google.rw.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        int[] vetor = {3, 5, 7, 8, 10};
        calculadora.somaArray(vetor);
        calculadora.somaVarArgs(1,3,5,6,1,2,3,4,5,1);
    }
}
