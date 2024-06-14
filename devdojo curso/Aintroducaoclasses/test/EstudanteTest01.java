package com.google.rw.javacore.Aintroducaoclasses.test;

import com.google.rw.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        estudante.name = "Rhonnye";
        estudante.age = 19;
        estudante.sex = 'M';

        System.out.println(estudante.name);
        System.out.println(estudante.age);
        System.out.println(estudante.sex);

    }
}
