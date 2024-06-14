package com.google.rw.danielly.test;

import com.google.rw.danielly.dominio.Pessoa;

import java.util.Scanner;

public class Rico {
    public static void main(String[] args) {

        Pessoa rico = new Pessoa();
        Scanner sc = new Scanner(System.in);
        System.out.println("Quanto tem na sua conta bancária?");
        double dinheiro = sc.nextDouble();

        rico.nome = "Frank";
        rico.idade = 15;
        rico.fazCompras(dinheiro);
    }
}
