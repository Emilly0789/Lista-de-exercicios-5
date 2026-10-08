public class Contrato implements Imprimivel {
    private String numero;
    private String parteEnvolvida;
    private String objetoContrato;

    public Contrato(String numero, String parteEnvolvida, String objetoContrato) {
        this.numero = numero;
        this.parteEnvolvida = parteEnvolvida;
        this.objetoContrato = objetoContrato;
    }

    @Override
    public void imprimir() {
        System.out.print("===== CONTRATO Nº " + numero + " =====");
        System.out.print("Parte envolvida: " + parteEnvolvida);
        System.out.print("Objeto: " + objetoContrato);
        System.out.print("*** Documento oficial — assinatura obrigatória ***");
        System.out.print("======================================\n");
    }

    public String getNumero() {
        return numero;
    }
}
