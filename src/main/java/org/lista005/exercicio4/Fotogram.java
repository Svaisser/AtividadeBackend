package org.lista005.exercicio4;

public class Fotogram implements PlataformaSocial {
    @Override
    public void compartilharPostagem(Postagem postagem) {
        throw new UnsupportedOperationException("Postagens de texto não são suportadas no Fotogram.");
    }

    @Override
    public void compartilharImagem(Postagem postagem) {
        System.out.println("Você compartilhou essa postagem no Fotogram.");
    }

    @Override
    public void compartilharVideo(Postagem postagem) {
        System.out.println("Você compartilhou esse vídeo no Fotogram.");
    }
}
