package org.lista005.exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MusicCloud musicCloud = new MusicCloud();

        System.out.print("Digite o nome da playlist: ");
        String nomePlaylist = scanner.nextLine();
        Playlist playlist = new Playlist(nomePlaylist);

        while (true) {
            System.out.print("Digite o nome da música (ou 'sair' para encerrar): ");
            String titulo = scanner.nextLine();

            if (titulo.equalsIgnoreCase("sair")) break;

            try {
                Musica musica = musicCloud.buscarMusica(titulo);
                playlist.adicionarMusica(musica);
                System.out.println("Você adicionou a música " + titulo + " na playlist.");
            } catch (MusicaNaoEncontradaException e) {
                System.out.println(e.getMessage());
            }
        }

        playlist.exibir();
        scanner.close();
    }
}
