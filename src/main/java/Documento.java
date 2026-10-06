public abstract class Documento {
    protected final Assinatura assinatura;

    protected Documento(Assinatura assinatura) {
        this.assinatura = assinatura;
    }

    protected abstract String descricao();

    public String emitir() {
        return descricao() + " emitido com " + assinatura.assinar();
    }
}
