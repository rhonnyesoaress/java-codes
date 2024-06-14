package com.google.rw.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    // Nao é uma boa pratica ter um metodo com mais de dois argumentos
    public void somaDoisNumeros(){ //Metodo = Fu    nção

        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros(){

        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int num1, float num2){

        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2){
        if (num2 == 0){
            return 0;
        }
        return num1/num2;
    }

    public double divideDoisNumeros02(double num1, double num2){
        if (num2 != 0){
            return num1/num2;   // Outra forma de fazer
        }
        return 0;
    }

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2){
        if(num2 == 0){
            System.out.println("Nao existe divisão por 0");
        }else{
            System.out.println(num1/num2);
        }
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;

        System.out.println("Dentro do método alteraDoisNumeros");
        System.out.println("Num1: "+num1);
        System.out.println("Num2: "+num2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
            for (int i: numeros){
                soma += i;
          }

        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
            for (int i: numeros){
                soma += i;
            }

        System.out.println(soma);
    }

}
