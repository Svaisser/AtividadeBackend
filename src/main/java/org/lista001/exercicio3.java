package org.lista001;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o código do produto: ");
        int codigo = scanner.nextInt();

        System.out.print("Digite o preço unitário do produto: ");
        double preco = scanner.nextDouble();

        System.out.print("Está em promoção? (true/false)");
        boolean promocao = scanner.nextBoolean();

        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + codigo);
        System.out.println("Salário: " + preco);
        System.out.println("Promoção: " + promocao);

        scanner.close();
    }
}
