/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.Controle_Usuario_Basico.paginas;

import com.super_bits.Super_Bits.Controle_Usuario_Basico.model.config.ConfigPersistenciaControle_Usuario_Basico;
import com.super_bits.config.webPaginas.ConfigWPControle_Usuario_Basico;
import com.super_bits.config.webPaginas.ConfiguradorCoreWebAppControle_Usuario_Basico;
import com.super_bits.modulosSB.Persistencia.ConfigGeral.SBPersistencia;
import com.super_bits.modulosSB.Persistencia.ERROS.TesteJunitSBPersistencia;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.webPaginas.ConfigGeral.SBWebPaginas;

/**
 *
 * @author desenvolvedor
 */
public class TestesControleDeUsuarioBasicoWebApp extends TesteJunitSBPersistencia {

    @Override
    protected void configAmbienteDesevolvimento() {
        SBCore.configurar(new ConfiguradorCoreWebAppControle_Usuario_Basico(), SBCore.ESTADO_APP.DESENVOLVIMENTO);
        SBPersistencia.configuraJPA(new ConfigPersistenciaControle_Usuario_Basico());
        SBWebPaginas.configurar(new ConfigWPControle_Usuario_Basico());
    }

}
