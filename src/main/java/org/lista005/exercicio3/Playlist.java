package org.lista005.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String nome;
    private List<Musica> musicas;

    public Playlist(String nome) {
        this.nome = nome;
        this.musicas = new ArrayList<>();
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    public void exibir() {
        System.out.println("\nPlaylist: " + nome);
        for (Musica musica : musicas) {
            System.out.println("- " + musica);
        }
    }
}
