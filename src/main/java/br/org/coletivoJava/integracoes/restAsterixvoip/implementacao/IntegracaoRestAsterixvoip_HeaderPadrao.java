package br.org.coletivoJava.integracoes.restAsterixvoip.implementacao;

import com.super_bits.modulosSB.SBCore.integracao.libRestClient.implementacao.AcaoApiIntegracaoHeaderBuilder;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.transmissao_recepcao_rest_client.ItfAcaoApiRest;

public class IntegracaoRestAsterixvoip_HeaderPadrao
        extends
        AcaoApiIntegracaoHeaderBuilder {

    public IntegracaoRestAsterixvoip_HeaderPadrao(final ItfAcaoApiRest pAcao) {
        super(pAcao);
    }


    @Override
    public void gerarHeaderPadrao() {
        super.gerarHeaderPadrao();
        String token = acao.getFabricaApi().getGestaoToken().getToken();

        System.out.println("Token: " + token);
        cabecalho.put("Authorization", "Bearer " + token);

    }
}