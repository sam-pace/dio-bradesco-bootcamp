public class ContaPoupanca extends Conta {

    public ContaPoupanca(Titular titular, Agencia agencia, String numero) {
        super(titular, agencia, numero);
    }

    @Override
    public Double sacar(Double valor) {
        if (valor > getSaldo()) {
            System.out.println("Saldo insuficiente! Você precisa de pelo menos: " + valor + " para sacar.");
            return getSaldo();
        }

        super.sacar(valor);
        return getSaldo();
    }
}