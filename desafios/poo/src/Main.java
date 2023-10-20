import Entidade.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        //Aparelho Telefonico
        iphone.ligar("989745687");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        //Reprodutor de Musica
        iphone.tocar("rufi-easily");
        iphone.pausar();
        iphone.selecionarMusica();

        //Navegar na internet
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

    }
}
