package org.lista003.exercicio3;

import java.time.Year;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        setAno(ano);
        setMes(mes);
        setDia(dia);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        int diasNoMes = getDiasNoMes(this.mes, this.ano);
        if (dia >= 1 && dia <= diasNoMes) {
            this.dia = dia;
        } else {
            System.out.printf(
                    "Dia inválido: %d para o mês %d e ano %d. Ajustando para dia 1.%n",
                    dia, mes, ano
            );
            this.dia = 1;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            System.out.println("Mês inválido: " + mes);
            this.mes = 1;
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String displayData() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

    private int getDiasNoMes(int mes, int ano) {
        switch (mes) {
            case 2:
                return Year.isLeap(ano) ? 29 : 28;
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return 31;
        }
    }
}
