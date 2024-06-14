package com.google.rw.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {

        int[] number = new int[3];
        int[] number2 = {1, 2, 3, 4, 5};        // TIPOS DE INICIALIZAÇÃO DE ARRAYS
        int[] number3 = new int[]{1, 2, 3, 4, 5};


        //for(int i=0; i < number2.length; i++){
        // System.out.println(number2[i]);
        // }

        for (int i : number3) {
            System.out.println(i);          //TIPO DE SINTAXE DE FOR QUE NAO ACESSA O INDICE

        }
    }
}
