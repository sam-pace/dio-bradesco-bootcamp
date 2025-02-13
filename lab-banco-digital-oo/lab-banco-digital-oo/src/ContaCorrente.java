public class ContaCorrente extends Conta {
    public ContaCorrente(Titular titular, Agencia agencia, String numero) {
        super(titular, agencia, numero);
    }

    @Override
    public Double sacar(Double valor) {
        Double taxa = valor * 0.05;
        Double total = valor + taxa; // Total que será subtraído do saldo

        if (total > getSaldo()) {
            System.out.println("Saldo insuficiente! Você precisa de pelo menos: " + total + " para sacar.");
            return getSaldo();
        }

        super.sacar(total);
        System.out.println("Taxa aplicada: " + taxa);
        return getSaldo();
    }
}