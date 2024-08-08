public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        // Utilizando funcionalidades do MusicPlayer
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Imagine - John Lennon");

        // Utilizando funcionalidades do Telephone
        meuIphone.ligar("123-456-7890");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Utilizando funcionalidades do InternetBrowser
        meuIphone.exibirPagina("https://www.example.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
