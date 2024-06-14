package com.google.rw.introducao;

public class Aula06EstruturasDeRepetição03 {
    public static void main(String[] args) {
        // Imprima os primeiros 25 numeros de um dado valor. Por exemplo: 50.

        int i;

        for(i=0; i <= 50; i++){
            if(i > 25) {
                break;
            }
            System.out.println(i);
        }

    }
}
