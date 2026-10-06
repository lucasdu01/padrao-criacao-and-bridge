public class ContratoPF extends Contrato {

    public ContratoPF(Assinatura assinatura) {
        super(assinatura);
    }

    protected String descricao() {
        return "Contrato PF";
    }
}
