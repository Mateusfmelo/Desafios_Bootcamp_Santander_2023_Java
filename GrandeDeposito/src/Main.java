import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();

        if (valor > 0) {
            System.out.println("Deposito realizado com sucesso!");
            System.out.println(String.format("Saldo atual: R$ %.2f", valor));
        } else if (valor < 0) {
            System.out.println("Valor invalido! Digite um valor maior que zero.");
        } else if (valor == 0){
            System.out.println("Encerrando o programa...");
        }
    }
}