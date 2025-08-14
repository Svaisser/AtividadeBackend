package org.lista001;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 12) {
        System.out.println("Categoria: Infantil");
        } else if (idade < 18) {
            System.out.println("Categoria: Adolescente");
        } else {
            System.out.println("Categoria: Adulto");
        }

        scanner.close();
    }
}
