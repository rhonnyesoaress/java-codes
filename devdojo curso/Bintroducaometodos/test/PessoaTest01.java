package com.google.rw.javacore.Bintroducaometodos.test;

import com.google.rw.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setName("Henia");
        pessoa.setAge(19);
        //pessoa.imprime();
        System.out.println(pessoa.getName());
        System.out.println(pessoa.getAge());



    }
}
