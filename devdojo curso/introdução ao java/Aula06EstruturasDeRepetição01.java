package com.google.rw.introducao;

public class Aula06EstruturasDeRepetição01 {
    public static void main(String[] args) {
        //while, do while, for

        int count = 0;
        int i;

        while(count < 10){
            System.out.println("While: "+count);
            count++;
        }
        count = 0;

        do{ //o do while sera executado pelo menos uma vez, é a unica coisa que o difere do while
            System.out.println("Dentro do do-while: "+count);
            count++;

        } while(count < 10);

        for (i=0; i<10; i++){
            System.out.println("For: "+i);
        }
    }
}
