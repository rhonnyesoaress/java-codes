package com.google.rw.introducao;

public class Aula05EstruturasCondicionais05Switch {
    public static void main(String[] args) {
        // Imprima o dia da semana, considerando 1 como domingo

        byte day = 2;
        //char, int, byte, short, enum, String

        switch (day) {

            case 1:
                System.out.println("Domingo");
                break;

            case 2:
                System.out.println("Segunda");
                break;

            case 3:
                System.out.println("Terça-Feira");
                break;

            case 4:
                System.out.println("Quarta-Feira");
                break;

            case 5:
                System.out.println("Quinta-Feira");
                break;

            case 6:
                System.out.println("Sexta-Feira");
                break;

            case 7:
                System.out.println("Sábadinho bom");
                break;

            default: // a posição do default nao importa, se colocar la em cima, precisa colocar o break.
                System.out.println("Digite um dia válido.");
                break;
        }

        char sex = 'M';

        switch(sex){
            case 'M':
                System.out.println("Male");
                break;

            case 'F':
                System.out.println("Female");
                break;

            default:
                System.out.println("Type a valid sex");
                break;
        }
    }
}