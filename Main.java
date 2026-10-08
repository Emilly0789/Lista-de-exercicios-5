public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();

        System.out.print("=== Telefone ===");
        smartphone.ligar("(83) 99999-0000");
        smartphone.atender();

        System.out.print("\n=== Navegador ===");
        smartphone.exibirPagina("https://www.exemplo.com");
        smartphone.adicionarNovaAba();
        smartphone.exibirPagina("https://www.outrosite.com");

        System.out.print("\n=== Reprodutor Musical ===");
        smartphone.tocar("Bohemian Rhapsody");
        smartphone.pausar();
        smartphone.pausar();

        // Usando o Smartphone através de cada interface (polimorfismo)
        System.out.print("\n=== Polimorfismo ===");
        AparelhoTelefonico telefone = smartphone;
        NavegadorInternet navegador = smartphone;
        ReprodutorMusical reprodutor = smartphone;

        telefone.ligar("190");
        navegador.adicionarNovaAba();
        reprodutor.tocar("Imagine");
    }
}
