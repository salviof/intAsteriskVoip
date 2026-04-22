package br.org.coletivoJava.integracoes.restAsterixvoip.implementacao;

import br.org.coletivoJava.integracoes.asterix_voip.api.FabApiAsterix;
import br.org.coletivoJava.integracoes.restAsterixvoip.api.InfoIntegracaoRestAsterixvoipAsterix;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.FabTipoAgenteClienteApi;
<<<<<<< HEAD

import com.super_bits.modulosSB.SBCore.integracao.libRestClient.implementacao.AcaoApiIntegracaoAbstrato;

=======
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.implementacao.AcaoApiIntegracaoAbstrato;
>>>>>>> b8d0406036b78e9450f76276ea70ae438514dcff
import com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.basico.ComoUsuario;

@InfoIntegracaoRestAsterixvoipAsterix(tipo = FabApiAsterix.LIGACOES_BAIXAR_AUDIO)
public class IntegracaoRestAsterixvoipLigacoesBaixarAudio
        extends
        AcaoApiIntegracaoAbstrato {
<<<<<<< HEAD

=======
>>>>>>> b8d0406036b78e9450f76276ea70ae438514dcff
    public IntegracaoRestAsterixvoipLigacoesBaixarAudio(
            final FabTipoAgenteClienteApi pTipoAgente,
            final ComoUsuario pUsuario, final java.lang.Object... pParametro) {
        super(FabApiAsterix.LIGACOES_BAIXAR_AUDIO, pTipoAgente, pUsuario,
                pParametro);
    }

<<<<<<< HEAD
    @Override
    public String gerarCorpoRequisicao() {
        String uniqueId = "1766078624.4243";
//(String) parametros.get(0);
        String json = "{\"uniqueid\": " + uniqueId + "}";

        return json;
    }

}
=======

}
>>>>>>> b8d0406036b78e9450f76276ea70ae438514dcff
