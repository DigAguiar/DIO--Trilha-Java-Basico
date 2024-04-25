import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCliente;
        float saldo = 230.99f;

        System.out.println("Por favor, digite o número da conta: ");
        numeroConta = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Por favor, digite a agência: ");
        agencia = scanner.nextLine();

        System.out.println("Por favor, seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco! " +
                "\nO Numero da sua agência: " + agencia + " " +
                "\nnúmero da sua conta: " + numeroConta + "" +
                "\ne seu saldo inicial: " + saldo + " reais.");

    }
}
