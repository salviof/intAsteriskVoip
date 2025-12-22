package br.org.coletivoJava.integracoes.restAsterixvoip.implementacao;

import br.org.coletivoJava.integracoes.asterix_voip.api.FabApiAsterix;
import br.org.coletivoJava.integracoes.asterix_voip.api.FabConfigAsterixVoip;
<<<<<<< HEAD
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.implementacao.gestaoToken.GestaoTokenChaveUnica;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.token.ItfTokenDeAcessoExterno;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.FabTipoAgenteClienteApi;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.token.TokenDeAcessoExternoSimples;
=======
import br.org.coletivoJava.integracoes.restAsterixvoip.api.InfoIntegracaoRestAsterixvoipAsterix;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.FabTipoAgenteClienteApi;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.token.ItfTokenDeAcessoExterno;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.token.TokenDeAcessoExternoSimples;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.implementacao.gestaoToken.GestaoTokenChaveUnica;
>>>>>>> d3b6928937304f99253108fe10a11fc987bf5f33
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoUsuario;

@InfoIntegracaoRestAsterixvoipAsterix(tipo = FabApiAsterix.LIGACOES_LISTAR)
public class GestaoTokenRestAsterixvoip extends GestaoTokenChaveUnica {

	@Override
	public boolean validarToken() {
		return false;
	}

	@Override
	public ItfTokenDeAcessoExterno loadTokenArmazenado() {
		return null;
	}

<<<<<<< HEAD
    public GestaoTokenRestAsterixvoip(
            final FabTipoAgenteClienteApi pTipoAgente, final ComoUsuario pUsuario) {
        super(FabApiAsterix.class, pTipoAgente, pUsuario);
    }

    @Override
    public ItfTokenDeAcessoExterno gerarNovoToken() {
        return new TokenDeAcessoExternoSimples(getConfig().getPropriedade(FabConfigAsterixVoip.CHAVE_DE_ACESSO));
    }

}
=======
	public GestaoTokenRestAsterixvoip(
            final FabTipoAgenteClienteApi pTipoAgente, final ComoUsuario pUsuario) {
		super(FabApiAsterix.class, pTipoAgente, pUsuario);
	}

	@Override
	public ItfTokenDeAcessoExterno gerarNovoToken() {
		//token obtido atraves da configuracao
		String token = getConfig().getPropriedade(FabConfigAsterixVoip.CHAVE_DE_ACESSO);
		setToken(new TokenDeAcessoExternoSimples(token));
//		return new TokenDeAcessoExternoSimples(getConfig().getPropriedade(FabConfigAsterixVoip.CHAVE_DE_ACESSO));
		return getTokenCompleto();
//		return super.gerarNovoToken();
	}
}
>>>>>>> d3b6928937304f99253108fe10a11fc987bf5f33
