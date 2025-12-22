package br.org.coletivoJava.integracoes.restAsterixvoip.implementacao;

import br.org.coletivoJava.integracoes.asterix_voip.api.FabApiAsterix;
import br.org.coletivoJava.integracoes.restAsterixvoip.api.InfoIntegracaoRestAsterixvoipAsterix;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.WS.conexaoWebServiceClient.RespostaWebServiceSimples;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.FabTipoAgenteClienteApi;
<<<<<<< HEAD
=======
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.implementacao.AcaoApiIntegracaoAbstrato;
>>>>>>> d3b6928937304f99253108fe10a11fc987bf5f33
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoUsuario;

@InfoIntegracaoRestAsterixvoipAsterix(tipo = FabApiAsterix.LIGACOES_LISTAR)
public class IntegracaoRestAsterixvoipLigacoesListar
		extends
			AcaoApiIntegracaoAbstrato {

	public IntegracaoRestAsterixvoipLigacoesListar(
<<<<<<< HEAD
			final FabTipoAgenteClienteApi pTipoAgente,
			final ComoUsuario pUsuario, final java.lang.Object... pParametro) {
=======
            final FabTipoAgenteClienteApi pTipoAgente,
            final ComoUsuario pUsuario, final java.lang.Object... pParametro) {
>>>>>>> d3b6928937304f99253108fe10a11fc987bf5f33
		super(FabApiAsterix.LIGACOES_LISTAR, pTipoAgente, pUsuario, pParametro);
	}

	@Override
	protected RespostaWebServiceSimples gerarRespostaTratamentoFino(RespostaWebServiceSimples pRespostaWSSemTratamento) {
		return super.gerarRespostaTratamentoFino(pRespostaWSSemTratamento);
	}
}