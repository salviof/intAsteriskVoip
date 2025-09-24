/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.org.coletivoJava.integracoes.asterix_voip.api;

import com.super_bits.modulosSB.SBCore.ConfigGeral.ConfiguradorCoreModelSemPersistencia;
import com.super_bits.modulosSB.SBCore.ConfigGeral.ItfConfiguracaoCoreCustomizavel;

/**
 *
 * @author salvio
 */
public class ConfiguradorCoreIntegracaoAsterix extends ConfiguradorCoreModelSemPersistencia {

    public ConfiguradorCoreIntegracaoAsterix() {
        setIgnorarConfiguracaoPermissoes(true);
        setIgnorarConfiguracaoAcoesDoSistema(true);
    }

    /**
     *
     * O Core do sistema precisa ser configurado para execução da maioria das
     * tarefas, no core classes importante de ambiente de execução são
     * configuradas como:
     *
     * ClasseDeErro CentralDeMensagens CentralVisualizacao CentralEventos
     * ConfigPermissao ControleDeSessao e Fabricas de Ações do sistema
     *
     * Alterando a implementação destas classes o comportamento ao executar um
     * metodo como enviar mensagem ao usuario pode ser alterado, tortando seu
     * código portatil a diversos ambientes, Web, Mobile, Desktop ou IOC
     *
     * As informações cadastrais do sistemas ficam no arquivo SBProjeto.prop na
     * pasta resource
     *
     * @param pConfig Objeto Com informações de configuração do sistema
     */
    @Override
    public void defineFabricasDeACao(ItfConfiguracaoCoreCustomizavel pConfig) {
        setIgnorarConfiguracaoPermissoes(true);
        setIgnorarConfiguracaoAcoesDoSistema(true);
    }

}
