package com.google.rw.danielly;

import java.util.Scanner;

public class EquacaoSGrau {
    public static void main(String[] args) {

        double a, b, c, x, result, delta;
        Scanner scannerA = new Scanner(System.in);
        Scanner scannerB = new Scanner(System.in);
        Scanner scannerC = new Scanner(System.in);

        System.out.println("Digite o coeficiente A da sua equação de segundo grau: ");
        a = scannerA.nextInt();
        System.out.println("Digite o coeficiente B da sua equação de segundo grau: ");
        b = scannerB.nextInt();
        System.out.println("Digite o coeficiente C da sua equação de segundo grau: ");
        c = scannerC.nextInt();

        if(a == 0){
            x = -b/c;
            System.out.println("Essa é uma equação de primeiro grau com a seguinte raíz: " +x);
        }else if(b == 0){
            x = Math.sqrt(-c/a);
            System.out.println("Primeira raíz: " +x);
            System.out.println("Segunda raíz: " +-x);
        }else if(c == 0){
            x = 0;
            System.out.println("Primeira raíz: " +x);
            x = (-b/a);
            System.out.println("Segunda raíz: " +x);
        }else{
            delta = (Math.pow(b,2)) - (4*a*c);
            if(delta != 0) {
                x = -b + (Math.sqrt(delta)) / (2 * a);
                System.out.println("Primeira raíz: " + x);
                x = -b - (Math.sqrt(delta)) / (2 * a);
                System.out.println("Segunda raíz: " + x);
            }else if(delta < 0){


            }else{
                x = -b + (Math.sqrt(delta)) / (2 * a);
                System.out.println("As raízes são iguais: " +x);
            }
        }
    }
}
