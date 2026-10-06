import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ClienteTest {

    @Test
    void deveEmitirContratoPF() {
        FabricaAbstrata fabrica = Fabrica.getInstance().obterFabrica("FabricaPF");
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Contrato PF emitido com assinatura manuscrita", cliente.emitirContrato());
    }

    @Test
    void deveEmitirContratoPJ() {
        FabricaAbstrata fabrica = Fabrica.getInstance().obterFabrica("FabricaPJ");
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Contrato PJ emitido com assinatura digital", cliente.emitirContrato());
    }

    @Test
    void deveEmitirProcuracaoPF() {
        FabricaAbstrata fabrica = Fabrica.getInstance().obterFabrica("FabricaPF");
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Procuracao PF emitido com assinatura manuscrita", cliente.emitirProcuracao());
    }

    @Test
    void deveEmitirProcuracaoPJ() {
        FabricaAbstrata fabrica = Fabrica.getInstance().obterFabrica("FabricaPJ");
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Procuracao PJ emitido com assinatura digital", cliente.emitirProcuracao());
    }

    @Test
    void deveCombinarContratoPFComAssinaturaDigital() {
        Contrato contrato = new ContratoPF(new AssinaturaDigital());
        assertEquals("Contrato PF emitido com assinatura digital", contrato.emitir());
    }

    @Test
    void deveCombinarProcuracaoPJComAssinaturaManuscrita() {
        Procuracao procuracao = new ProcuracaoPJ(new AssinaturaManuscrita());
        assertEquals("Procuracao PJ emitido com assinatura manuscrita", procuracao.emitir());
    }

    @Test
    void deveRetornarSempreAMesmaInstanciaDaFabrica() {
        assertEquals(Fabrica.getInstance(), Fabrica.getInstance());
    }

    @Test
    void deveLancarExcecaoParaFabricaInexistente() {
        assertThrows(IllegalArgumentException.class,
                () -> Fabrica.getInstance().obterFabrica("FabricaXYZ"));
    }

    @Test
    void deveLancarExcecaoParaClasseQueNaoEhFabrica() {
        assertThrows(IllegalArgumentException.class,
                () -> Fabrica.getInstance().obterFabrica("java.lang.Object"));
    }
}
