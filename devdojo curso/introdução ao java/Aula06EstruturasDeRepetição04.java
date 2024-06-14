package com.google.rw.introducao;

public class Aula06EstruturasDeRepetição04 {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado.
        // Condição valorParcela >= 1000

        int car = 50000;
        int i;

        for(i=1; i < car; i++){
            double valorParcela = car/i;
            if(valorParcela >= 1000){
                System.out.println("Parcela: "+i+" Valor: "+valorParcela);
            }else{ //no momento que a condição for negativa, ele encerra o for pra otimizar o codigo
                break;
            }

        }
    }
}
