package br.org.coletivoJava.integracoes.restAsterixvoip.implementacao;

import br.org.coletivoJava.integracoes.asterix_voip.api.FabApiAsterix;
import br.org.coletivoJava.integracoes.restAsterixvoip.api.InfoIntegracaoRestAsterixvoipAsterix;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.FabTipoAgenteClienteApi;
<<<<<<< HEAD
=======
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.implementacao.AcaoApiIntegracaoAbstrato;
>>>>>>> d3b6928937304f99253108fe10a11fc987bf5f33
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoUsuario;

@InfoIntegracaoRestAsterixvoipAsterix(tipo = FabApiAsterix.LIGACOES_BAIXAR_AUDIO)
public class IntegracaoRestAsterixvoipLigacoesBaixarAudio
        extends
        AcaoApiIntegracaoAbstrato {

<<<<<<< HEAD
	public IntegracaoRestAsterixvoipLigacoesBaixarAudio(
			final FabTipoAgenteClienteApi pTipoAgente,
			final ComoUsuario pUsuario, final java.lang.Object... pParametro) {
		super(FabApiAsterix.LIGACOES_BAIXAR_AUDIO, pTipoAgente, pUsuario,
				pParametro);
	}
=======
    public IntegracaoRestAsterixvoipLigacoesBaixarAudio(
            final FabTipoAgenteClienteApi pTipoAgente,
            final ComoUsuario pUsuario, final java.lang.Object... pParametro) {
        super(FabApiAsterix.LIGACOES_BAIXAR_AUDIO, pTipoAgente, pUsuario,
                pParametro);
    }

    @Override
    public String gerarCorpoRequisicao() {
        String uniqueId = (String) parametros.get(0);
        String json = "{\"uniqueid\": " + uniqueId + "}";

        return json;
    }
>>>>>>> d3b6928937304f99253108fe10a11fc987bf5f33
}