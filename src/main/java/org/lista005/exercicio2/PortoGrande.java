package org.lista005.exercicio2;

public class PortoGrande extends BasePorto {

    public PortoGrande(String nome) {
        super(nome);
    }

    @Override
    public boolean atracarBarco(Barco barco) {
        if (barco.getTamanho() >= 10) {
            barcosAtracados.add(barco);
            return true;
        }
        return false;
    }
}
