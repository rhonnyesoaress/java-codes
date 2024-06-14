package com.google.rw.danielly.dominio;

public class Pessoa {

    public String nome = "";
    public int idade;

    public void trabalha(){
        System.out.println("Nome: " +this.nome);
        System.out.println("Idade: " +this.idade);
        System.out.println("Trabalhe, pobre.");
    }
    public void fazCompras(double dinheiro){
        System.out.println("Nome: " +this.nome);
        System.out.println("Idade: " +this.idade);
        System.out.println("Dinheiro: " +dinheiro);
        System.out.println("Va gastar a herança que seu papai deixou, playboy.");
    }

    public void mendiga(){
        System.out.println("Nome: " +this.nome);
        System.out.println("Idade: " +this.idade);
        System.out.println("A vida foi dura com você ne, campeão.");
    }
}
