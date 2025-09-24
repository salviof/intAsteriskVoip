/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.coletivoJava.integracoes.asterix_voip.api;

import com.super_bits.modulosSB.SBCore.integracao.libRestClient.WS.ItfFabricaIntegracaoRest;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.WS.conexaoWebServiceClient.FabTipoConexaoRest;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.WS.conexaoWebServiceClient.InfoConsumoRestService;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.servicoRegistrado.FabTipoAutenticacaoRest;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.servicoRegistrado.InfoConfigRestClientIntegracao;
import com.super_bits.modulosSB.SBCore.modulos.ManipulaArquivo.importacao.FabTipoArquivoImportacao;

/**
 *
 * @author sfurbino
 */
@InfoConfigRestClientIntegracao(enderecosDocumentacao = "ttps://documenter.getpostman.com/view/9632769/SWLiamS3",
        tipoAutenticacao = FabTipoAutenticacaoRest.USUARIO_SENHA_SIMPLES,
        nomeIntegracao = FabConfigAsterixVoip.NOME_APLICACAO,
        configuracao = FabConfigAsterixVoip.class
)
public enum FabApiAsterix implements ItfFabricaIntegracaoRest {

    @InfoConsumoRestService(getPachServico = "/_REST/resellersAPI/createDomain",
            tipoConexao = FabTipoConexaoRest.POST,
            tipoInformacaoEnviada = FabTipoArquivoImportacao.JSON,
            aceitarCertificadoDeHostNaoConfiavel = true,
            parametrosPost = {"APIiddoCliente", "dominio", "qtd_contas"},
            urlDocumentacao = "https://documenter.getpostman.com/view/9632769/SWLiamS3#74ef2799-5a93-4fb1-933b-ad5aaa6adf03")
    LIGACOES_LISTAR,
    @InfoConsumoRestService(getPachServico = "/_REST/resellersAPI/listAccountsByDomain",
            tipoConexao = FabTipoConexaoRest.POST,
            aceitarCertificadoDeHostNaoConfiavel = true,
            tipoInformacaoEnviada = FabTipoArquivoImportacao.JSON,
            parametrosPost = {"dominio"},
            urlDocumentacao = "https://documenter.getpostman.com/view/9632769/SWLiamS3#74ef2799-5a93-4fb1-933b-ad5aaa6adf03")
    LIGACOES_BAIXAR_AUDIO;

}
