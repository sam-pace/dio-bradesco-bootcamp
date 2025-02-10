import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Integer numero = 1021;
        String agencia;
        String nomeCliente;
        Double saldo = 150.98;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor insira o número da agência:");
        agencia = scanner.nextLine();

        System.out.println("Por favor insira o seu nome:");
        nomeCliente = scanner.nextLine();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta: " + numero + "\n" + "Seu saldo de " + saldo + " já disponível para saque.");

        scanner.close();
    }
}
