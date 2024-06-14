package com.google.rw.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {

        int age = 10;
        boolean IsAutorizadoComprarBebida = age >= 18;

        if(IsAutorizadoComprarBebida){
            System.out.println("Pode comprar bebida");
        }else{
            System.out.println("Não pode comprar bebida");
        }

        // ! operador negativo

        if(!IsAutorizadoComprarBebida){ // !IsAutorizadoComprarBebida (IsAutorizadoComprarBebida == false)
            System.out.println("Não pode comprar bebida");
        }
    }
}
