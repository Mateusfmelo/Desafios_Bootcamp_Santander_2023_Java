import java.util.Scanner;

public class EquilibrarSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoAtual = scanner.nextDouble();
        double valorDeposito = scanner.nextDouble();
        double valorRetirada = scanner.nextDouble();

       double desconto = saldoAtual + valorDeposito - valorRetirada;

        System.out.println("Saldo atualizado na conta: " + desconto);
    }
}