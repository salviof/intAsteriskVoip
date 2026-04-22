package br.org.coletivoJava.integracoes.restAsterixvoip.implementacao;

import br.org.coletivoJava.integracoes.asterix_voip.api.FabApiAsterix;
import br.org.coletivoJava.integracoes.asterix_voip.api.FabConfigAsterixVoip;

import br.org.coletivoJava.integracoes.restAsterixvoip.api.InfoIntegracaoRestAsterixvoipAsterix;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.FabTipoAgenteClienteApi;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.token.ItfTokenDeAcessoExterno;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.token.TokenDeAcessoExternoSimples;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.implementacao.gestaoToken.GestaoTokenChaveUnica;

import com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.basico.ComoUsuario;

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

    public GestaoTokenRestAsterixvoip(
            final FabTipoAgenteClienteApi pTipoAgente, final ComoUsuario pUsuario) {
        super(FabApiAsterix.class, pTipoAgente, pUsuario);
    }

    @Override
    public ItfTokenDeAcessoExterno gerarNovoToken() {
        //token obtido atraves da configuracao
        String token = getConfig().getPropriedade(FabConfigAsterixVoip.CHAVE_DE_ACESSO);
        setToken(new TokenDeAcessoExternoSimples(token));
        return getTokenCompleto();

    }

}
