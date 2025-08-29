package org.lista005.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Barco> barcos = new ArrayList<>();
        barcos.add(new Barco("Barco 1", 2));
        barcos.add(new Barco("Barco 2", 5));
        barcos.add(new Barco("Barco 3", 7));
        barcos.add(new Barco("Barco 4", 12));
        barcos.add(new Barco("Barco 5", 20));

        BasePorto portoPequeno = new PortoPequeno("Porto Pequeno");
        BasePorto portoGrande = new PortoGrande("Porto Grande");

        for (Barco barco : barcos) {
            if (portoPequeno.atracarBarco(barco)) {
                System.out.println(barco.getNome() + " atracado no porto pequeno");
            } else if (portoGrande.atracarBarco(barco)) {
                System.out.println(barco.getNome() + " atracado no porto grande");
            } else {
                System.out.println(barco.getNome() + " não pôde ser atracado");
            }
        }
    }
}
