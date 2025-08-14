package org.lista001;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.println("Número de caracteres: " + nome.length());
        System.out.println(nome.toUpperCase());

        if (nome.contains("Silva")) {
            System.out.println("Silva: " + true);
        } else {
            System.out.println("Silva: " + false);
        }
    }
}