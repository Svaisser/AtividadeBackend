package org.lista005.exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Batalha {
    public static void main(String[] args) {
        List<Personagem> inimigos = new ArrayList<>();
        inimigos.add(new Personagem("Goblin", 30, 5));
        inimigos.add(new Personagem("Orc", 50, 10));
        inimigos.add(new Personagem("Esqueleto", 40, 8));

        Personagem jogador = new Personagem("Herói", 100, 15);

        Random random = new Random();

        while (jogador.getVida() > 0 && !todosInimigosDerrotados(inimigos)) {
            Personagem alvo;
            do {
                alvo = inimigos.get(random.nextInt(inimigos.size()));
            } while (alvo.getVida() <= 0);

            System.out.println("\n-- Turno do Jogador --");
            jogador.atacar(alvo);

            System.out.println("\n-- Turno dos Inimigos --");
            for (Personagem inimigo : inimigos) {
                if (inimigo.getVida() > 0) {
                    inimigo.atacar(jogador);
                    if (jogador.getVida() <= 0) break;
                }
            }

            System.out.println("\n============================");
        }

        if (jogador.getVida() <= 0) {
            System.out.println("\nO jogador foi derrotado! Fim de jogo.");
        } else {
            System.out.println("\nTodos os inimigos foram derrotados! Vitória do jogador!");
        }
    }

    public static boolean todosInimigosDerrotados(List<Personagem> inimigos) {
        for (Personagem inimigo : inimigos) {
            if (inimigo.getVida() > 0) {
                return false;
            }
        }
        return true;
    }
}

