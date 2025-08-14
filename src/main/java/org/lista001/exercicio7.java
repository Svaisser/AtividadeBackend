package org.lista001;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Digite a sua altura: ");
        double altura = scanner.nextDouble();
        double imc = peso / (altura * altura);
        System.out.printf("IMC: ", imc);
    }
}