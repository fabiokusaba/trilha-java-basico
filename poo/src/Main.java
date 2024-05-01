public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.ligar();
        iphone.atender();

        iphone.exibirPagina("www.facebook.com");
        iphone.atualizarPagina();

        iphone.selecionarMusica("LP - Silverado");
        iphone.tocar();
    }
}