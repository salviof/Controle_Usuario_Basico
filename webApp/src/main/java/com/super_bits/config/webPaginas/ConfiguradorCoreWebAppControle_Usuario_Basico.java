/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.config.webPaginas;

import com.google.common.collect.Lists;
import com.super_bits.configSBFW.acessos.ConfigAcessos;
import com.super_bits.configSBFW.acessos.UtilControle_Usuario_BasicoGlobalVar;
import com.super_bits.modulosSB.SBCore.ConfigGeral.ItfConfiguracaoCoreCustomizavel;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabricaAcoes;
import com.super_bits.modulosSB.webPaginas.ConfigGeral.ConfiguradorCoreDeProjetoWebWarAbstrato;
import com.super_bits.modulosSB.webPaginas.controller.paginasDoSistema.FabAcaoPaginasDoSistema;
import java.util.List;
import javax.servlet.ServletContext;

/**
 *
 * @author salvioF
 */
public class ConfiguradorCoreWebAppControle_Usuario_Basico extends ConfiguradorCoreDeProjetoWebWarAbstrato {

    public ConfiguradorCoreWebAppControle_Usuario_Basico(ServletContext contexto) {
        super(contexto);
    }

    public ConfiguradorCoreWebAppControle_Usuario_Basico() {
        super(true);
    }

    @Override
    public void defineFabricasDeACao(ItfConfiguracaoCoreCustomizavel pConfig) {
        pConfig.setClasseConfigPermissao(ConfigAcessos.class);
        
        List<Class<? extends ItfFabricaAcoes>> listaAcoes=Lists.newArrayList(UtilControle_Usuario_BasicoGlobalVar.pAcoesDoSistema());
        listaAcoes.add(FabAcaoPaginasDoSistema.class);
        Class<? extends ItfFabricaAcoes>[] acoes;
        acoes = new Class[listaAcoes.size()];
        pConfig.setFabricaDeAcoes(listaAcoes.toArray(acoes));
    }

}
