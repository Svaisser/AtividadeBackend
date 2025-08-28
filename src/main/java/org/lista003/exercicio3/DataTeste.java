package org.lista003.exercicio3;

public class DataTeste {
    public static void main(String[] args) {
        Data data1 = new Data(15, 8, 2025);
        Data data2 = new Data(29, 2, 2024);
        Data data3 = new Data(31, 4, 2025);

        System.out.println("Data 1: " + data1.displayData());
        System.out.println("Data 2: " + data2.displayData());
        System.out.println("Data 3: " + data3.displayData());
    }
}
