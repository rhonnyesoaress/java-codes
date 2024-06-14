package com.google.rw.danielly.dominio;

public class Imovel {

    public String endereco = "";
    public double preco;

    public void imovelNovo(double valorImovel){
        valorImovel += valorImovel*25/100;
        System.out.println("Valor do Imóvel pós adicional: " +valorImovel);
    }

    public void imovelVelho(double valorImovel){
        valorImovel -= valorImovel*25/100;
        System.out.println("Valor do Imóvel pós desconto: " +valorImovel);
    }
}
