package br.org.coletivoJava.integracoes.restAsterixvoip.implementacao;

import br.org.coletivoJava.integracoes.restAsterixvoip.api.InfoIntegracaoRestAsterixvoipAsterix;
import br.org.coletivoJava.integracoes.asterix_voip.api.FabApiAsterix;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.implementacao.gestaoToken.GestaoTokenChaveUnica;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.token.ItfTokenDeAcessoExterno;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.FabTipoAgenteClienteApi;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfUsuario;

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
            final FabTipoAgenteClienteApi pTipoAgente, final ItfUsuario pUsuario) {
        super(FabApiAsterix.class, pTipoAgente, pUsuario);
    }
}
