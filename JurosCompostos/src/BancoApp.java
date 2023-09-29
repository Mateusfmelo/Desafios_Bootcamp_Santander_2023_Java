import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double valorInicial = scanner.nextDouble();
     
        double taxaJuros = scanner.nextDouble();
        
        int periodo = scanner.nextInt();

        double taxaJurosDecimal = taxaJuros / 100;

        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.

        double montante = valorInicial * Math.pow(1 + taxaJurosDecimal, periodo);

        System.out.println(String.format("Valor final do investimento: R$ %.2f", montante));
        
        scanner.close();
    }
}