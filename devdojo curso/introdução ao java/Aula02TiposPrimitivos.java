package com.google.rw.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args){ //psvm+tab faz essa linha
        // int, float, double, char, byte, short, long, boolean
        int age = 10;
        long largeNumber = 100000;
        double moneyDouble = 2000;
        float salarioFLoat = 2500.0F; //cast é forçar um tipo primitivo maior caber em um menor float salarioFloat = (float) 2500.0D
                                        //importante colocar o F depois do float
        byte ageByte = 10;
        short ageShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char character = 'R';
        String name = "lordzera";

        System.out.println("daddy age: "+age+" so young");
        System.out.println(verdadeiro);
        System.out.println(character); //sout  + tab faz essa linha
        System.out.println("cs player: "+name);

    }
}
