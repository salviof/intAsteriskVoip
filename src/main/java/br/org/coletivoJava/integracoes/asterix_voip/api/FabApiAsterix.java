/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.coletivoJava.integracoes.asterix_voip.api;

import com.super_bits.modulosSB.SBCore.integracao.libRestClient.WS.ComoFabricaIntegracaoRest;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.WS.conexaoWebServiceClient.FabTipoConexaoRest;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.WS.conexaoWebServiceClient.InfoConsumoRestService;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.servicoRegistrado.FabTipoAutenticacaoRest;
import com.super_bits.modulosSB.SBCore.integracao.libRestClient.api.servicoRegistrado.InfoConfigRestClientIntegracao;
import com.super_bits.modulosSB.SBCore.modulos.ManipulaArquivo.importacao.FabTipoArquivoImportacao;

/**
 *
 * Documentação:
 * https://documenter.getpostman.com/view/13040224/TzCTa5yB#4eef08ec-7c89-4e26-84d4-457e0d2912ac
 *
 * Postman:
 * https://www.postman.com/omnismart-io/omnismart/collection/n6ao5mz/api-omnismart
 *
 * @author sfurbino
 */
@InfoConfigRestClientIntegracao(enderecosDocumentacao = "https://documenter.getpostman.com/view/13040224/TzCTa5yB#intro",
        tipoAutenticacao = FabTipoAutenticacaoRest.USUARIO_SENHA_SIMPLES,
        nomeIntegracao = FabConfigAsterixVoip.NOME_APLICACAO,
        configuracao = FabConfigAsterixVoip.class
)
public enum FabApiAsterix implements ComoFabricaIntegracaoRest {

    @InfoConsumoRestService(getPachServico = "/api/v3/chamada/consultarChamada?data_final={0}&data_inicial={1}&cliente_id={2}",
            tipoConexao = FabTipoConexaoRest.GET,
            tipoInformacaoEnviada = FabTipoArquivoImportacao.JSON,
            aceitarCertificadoDeHostNaoConfiavel = true,
            parametrosGet = {"data_final", "data_inicial", "cliente_id"},
            urlDocumentacao = "https://documenter.getpostman.com/view/13040224/TzCTa5yB#4eef08ec-7c89-4e26-84d4-457e0d2912ac")
    LIGACOES_LISTAR,
    @InfoConsumoRestService(getPachServico = "/api/v3/chamada/downloadChamadaAudio",
            tipoConexao = FabTipoConexaoRest.GET,
            aceitarCertificadoDeHostNaoConfiavel = true,
            tipoInformacaoEnviada = FabTipoArquivoImportacao.JSON,
            parametrosGet = {"uniqueId"},
            urlDocumentacao = "https://documenter.getpostman.com/view/13040224/TzCTa5yB#c472b2c5-2a42-4beb-867b-0672a70addc4")
    LIGACOES_BAIXAR_AUDIO;

}
