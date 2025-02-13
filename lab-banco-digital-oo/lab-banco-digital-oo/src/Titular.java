public class Titular {

    private String nome;
    private String cpf;
    private Conta conta;

    public Titular(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Conta getConta() {
        return this.conta;
    }

    public void setConta(Conta conta) { 
        this.conta = conta;
    }
    
    @Override
    public String toString() {
        return "nome=" + nome + ", cpf=" + cpf;
    }

}
