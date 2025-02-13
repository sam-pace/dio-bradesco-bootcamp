public class Agencia {
    private String nome;
    private String numero;

    public Agencia(String numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    @Override
    public String toString() {
        return "nome=" + nome + ", numero=" + numero;
    }
    
}
