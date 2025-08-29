package org.lista005.exercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Título: ");
        String titulo = scanner.nextLine();

        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();

        System.out.print("Tipo (texto, imagem, video): ");
        String tipoStr = scanner.nextLine().toUpperCase();

        TipoPostagem tipo = TipoPostagem.valueOf(tipoStr);

        Postagem postagem = new Postagem(titulo, descricao, tipo);

        PlataformaSocial myBook = new MyBook();
        myBook.compartilharPostagem(postagem);

        PlataformaSocial fotogram = new Fotogram();
        try {
            if (tipo == TipoPostagem.IMAGEM) {
                fotogram.compartilharImagem(postagem);
            } else if (tipo == TipoPostagem.VIDEO) {
                fotogram.compartilharVideo(postagem);
            } else {
                fotogram.compartilharPostagem(postagem);
            }
        } catch (UnsupportedOperationException e) {
            System.out.println("Ocorreu um erro ao compartilhar essa postagem no Fotogram.");
        }

        PlataformaSocial anyTube = new AnyTube();
        try {
            if (tipo == TipoPostagem.IMAGEM) {
                anyTube.compartilharImagem(postagem);
            } else if (tipo == TipoPostagem.VIDEO) {
                anyTube.compartilharVideo(postagem);
            } else {
                anyTube.compartilharPostagem(postagem);
            }
        } catch (UnsupportedOperationException e) {
            System.out.println("Ocorreu um erro ao compartilhar essa postagem no AnyTube.");
        }

        scanner.close();
    }
}
