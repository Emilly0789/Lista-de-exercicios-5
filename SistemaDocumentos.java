import java.util.ArrayList;
import java.util.List;

public class SistemaDocumentos {

    private void processarDocumento(Imprimivel doc) {
        System.out.print("→ Processando documento para impressão:");
        doc.imprimir();
    }

    private void processarDocumento(EnviavelPorEmail doc, String emailDestino) {
        if (doc instanceof Imprimivel) {
            ((Imprimivel) doc).imprimir();
        }
        doc.enviarPorEmail(emailDestino);
    }

    public static void main(String[] args) {
        SistemaDocumentos sistema = new SistemaDocumentos();

        List<Imprimivel> documentos = new ArrayList<>();

        documentos.add(new RelatorioFinanceiro("Balanço Trimestral", 45890.75, "Maria Silva"));
        documentos.add(new Contrato("CT-042/2026", "Empresa XYZ Ltda.", "Prestação de serviços de TI"));
        documentos.add(new RelatorioFinanceiro("Fluxo de Caixa — Outubro", 12350.00, "João Costa"));
        documentos.add(new Contrato("CT-043/2026", "Fornecedor ABC", "Compra de equipamentos"));

        String emailCorporativo = "administracao@empresa.com.br";

        System.out.println("==== INÍCIO DO PROCESSAMENTO ====\n");

        // Abordagem recomendada: distinguir por tipo nas chamadas
        for (Imprimivel doc : documentos) {
            if (doc instanceof RelatorioFinanceiro) {
                RelatorioFinanceiro rel = (RelatorioFinanceiro) doc;
                System.out.print("--- Relatório: " + rel.getTitulo() + " ---");
                sistema.processarDocumento(rel, emailCorporativo);
            } else {
                System.out.print("--- Contrato ---");
                sistema.processarDocumento(doc);
            }
        }

        System.out.print("==== FIM DO PROCESSAMENTO ====");
    }
}