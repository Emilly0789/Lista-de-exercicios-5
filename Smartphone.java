public class Smartphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    private int abasAbertas = 1;
    private String musicaAtual;
    private boolean tocando = false;

    // --- AparelhoTelefonico ---
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida.");
    }

    // --- NavegadorInternet ---
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: " + url + " (aba " + abasAbertas + ")");
    }

    @Override
    public void adicionarNovaAba() {
        abasAbertas++;
        System.out.print("Nova aba adicionada. Total de abas: " + abasAbertas);
    }

    // --- ReprodutorMusical ---
    @Override
    public void tocar(String musica) {
        musicaAtual = musica;
        tocando = true;
        System.out.print("Tocando: " + musicaAtual);
    }

    @Override
    public void pausar() {
        if (tocando) {
            tocando = false;
            System.out.println("Música pausada: " + musicaAtual);
        } else {
            System.out.println("Nenhuma música está tocando.");
        }
    }
}
