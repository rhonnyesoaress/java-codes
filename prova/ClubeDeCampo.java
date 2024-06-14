package com.google.rw.danielly;/* Exercício 01 – com.google.rw.danielly.ConversorTemperatura
 * Aluno: Rhonnye Wendell – Matricula: 20220006232
 * Aluno: Rodrigo Veríssimo – Matricula: 20220070903
 */

import java.util.Scanner;

public class ClubeDeCampo {
    public static void main(String[] args) {

        double faixa1=0;
        int qtf1=0;
        double faixa2 = 0;
        int qtf2=0;
        double faixa3 = 0;
        int qtf3=0;
        double faixa4 = 0;
        int qtf4=0;
        System.out.println("Quantas pessoas deseja cadastrar (entre 1 e 10 pessoas)? ");
        int numPessoas;
        Scanner num;
        num = new Scanner(System.in);
        numPessoas = num.nextInt();

        if (1 > numPessoas && numPessoas > 10)
            System.out.println("Digite um número válido.");
        else {
            int[] ID = new int[numPessoas];
            double[] ALT = new double[numPessoas];

            int n;
            for (n = 0; n < numPessoas; n++) {

                System.out.println("Digite a idade da " + (n+1) +  " pessoas.");
                Scanner idadePessoa;
                idadePessoa = new Scanner(System.in);
                ID[n] = idadePessoa.nextInt();

                System.out.println("Digite a altura da " + (n+1) + " pessoas.");
                Scanner alturaPessoa;
                alturaPessoa = new Scanner(System.in);
                ALT[n] = alturaPessoa.nextDouble();

                if (ID[n] <= 10){
                    faixa1 += ALT[n];
                    qtf1++;
                }
                else if (ID[n] > 10 && ID[n] <= 15) {
                    faixa2 += ALT[n];
                    qtf2++;
                }
                else if (ID[n] > 15 && ID[n] <= 21) {
                    faixa3 += ALT[n];
                    qtf3++;
                }
                else {
                    faixa4 += ALT[n];
                    qtf4++;
                }

            }
            System.out.println("Faixa 1: " + (faixa1/qtf1)+ "m\n\nFaixa 2: " + (faixa2/qtf2)+ "m\n\nFaixa 3: " + (faixa3/qtf3)+ "m\n\nFaixa 4: " + (faixa4/qtf4)+ "m\n\n");

        }
    }
}