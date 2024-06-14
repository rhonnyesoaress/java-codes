package com.google.rw.danielly;

import java.util.Scanner;

public class ValidacaoSenha {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String usuario, senha = "";
        int c = 0, numero = 0, maiuscula = 0, minuscula = 0;

        System.out.println("Usuário: ");
        usuario = scanner.nextLine();
        System.out.println("Senha: ");
        senha = scanner.nextLine();

        while (c == 0) {

            usuario = usuario.trim();
            senha = senha.trim();

            if (usuario.equals(senha)) {
                System.out.println("Usuário e senha iguais. Insira dados diferentes.");
                System.out.println("Usuário: ");
                usuario = scanner.nextLine();
                System.out.println("Senha: ");
                senha = scanner.nextLine();

            } else {
                c = 1;
            }
        }

        while (c == 1) {
            for (int i = 0; senha.length() > i; i++) {
                char s = senha.charAt(i);
                if (Character.isDigit(s)) {
                    numero++;
                } else if (Character.isUpperCase(s)) {
                    maiuscula++;
                } else if (Character.isLowerCase(s)) {
                    minuscula++;
                }
            }
        }

        if (senha.length() >= 8) {
            if (numero >= 1 && maiuscula >= 1 && minuscula >= 1) {
                System.out.println("Dados cadastrados com sucesso.");
            } else {
                System.out.println("Dados inválidos. Digite no mínimo uma letra maiuscula, uma minúscula e um número.");
                senha = scanner.nextLine();
            }
        } else {
            System.out.println("Insira uma senha com no mínimo 8 caracteres. ");
            senha = scanner.nextLine();
        }
    }
}
