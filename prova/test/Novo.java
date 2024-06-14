package com.google.rw.danielly.test;

import com.google.rw.danielly.dominio.Imovel;

import java.util.Scanner;

public class Novo {
    public static void main(String[] args) {

        Imovel Novo = new Imovel();
        Scanner sc = new Scanner(System.in);
        double valorImovel;

        System.out.println("Em quanto está avaliado o seu imóvel?");
        valorImovel = sc.nextDouble();

        Novo.imovelNovo(valorImovel);


    }
}
