import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome!");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência!");
        String nomeAgencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da sua conta!");
        int numero = scanner.nextInt();     
        
        System.out.println("Por favor, digite o depósito inicial!");
        Double saldo = scanner.nextDouble();  

        System.out.println("Olá ".concat(nomeCliente).concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(nomeAgencia).concat(", conta ").concat(String.valueOf(numero)).concat(" e seu saldo de ").concat(String.valueOf(saldo)).concat(" já está disponível para saque."));
    }
}
