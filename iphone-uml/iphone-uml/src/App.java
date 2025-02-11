public class App {
    public static void main(String[] args) throws Exception {
        Iphone meuIphone = new Iphone();
        System.out.println("Iniciando métodos da interface AparelhoTelefonico:");

        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        System.out.println("Iniciando métodos da interface NavegadorInternet:");

        meuIphone.exibirPagina("www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();

        System.out.println("Iniciando métodos da interface ReprodutorMusical:");

        meuIphone.selecionarMusica("Oasis - Wonderwall");
        meuIphone.tocar();
        meuIphone.pausar();

    }
}
