package com.google.rw.danielly.test;

import com.google.rw.danielly.dominio.Animal;

public class Gato {
    public static void main(String[] args) {

        Animal gato = new Animal();

        gato.nome = "Minerva";
        gato.raca = "Siamês";
        gato.caminha = 17;

        gato.mia();

    }
}
