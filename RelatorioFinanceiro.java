public class RelatorioFinanceiro implements Imprimivel, EnviavelPorEmail {
    private String titulo;
    private double valorTotal;
    private String responsavel;

    public RelatorioFinanceiro(String titulo, double valorTotal, String responsavel) {
        this.titulo = titulo;
        this.valorTotal = valorTotal;
        this.responsavel = responsavel;
    }

    @Override
    public void imprimir() {
        System.out.print("=== RELATÓRIO FINANCEIRO ===");
        System.out.print("Título: " + titulo);
        System.out.printf("Valor Total: R$ %.2f%n", valorTotal);
        System.out.print("Responsável: " + responsavel);
        System.out.print("                            ");
    }

    @Override
    public void enviarPorEmail(String destinatario) {
        System.out.print("[E-MAIL] Enviando relatório \"" + titulo + "\" para: " + destinatario);
        System.out.print("Conteúdo anexado: Relatório financeiro completo");
        System.out.print("Mensagem automática gerada pelo sistema\n");
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public void enviar(String emil) {
    }
}
