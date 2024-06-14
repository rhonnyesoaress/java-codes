package com.google.rw.danielly;/* Exercício 01 – com.google.rw.danielly.ConversorTemperatura
 * Aluno: Rhonnye Wendell – Matricula: 20220006232
 * Aluno: Rodrigo Veríssimo – Matricula: 20220070903
 */


import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {

        Scanner choice = new Scanner(System.in);
        Scanner celsius = new Scanner(System.in);
        Scanner kelvin = new Scanner(System.in);
        Scanner fahrenheit = new Scanner(System.in);

        System.out.println("Digite a temperatura na escala Celsius: ");
        double C = celsius.nextDouble();
        System.out.println("Digite a temperatura na escala Kelvin: ");
        double K = kelvin.nextDouble();
        System.out.println("Digite a temperatura na escala Fahrenheit: ");
        double F = fahrenheit.nextDouble();


        System.out.println("Qual conversão voce deseja?");
        System.out.println("1. F -> C\n2. F -> K\n3. C -> F\n4. K -> F\n5. C -> K\n6. K -> C");
        int scanner = choice.nextInt();



        switch(scanner){

            case 1:
                C = (F-32)/1.8;
                System.out.println(C);
                break;

            case 2:
                K = (F-32)*5/9+273;
                System.out.println(K);
                break;

            case 3:
                F = C * 1.8 + 32;
                System.out.println(F);
                break;

            case 4:
                F = (K-273) * 1.8 + 32;
                System.out.println(F);
                break;

            case 5:
                K = C + 273;
                System.out.println(K);
                break;

            case 6:
                C = K - 273;
                System.out.println(C);
                break;

            default:
                System.out.println("Digite uma opção válida");
        }


    }
}