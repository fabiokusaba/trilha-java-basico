public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorNaInternet {
    @Override
    public void ligar() {
        System.out.println("LIGANDO");
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIAR CORREIO VOZ");
    }

    @Override
    public void exibirPagina(String pagina) {
        System.out.println("EXIBINDO A PAGINA " + pagina);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONAR NOVA ABA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZAR NOVA PAGINA");
    }

    @Override
    public void tocar() {
        System.out.println("TOCANDO MUSICA");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO MUSICA");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("SELECIONANDO MUSICA " + musica);
    }
}