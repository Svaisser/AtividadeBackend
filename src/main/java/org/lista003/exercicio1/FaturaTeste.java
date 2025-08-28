package org.lista003.exercicio1;

public class FaturaTeste {
    public static void main(String[] args) {
        Fatura fatura1 = new Fatura("001", "Mouse sem fio", 2, 79.90);
        Fatura fatura2 = new Fatura("002", "Teclado mecânico", -3, -150.00);

        exibirFatura(fatura1);
        System.out.println("----------------------------------");
        exibirFatura(fatura2);
    }

    public static void exibirFatura(Fatura fatura) {
        System.out.println("Número: " + fatura.getNumero());
        System.out.println("Descrição: " + fatura.getDescricao());
        System.out.println("Quantidade: " + fatura.getQuantidade());
        System.out.println("Preço por item: R$" + fatura.getPrecoPorItem());
        System.out.println("Valor total da fatura: R$" + fatura.getTotalFatura());
    }
}
