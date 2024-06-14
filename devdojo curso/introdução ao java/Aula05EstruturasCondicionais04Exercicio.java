package com.google.rw.introducao;

public class Aula05EstruturasCondicionais04Exercicio {
    public static void main(String[] args) {

        float salario = 70000F;
        double taxa = 0;
        double primeiraFaixa = 9.70/100;
        double segundaFaixa = 37.35/100;
        double terceiraFaixa = 49.50/100;

        if(salario > 0 && salario <= 34712){
            taxa = salario * primeiraFaixa;
        }else if(salario >= 34713 && salario < 68508){
            taxa = salario * segundaFaixa;
        }else{
            taxa = salario * terceiraFaixa;
        }
        System.out.println("Taxa anual: "+taxa);
    }
}
