package org.lista001;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double compra = scanner.nextDouble();

        if (compra >= 100) {
            compra = compra * 0.9;
            System.out.println("Valor final com desconto: " + compra);
        } else {
            System.out.println("Valor final sem desconto: " + compra);
        }

        scanner.close();
    }
}
