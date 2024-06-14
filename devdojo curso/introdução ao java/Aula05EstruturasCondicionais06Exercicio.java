package com.google.rw.introducao;

public class Aula05EstruturasCondicionais06Exercicio {
    public static void main(String[] args) {
        // Dado os valores de 1 a 7, imprima se é dia util ou final de semana.
        // Considerando 1 como domingo.

        byte weekday = 7;

        switch(weekday){
            case 1:
                System.out.println("Domingo: Fim de Semana");
                break;

            case 2:
                System.out.println("Segunda Feira: Dia Útil");
                break;

            case 3:
                System.out.println("Terça Feira: Dia Útil");
                break;

            case 4:
                System.out.println("Quarta Feira: Dia Útil");
                break;

            case 5:
                System.out.println("Quinta Feira: Dia Útil");
                break;

            case 6:
                System.out.println("Sexta Feira: Dia Útil");
                break;

            case 7:
                System.out.println("Sábadinho bom: Fim de semana");
                break;

            default:
                System.out.println("Type a valid day");
                break;
        }
    }

}
