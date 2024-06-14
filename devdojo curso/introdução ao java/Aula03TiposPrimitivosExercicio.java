package com.google.rw.introducao;

/*
    Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

    Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salario de <salario>, na data <data>

 */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {

        String name = "lordera";
        String address = "Rua Cônego João de Deus, 70";
        float money = 2500F;
        String moneyReceivementDate = "08/07/2023";
        String message = "Eu "+name+", morando no endereço "+address+", confirmo que recebi o salario de "+money+", na data "+moneyReceivementDate;

        System.out.println(message);

        //System.out.println("Eu "+name+", morando no endereço "+address+", confirmo que recebi o salario de "+money+" na data "+moneyReceivementDate);
        //teria que fazer esse println toda vez, e criando uma string voce pode usa-la novamente.
    }
}
