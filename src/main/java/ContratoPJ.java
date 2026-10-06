public class ContratoPJ extends Contrato {

    public ContratoPJ(Assinatura assinatura) {
        super(assinatura);
    }

    protected String descricao() {
        return "Contrato PJ";
    }
}
