import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// Entrada de dados
		Scanner scanner = new Scanner(System.in);
		int saldoTotal = scanner.nextInt();
		int valorSaque = scanner.nextInt();

		if (saldoTotal >= valorSaque) {
			int saldo = saldoTotal - valorSaque;
			System.out.println(String.format("Saque realizado com sucesso. Novo saldo: %d", saldo));
		} else {
			System.out.println("Saldo insuficiente. Saque nao realizado!");
		}

	}
}