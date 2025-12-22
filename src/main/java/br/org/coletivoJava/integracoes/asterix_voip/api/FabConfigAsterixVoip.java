/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.coletivoJava.integracoes.asterix_voip.api;

import com.super_bits.modulosSB.SBCore.ConfigGeral.arquivosConfiguracao.ItfFabConfigModulo;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.tipoModulos.integracaoOauth.FabPropriedadeModuloIntegracaoOauth;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.tipoModulos.integracaoOauth.InfoPropriedadeConfigRestIntegracao;

/**
 *
 * @author sfurbino
 * @since 07/12/2019
 * @version 1.0
 */
public enum FabConfigAsterixVoip implements ItfFabConfigModulo {

    @InfoPropriedadeConfigRestIntegracao(tipoPropriedade = FabPropriedadeModuloIntegracaoOauth.URL_SERVIDOR_API)
    URL_SERVICO_API,
    @InfoPropriedadeConfigRestIntegracao(tipoPropriedade = FabPropriedadeModuloIntegracaoOauth.CHAVE_PRIVADA)
    CHAVE_DE_ACESSO;

    public static final String NOME_APLICACAO = "asterixVoip";

    @Override
    public String getValorPadrao() {
        switch (this) {
            case URL_SERVICO_API:
            case CHAVE_DE_ACESSO:
                break;
            default:
                return "não definido";
        }
        return "não definido";
    }

}
