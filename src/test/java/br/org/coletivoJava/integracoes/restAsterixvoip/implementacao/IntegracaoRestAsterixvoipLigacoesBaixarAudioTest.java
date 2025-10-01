package br.org.coletivoJava.integracoes.restAsterixvoip.implementacao;

import br.org.coletivoJava.integracoes.asterix_voip.api.FabApiAsterix;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.WS.conexaoWebServiceClient.ItfRespostaWebServiceSimples;
import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntegracaoRestAsterixvoipLigacoesBaixarAudioTest {
    @Test
    public void testDownloadChamadaAudio() {

//        double uniqueId = 1759322909.1021;

        ItfRespostaWebServiceSimples resposta = FabApiAsterix.LIGACOES_BAIXAR_AUDIO.getAcao().getResposta();

        assertEquals(200, resposta.getCodigoResposta());
    }

}