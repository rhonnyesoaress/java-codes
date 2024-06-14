package com.google.rw.introducao;

public class Aula05EstruturasCondicionais02 {
    // bloco da classe

    public static void main(String[] args) {

        //bloco de metodos (todas as variaveis dentro do escopo local precisam ser inicializadas antes de executadas)

        // age < 15 categoria infantil
        // age >= 15 && age < 18 categoria juvenil
        // age > 18 categoria adulto
        int age = 12;
        String categoria;

        if(age < 15){
            categoria = "Categoria Infantil";
        }else if(age >= 15 && age < 18){
            categoria = "Categoria Juvenil";
        }else{
            categoria = "Categoria Adulto";
        }

        System.out.println(categoria);
    }

}
