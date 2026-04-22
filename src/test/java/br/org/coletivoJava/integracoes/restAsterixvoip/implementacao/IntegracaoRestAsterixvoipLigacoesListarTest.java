package br.org.coletivoJava.integracoes.restAsterixvoip.implementacao;

import br.org.coletivoJava.integracoes.asterix_voip.api.ConfiguradorCoreIntegracaoAsterix;
import br.org.coletivoJava.integracoes.asterix_voip.api.FabApiAsterix;
import br.org.coletivoJava.integracoes.asterix_voip.api.FabConfigAsterixVoip;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.WS.conexaoWebServiceClient.ItfRespostaWebServiceSimples;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.*;

public class IntegracaoRestAsterixvoipLigacoesListarTest {

    @Test
    public void testConsultarChamadasTest() {
        SBCore.configurar(new ConfiguradorCoreIntegracaoAsterix(), SBCore.ESTADO_APP.DESENVOLVIMENTO);

<<<<<<< HEAD
        LocalDateTime dataInicio = LocalDateTime.of(2025, 11, 1, 7, 0, 0);
=======
        LocalDateTime dataInicio = LocalDateTime.of(2025, 1, 1, 7, 0, 0);
>>>>>>> b8d0406036b78e9450f76276ea70ae438514dcff
        LocalDateTime dataFinal = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String dataInicioFormatada = dataInicio.format(formatter);
        String dataFinalFormatada = dataFinal.format(formatter);
<<<<<<< HEAD
        int clienteId = 18;
        System.out.println(FabConfigAsterixVoip.CHAVE_DE_ACESSO.getCaminhoArquivoVariaveisAmbiente());
        ItfRespostaWebServiceSimples resposta = FabApiAsterix.LIGACOES_LISTAR.getAcao(dataFinalFormatada, dataInicioFormatada, clienteId).getResposta();
        System.out.println(resposta.getRespostaTexto());
=======
        int clienteId = 189;

        ItfRespostaWebServiceSimples resposta = FabApiAsterix.LIGACOES_LISTAR.getAcao(dataInicioFormatada, dataFinalFormatada).getResposta();
        System.out.println(resposta);
>>>>>>> b8d0406036b78e9450f76276ea70ae438514dcff
        assertEquals(200, resposta.getCodigoResposta());
    }
}
