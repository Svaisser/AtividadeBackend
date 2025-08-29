package org.lista005.exercicio4;

public class AnyTube implements PlataformaSocial {
    @Override
    public void compartilharPostagem(Postagem postagem) {
        System.out.println("Você compartilhou essa postagem no AnyTube.");
    }

    @Override
    public void compartilharImagem(Postagem postagem) {
        throw new UnsupportedOperationException("Imagens não são suportadas no AnyTube.");
    }

    @Override
    public void compartilharVideo(Postagem postagem) {
        System.out.println("Você compartilhou esse vídeo no AnyTube.");
    }
}
