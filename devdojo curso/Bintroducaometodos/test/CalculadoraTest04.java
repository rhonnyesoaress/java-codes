package com.google.rw.javacore.Bintroducaometodos.test;

import com.google.rw.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        int num1 = 10;
        int num2 = 20;

        calculadora.alteraDoisNumeros(num1, num2);

        System.out.println("Dentro do CalculadoraTest04");
        System.out.println("Num1: "+num1);
        System.out.println("Num2: "+num2);

    }
}
