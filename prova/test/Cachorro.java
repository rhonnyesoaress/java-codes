package com.google.rw.danielly.test;

import com.google.rw.danielly.dominio.Animal;

public class Cachorro {
    public static void main(String[] args) {

        Animal cachorro = new Animal();

        cachorro.nome = "Groot";
        cachorro.raca = "Salsicha";
        cachorro.caminha = 13;

        cachorro.late();
    }
}
