/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.config.webPaginas;

import com.super_bits.modulosSB.SBCore.ConfigGeral.ItfConfiguracaoCoreCustomizavel;
import com.super_bits.modulosSB.webPaginas.ConfigGeral.ConfiguradorCoreDeProjetoWebWarAbstrato;
import javax.servlet.ServletContext;

/**
 *
 * @author salvioF
 */
public class ConfiguradorCoreRequisitosControle_Usuario_Basico extends ConfiguradorCoreDeProjetoWebWarAbstrato {

    public ConfiguradorCoreRequisitosControle_Usuario_Basico(ServletContext contexto) {
        super(contexto);
    }

    public ConfiguradorCoreRequisitosControle_Usuario_Basico() {
        super(true);
    }

    @Override
    public void defineFabricasDeACao(ItfConfiguracaoCoreCustomizavel pConfig) {

    }

}
