package com.google.rw.javacore.Aintroducaoclasses.test;

import com.google.rw.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {

        Professor professor = new Professor();

        professor.name = "Vitor Meneghetti";
        professor.age = 31;
        professor.sex = 'M';

        System.out.println("Nome: "+professor.name+", Idade: "+professor.age+", Sexo: "+professor.sex);
    }
}
