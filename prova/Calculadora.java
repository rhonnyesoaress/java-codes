package com.google.rw.danielly;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int c = 0;
        do {
            System.out.println("Escolha uma opçao: ");
            System.out.println("1. Dobro\n2. Triplo\n3. Metade\n4. Quadrada\n5. Cubo\n6. Raiz Quadrado\n7. Raiz Cúbica\n8. Modulo\n9. Inverso\n0. Sair do Programa");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    Dobro();
                    break;
                case 2:
                    Triplo();
                    break;
                case 3:
                    Metade();
                    break;
                case 4:
                    Quadrado();
                    break;
                case 5:
                    Cubo();
                    break;
                case 6:
                    RaizQuadrada();
                    break;
                case 7:
                    RaizCubica();
                    break;
                case 8:
                    Modulo();
                    break;
                case 9:
                    Inversa();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Digite uma opção válida.");
            }
        }while(c == 0);



    }
    public static void Dobro(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha o número.");
        double number = sc.nextDouble();

        number = number + number;
        System.out.println("Dobro: " +number);

    }
    public static void Triplo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha o número.");
        double number = sc.nextDouble();

        number = number + number + number;
        System.out.println("Triplo: " +number);

    }
    public static void Metade(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha o número.");
        double number = sc.nextDouble();

        number = number/2;
        System.out.println("Metade: " +number);

    }
    public static void Quadrado(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha o número.");
        double number = sc.nextDouble();

        number = number*number;
        System.out.println("Quadrado: " +number);

    }
    public static void Cubo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha o número.");
        double number = sc.nextDouble();

        number = number*number*number;
        System.out.println("Cubo: " +number);

    }
    public static void RaizQuadrada(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha o número.");
        double number = sc.nextDouble();

        number = Math.sqrt(number);
        System.out.println("Raiz Quadrada: " +number);

    }
    public static void RaizCubica(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha o número.");
        double number = sc.nextDouble();
        number = Math.cbrt(number);
        System.out.println("Raiz Cubica: " +number);

    }
    public static void Modulo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha o número.");
        double number = sc.nextDouble();

        if(number < 0){
            number = number * -1;
            System.out.println("Módulo: |" +number+ "|");
        }else {
            System.out.println("Modulo: |" + number + "|");
        }

    }
    public static void Inversa(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha o número.");
        double number = sc.nextDouble();

        number = 1/number;
        System.out.println("Inversa: " +number);

    }


}
