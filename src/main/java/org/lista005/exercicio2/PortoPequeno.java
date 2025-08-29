package org.lista005.exercicio2;

public class PortoPequeno extends BasePorto {

    public PortoPequeno(String nome) {
        super(nome);
    }

    @Override
    public boolean atracarBarco(Barco barco) {
        if (barco.getTamanho() <= 10) {
            barcosAtracados.add(barco);
            return true;
        }
        return false;
    }
}
