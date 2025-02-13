public interface Transacoes {
    public void depositar(Double valor);
    public Double sacar(Double valor);
    public void transferir(Double valor, Conta destino);
    public void extrato();
    public void saldo();
}
