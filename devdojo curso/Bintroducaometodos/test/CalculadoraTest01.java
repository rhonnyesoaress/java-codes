package com.google.rw.javacore.Bintroducaometodos.test;

import com.google.rw.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando Metodo 1 CalculadoraTest01");
        calculadora.subtraiDoisNumeros();
    }
}
