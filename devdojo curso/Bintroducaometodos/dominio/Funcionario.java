package com.google.rw.javacore.Bintroducaometodos.dominio;

public class Funcionario {

    private String name = "";
    private int age;
    private double money1, money2, money3;
    private double media = 0;

    public void imprimeDados(){
        System.out.println("Nome: " +this.name);
        System.out.println("Idade: " +this.age);
        System.out.println("Salário 1: " +this.money1);
        System.out.println("Salário 2: " +this.money2);
        System.out.println("Salário 3: " +this.money3);
    }
    public void mediaSalario(){

        media = (getMoney1()+getMoney2()+getMoney3())/3;
        System.out.println("Média salarial: " +media);

    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setMoney1(double money1){
        this.money1 = money1;
    }

    public void setMoney2(double money2){
        this.money2 = money2;
    }

    public void setMoney3(double money3){
        this.money3 = money3;
    }


    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public double getMoney1(){
        return this.money1;
    }

    public double getMoney2(){
        return this.money2;
    }

    public double getMoney3(){
        return this.money3;
    }

    public double getMedia(){
        return this.media;
    }
}
