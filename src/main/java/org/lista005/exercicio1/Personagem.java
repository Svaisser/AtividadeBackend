package org.lista005.exercicio1;

public class Personagem {
    private String nome;
    private int vida;
    private int ataque;

    public Personagem(String nome, int vida, int ataque) {
        setNome(nome);
        setVida(vida);
        setAtaque(ataque);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int setAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public String receberDano(int dano) {
        vida = vida - dano;
        if (vida <= 0) {
            return ("O " + nome + " foi derrotado.");
        }
        return ("O " + nome + " levou " + dano + " de dano e está com " + vida + " de vida.");
    }

    public void atacar(Personagem alvo) {
        if (alvo.vida <= 0) {
            System.out.println("O ataque falhou. Alvo já está derrotado.");
        }
        System.out.println(alvo.receberDano(ataque));
    }
}