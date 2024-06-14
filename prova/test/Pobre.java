package com.google.rw.danielly.test;

import com.google.rw.danielly.dominio.Pessoa;

public class Pobre {
    public static void main(String[] args) {

        Pessoa pobre = new Pessoa();

        pobre.nome = "Rodrigo Veríssimo";
        pobre.idade = 20;
        pobre.trabalha();
    }
}
