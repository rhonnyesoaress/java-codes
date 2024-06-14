package com.google.rw.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //Doar caso o money seja maior que 5000
        double money = 4000;
        String mensagemDoar = "Vou passar o pix";
        String mensagemNaoDoar = "Pare de pedir, seu pobre";
        //sintaxe operador ternario: (condição) ? verdadeiro : falso;
        String result = money > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(result);
    }
}
