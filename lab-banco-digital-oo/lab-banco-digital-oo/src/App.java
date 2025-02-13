public class App {
    public static void main(String[] args) throws Exception {
        Agencia agencia1 = new Agencia("123", "Bradesco 1");

        Titular titular1 = new Titular("Fulano", "123.456.789-00");
        Titular titular2 = new Titular("Ciclano", "987.654.321-00");

        Conta conta1 = new ContaCorrente(titular1, agencia1, "1234-5");
        Conta conta2 = new ContaPoupanca(titular2, agencia1, "5432-1");

        conta1.setTitular(titular1);
        conta2.setTitular(titular2);

        conta1.depositar(1000.0);

        conta1.transferir(50.0, conta2);
        System.out.println("Saque conta 1: ");
        conta1.sacar(900.0);
        System.out.println("Saque conta 2: ");
        conta2.sacar(45.0);

        System.out.println("Conta 1: ");
        conta1.extrato();
        System.out.println("Conta 2: ");
        conta2.extrato();
    }
}
