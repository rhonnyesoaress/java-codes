package com.google.rw.javacore.Bintroducaometodos.test;

import com.google.rw.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        funcionario.setName("Rhayron Klaiver");
        funcionario.setAge(22);
        funcionario.setMoney1(5000);
        funcionario.setMoney2(3700);
        funcionario.setMoney3(8000);
        //funcionario.imprimeDados();
        //funcionario.mediaSalario(funcionario.getMoney1(), funcionario.getMoney2(), funcionario.getMoney3());

        System.out.println(funcionario.getName());
        System.out.println(funcionario.getAge());
        System.out.println(funcionario.getMedia());
    }
}
