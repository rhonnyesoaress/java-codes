package com.google.rw.javacore.Bintroducaometodos.test;

import com.google.rw.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        double result = calculadora.divideDoisNumeros02(20, 2);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros02(20,2));
        System.out.println("----------");
        //System.out.println(calculadora.imprimeDivisaoDeDoisNumeros()); precisa tirar do sout pois o sout precisa de algo pra imprimir no console
                                                                        // o proprio metodo ja possui um sout
        calculadora.imprimeDivisaoDeDoisNumeros(86,5);
    }
}
