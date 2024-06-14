package com.google.rw.javacore.Aintroducaoclasses.test;

import com.google.rw.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.nome = "M4";
        carro01.modelo = "BMW";
        carro01.ano = 2023;

        carro02.nome = "Corolla";
        carro02.modelo = "Hyundai";
        carro02.ano = 2023;

        // caso queira que eles façam referencia para o mesmo objeto, basta atribuir valor.
        // carro01 = carro02, eles fariam referencia para o mesmo objeto e imprimiriam todos os valores do carro02.

        System.out.println("Carro 1");
        System.out.println("Nome: "+carro01.nome);
        System.out.println("Modelo: "+carro01.modelo);
        System.out.println("Ano: "+carro01.ano+"\n");
        System.out.println("_______________");
        System.out.println("\nCarro 2");
        System.out.println("Nome: "+carro02.nome);
        System.out.println("Ano: "+carro02.ano);
        System.out.println("Modelo: "+carro02.modelo);

    }
}
