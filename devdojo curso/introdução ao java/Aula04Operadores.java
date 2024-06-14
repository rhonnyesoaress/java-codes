package com.google.rw.introducao;

import java.sql.SQLOutput;

public class Aula04Operadores {
    public static void main(String[] args){
        // + - * /

        int number01 = 10;
        int number02 = 20;
        int soma = number01 + number02;
        int sub = number01 - number02;
        int mult = number01 * number02;
        double div = number01 / (double) number02; //foi feito um cast (forçar uma variavel dentro de outra) para nao ficar um aviso

        System.out.println(soma);
        System.out.println(sub);
        System.out.println(mult);
        System.out.println(div);

        // % resto
        int rest = 20 % 2;

        System.out.println(rest); //se o resto for 0, o numero é par, se nao, é impar.

        // < > menor e maior <= >= menor igual e maior igual == != igual e diferente

        boolean isDezMaiorQueTrinta = 10 > 30;
        boolean isDezMenorQueTrinta = 10 < 30;
        boolean isDezIgualTrinta = 10 == 30;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("isDezMaiorQueTrinta: "+isDezMaiorQueTrinta);
        System.out.println("isDezMenorQueTrinta: "+isDezMenorQueTrinta);
        System.out.println("isDezIgualTrinta: "+isDezIgualTrinta);
        System.out.println("isDezIgualDez: "+isDezIgualDez);
        System.out.println("isDezDiferenteDez: "+isDezDiferenteDez);

        // AND (mirudo e bonito) && OR (mirudo ou bonito) ||

        int age = 35;
        float money = 3500F;
        boolean IsDentroDaLeiMaiorQueTrinta = age > 30 && money >= 4612;
        boolean IsDentroDaLeiMenorQueTrinta = age < 30 && money >= 4612;

        System.out.println("IsDentroDaLeiMaiorQueTrinta: "+IsDentroDaLeiMaiorQueTrinta);
        System.out.println("IsDentroDaLeiMenorQueTrinta: "+IsDentroDaLeiMenorQueTrinta);

        double ValorTotalContaCorrente = 200;
        double ValorTotalContaPoupança = 10000;
        float valuePs5 = 5000F;

        boolean IsPs5Compravel = ValorTotalContaCorrente > valuePs5 || ValorTotalContaPoupança > valuePs5;

        System.out.println("IsPs5Compravel: "+IsPs5Compravel);

        // = += -= *= /= %=

        double bonus = 1800; //1800
        bonus += 1000; //2800
        bonus -= 1000; //1800
        bonus *= 2; //3600
        bonus /= 2; //1800
        bonus %= 2;

        System.out.println(bonus);

        //contador

        int contador = 0;
        contador += 1;
        contador++; //incrementa um
        contador--; //decrementa um

        int contador2 = 0;
        int contador3 = 0;

        System.out.println(contador);
        System.out.println(contador2++); //faz oq tiver que fazer com a variavel (printar, nesse caso) e depois ele incrementa
        System.out.println(++contador3); //incrementa antes de fazer oq tiver que fazer

    }
}
