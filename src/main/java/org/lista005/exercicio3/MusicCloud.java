package org.lista005.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class MusicCloud {
    private List<Musica> musicasDisponiveis;

    public MusicCloud() {
        this.musicasDisponiveis = new ArrayList<>();

        musicasDisponiveis.add(new Musica("Macarena", "Los Del Rio"));
        musicasDisponiveis.add(new Musica("Evidências", "Chitãozinho & Xororó"));
        musicasDisponiveis.add(new Musica("Bohemian Rhapsody", "Queen"));
        musicasDisponiveis.add(new Musica("Thriller", "Michael Jackson"));
    }

    public Musica buscarMusica(String titulo) throws MusicaNaoEncontradaException {
        for (Musica musica : musicasDisponiveis) {
            if (musica.getTitulo().equalsIgnoreCase(titulo)) {
                return musica;
            }
        }
        throw new MusicaNaoEncontradaException("A música " + titulo + " não foi encontrada no sistema.");
    }
}
