package com.google.rw.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float, e double = 0
        // char '\u0000' ' '
        // boolean false                                    PADROES DE INICIALIZAÇÃO DOS TIPOS DE VARIAVEL
        // String null

        String[] name = new String[4];
        int i;

        name[0] = "LORDzERA";
        name[1] = "netera1 -aa-";
        name[2] = "galb1er -aa-";
        name[3] = "EBSM";


        for(i=0; i < name.length; i++){
            System.out.println("Name: "+name[i]);
        }

    }
}
