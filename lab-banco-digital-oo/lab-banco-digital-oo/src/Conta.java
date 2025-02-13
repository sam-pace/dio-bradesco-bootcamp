public abstract class Conta implements Transacoes {
    private Titular titular;
    private Double saldo;
    private Agencia agencia;
    private String numeroConta;

    public Conta(Titular titular, Agencia agencia, String numero) {
        this.titular = titular;
        this.saldo = 0.0;
        this.agencia = agencia;
        this.numeroConta = numero;
    }

    @Override
    public void depositar(Double valor) {
        saldo += valor;
    }

    @Override
    public Double sacar(Double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente! Você precisa de pelo menos: " + valor);
            return saldo;
        }

        saldo -= valor;
        System.out.println("Saque de " + valor + " realizado com sucesso! Conta: " + numeroConta);
        return saldo;
    }

    @Override
    public void transferir(Double valor, Conta destino) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para transferência!");
        } else {
            destino.depositar(valor);
            saldo -= valor;
        }
    }

    @Override
    public void extrato() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
        System.out.println("Agencia: " + agencia);
        System.out.println("Numero: " + numeroConta);
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public Titular setTitular(Titular titular) {
        return this.titular = titular;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    @Override
    public void saldo() {
        System.out.println("Saldo: " + saldo);
    }

    public Titular getTitular() {
        return this.titular;
    }

    public Agencia getAgencia() {
        return this.agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public Double getSaldo() {
        return this.saldo;
    }
}