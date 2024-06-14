package com.google.rw.javacore.Aintroducaoclasses.test;

import com.google.rw.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        //sempre atribuir valor as variaveis aqui e nunca no objeto

        Estudante aluno = new Estudante();
        Estudante aluno2 = new Estudante();
        aluno2.name = "RK";

        System.out.println(aluno.age);
        System.out.println(aluno.name);
        System.out.println(aluno.sex);
        System.out.println("-----------");
        System.out.println(aluno2.age);
        System.out.println(aluno2.name);
        System.out.println(aluno2.sex);
    }
}
