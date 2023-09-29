import java.util.Scanner;

public class desafio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("INFORME O VALOR DO SALÁRIO: ");
        double valorSalario = scanner.nextDouble();

        System.out.println("INFORME O VALOR DOS BENEFÍCIOS: ");
        double valorBeneficios = scanner.nextDouble();

        double valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100) {
            valorImposto = 0.05F * valorSalario;
        } else if (valorSalario >= 1100.01 && valorSalario <= 2500.00) {
            valorImposto = 0.10F * valorSalario;
        } else {
            valorImposto = 0.15F * valorSalario;
        }

        double saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%.2f", saida));
    }
}