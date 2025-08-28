package org.lista003.exercicio2;

public class EmpregadoTeste {
    public static void main(String[] args) {
        Empregado emp1 = new Empregado("Carlos", "Silva", 3000.00);
        Empregado emp2 = new Empregado("Ana", "Oliveira", 4500.00);

        exibirSalario(emp1);
        exibirSalario(emp2);

        System.out.println("\nAplicando aumento de 10%...\n");

        emp1.aplicarAumento(10);
        emp2.aplicarAumento(10);

        exibirSalario(emp1);
        exibirSalario(emp2);
    }

    public static void exibirSalario(Empregado emp) {
        System.out.println("Empregado: " + emp.getNome() + " " + emp.getSobrenome());
        System.out.println("Salário mensal: R$" + emp.getSalarioMensal());
        System.out.println("Salário anual: R$" + emp.getSalarioAnual());
        System.out.println("-----------------------------");
    }
}
