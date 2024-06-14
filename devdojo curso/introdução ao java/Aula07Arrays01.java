package com.google.rw.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {

        //em arrays, as variaveis sao do tipo reference

        int [] age = new int[3]; // somente tipos de variaveis de referencia podem ser inicializadas com null

        age[0] = 21;
        age[1] = 15;
        age[2] = 11;

        System.out.println("Idade: "+age[0]);
        System.out.println("Idade: "+age[1]);
        System.out.println("Idade: "+age[2]);
    }
}
