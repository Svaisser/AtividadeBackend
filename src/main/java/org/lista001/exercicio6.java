package org.lista001;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];
        double soma = 0;

        System.out.println("Digite as notas dos 5 alunos (entre 0 e 10):");

        for (int i = 0; i < notas.length; i++) {
            double nota;
            while (true) {
                System.out.print("Nota do aluno " + (i + 1) + ": ");
                nota = scanner.nextDouble();

                if (nota >= 0 && nota <= 10) {
                    notas[i] = nota;
                    soma += nota;
                    break;
                } else {
                    System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
                }
            }
        }

        System.out.print("Notas: ");
        for (double nota : notas) {
            System.out.print(nota + " ");
        }

        double media = soma / notas.length;
        System.out.printf("\nMédia das notas: %.2f\n", media);

        scanner.close();
    }
}