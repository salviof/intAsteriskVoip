package br.org.coletivoJava.integracoes.restAsterixvoip.implementacao;

import br.org.coletivoJava.integracoes.asterix_voip.api.FabApiAsterix;
import br.org.coletivoJava.integracoes.restAsterixvoip.api.InfoIntegracaoRestAsterixvoipAsterix;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.WS.conexaoWebServiceClient.RespostaWebServiceSimples;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.FabTipoAgenteClienteApi;
<<<<<<< HEAD

import com.super_bits.modulosSB.SBCore.integracao.libRestClient.implementacao.AcaoApiIntegracaoAbstrato;

=======
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.implementacao.AcaoApiIntegracaoAbstrato;
>>>>>>> b8d0406036b78e9450f76276ea70ae438514dcff
import com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.basico.ComoUsuario;

@InfoIntegracaoRestAsterixvoipAsterix(tipo = FabApiAsterix.LIGACOES_LISTAR)
public class IntegracaoRestAsterixvoipLigacoesListar
        extends
        AcaoApiIntegracaoAbstrato {

    public IntegracaoRestAsterixvoipLigacoesListar(
            final FabTipoAgenteClienteApi pTipoAgente,
            final ComoUsuario pUsuario, final java.lang.Object... pParametro) {
        super(FabApiAsterix.LIGACOES_LISTAR, pTipoAgente, pUsuario, pParametro);
    }

    @Override
    protected RespostaWebServiceSimples gerarRespostaTratamentoFino(RespostaWebServiceSimples pRespostaWSSemTratamento) {
        return super.gerarRespostaTratamentoFino(pRespostaWSSemTratamento);
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> b8d0406036b78e9450f76276ea70ae438514dcff
