public class FabricaPJ extends FabricaAbstrata {

    protected Assinatura createAssinatura() {
        return new AssinaturaDigital();
    }

    public Contrato createContrato() {
        return new ContratoPJ(createAssinatura());
    }

    public Procuracao createProcuracao() {
        return new ProcuracaoPJ(createAssinatura());
    }
}
