import java.text.DecimalFormat;
import java.util.Scanner;

public class dio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        double valorInicial = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();
        int periodo = scanner.nextInt();
        
        // Convertendo a taxa de juros de decimal para porcentagem
        taxaJuros = 1 + taxaJuros; // Adicionando 1 para obter o fator de multiplicação
        double valorFinal = valorInicial;

        // Calculando o valor final com juros compostos
        for (int i = 0; i < periodo; i++) {
            valorFinal *= taxaJuros;
        }

        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));
        
        scanner.close();
    }
}
