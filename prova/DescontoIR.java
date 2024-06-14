package com.google.rw.danielly;/* Exercício 05 – com.google.rw.danielly.DescontoIR
 * Aluno: Rhonnye Wendell – Matricula: 20220006232
 * Aluno: Rodrigo Veríssimo – Matricula: 20220070903
 */


import java.text.DecimalFormat;
import java.util.Scanner;

public class DescontoIR {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double money, tax, finalmoney;


        System.out.println("Insira seu salário para calcularmos suas alíquotas do Imposto de Renda: ");
        money = scanner.nextDouble();

        if(money > 0 && money <= 1903.98){
            System.out.println("Você está isento da alíquota.");
        }else if(money >= 1903.99 && money <= 2826.65){
            tax = 142.80;
            finalmoney = money - tax;
            System.out.println("Desconto do imposto de renda: R$ " +tax);
            System.out.println("Salário líquido: R$ " +finalmoney);
        }else if(money >= 2826.66 && money <= 3751.05){
            tax = 354.80;
            finalmoney = money - tax;
            System.out.println("Desconto do imposto de renda: R$ " +tax);
            System.out.println("Salário líquido: R$ " +finalmoney);
        }else if(money >= 3751.06 && money <= 4664.68){
            tax = 636.13;
            finalmoney = money - tax;
            System.out.println("Desconto do imposto de renda: R$ " +tax);
            System.out.println("Salário líquido: R$ " +finalmoney);
        }else{
            tax = 869.36;
            finalmoney = money - tax;
            System.out.println("Desconto do imposto de renda: R$ " +tax);
            System.out.println("Salário líquido: R$ " +finalmoney);
        }
    }
}
