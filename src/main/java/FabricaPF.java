public class FabricaPF extends FabricaAbstrata {

    protected Assinatura createAssinatura() {
        return new AssinaturaManuscrita();
    }

    public Contrato createContrato() {
        return new ContratoPF(createAssinatura());
    }

    public Procuracao createProcuracao() {
        return new ProcuracaoPF(createAssinatura());
    }
}
