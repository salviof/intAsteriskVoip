package br.org.coletivoJava.integracoes.restAsterixvoip.implementacao;

import br.org.coletivoJava.integracoes.asterix_voip.api.ConfiguradorCoreIntegracaoAsterix;
import br.org.coletivoJava.integracoes.asterix_voip.api.FabApiAsterix;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.WS.conexaoWebServiceClient.ItfRespostaWebServiceSimples;
import junit.framework.TestCase;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.*;

public class IntegracaoRestAsterixvoipLigacoesListarTest {

    @Test
    public void testConsultarChamadasTest() {
        SBCore.configurar(new ConfiguradorCoreIntegracaoAsterix(), SBCore.ESTADO_APP.DESENVOLVIMENTO);

        LocalDateTime dataInicio = LocalDateTime.of(2023, 1, 1, 7, 0, 0);
        LocalDateTime dataFinal = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String dataInicioFormatada = dataInicio.format(formatter);
        String dataFinalFormatada = dataFinal.format(formatter);
        int clienteId = 189;

        ItfRespostaWebServiceSimples resposta = FabApiAsterix.LIGACOES_LISTAR.getAcao(dataFinalFormatada, dataInicioFormatada, clienteId).getResposta();
        System.out.println(resposta);
        assertEquals(200, resposta.getCodigoResposta());
    }
}