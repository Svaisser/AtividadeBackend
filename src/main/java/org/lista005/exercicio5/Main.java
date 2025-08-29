package org.lista005.exercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cinema cinema = new Cinema();

        cinema.adicionarFilme(new Filme("Homem Aranha", 25.0, 18));
        cinema.adicionarFilme(new Filme("Divertidamente 2", 20.0, 0));
        cinema.adicionarFilme(new Filme("Deadpool 3", 30.0, 18));
        cinema.adicionarFilme(new Filme("Frozen", 15.0, 0));
        cinema.adicionarFilme(new Filme("Vingadores", 28.0, 12));

        while (true) {
            System.out.print("\nQue filme você deseja assistir? (Pressione X para sair): ");
            String nomeFilme = scanner.nextLine();

            if (nomeFilme.equalsIgnoreCase("X")) {
                System.out.println("Encerrando o sistema. Obrigado!");
                break;
            }

            Filme filmeEscolhido = cinema.buscarFilme(nomeFilme);

            if (filmeEscolhido == null) {
                System.out.println("Filme não encontrado!");
                continue;
            }

            System.out.print("Qual assento você deseja? (Ex: A1 a F5): ");
            String assento = scanner.nextLine();

            System.out.print("Qual o seu nome? ");
            String nomeCliente = scanner.nextLine();

            System.out.print("Qual a sua idade? ");
            int idade = Integer.parseInt(scanner.nextLine());

            Cliente cliente = new Cliente(nomeCliente, idade);
            Ingresso ingresso = new Ingresso(cliente, filmeEscolhido, assento);

            try {
                cinema.venderIngresso(ingresso);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}
