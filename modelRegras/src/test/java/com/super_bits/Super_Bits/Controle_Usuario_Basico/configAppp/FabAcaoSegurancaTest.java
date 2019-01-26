/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.Super_Bits.Controle_Usuario_Basico.configAppp;

import com.super_bits.Super_Bits.Controle_Usuario_Basico.regras_de_negocio_e_controller.FabAcaoSeguranca;
import com.super_bits.modulosSB.Persistencia.ConfigGeral.SBPersistencia;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;

import config.ConfigPersistenciaTestesAcesso;

import org.junit.Test;
import testesFW.TesteAcaoDoSistema;

/**
 *
 * @author desenvolvedor
 */
public class FabAcaoSegurancaTest extends TesteAcaoDoSistema {

    public FabAcaoSegurancaTest() {
        super(false);
    }

    @Test
    public void testGetRegistro() {
        testesBasicosDeAcoes(FabAcaoSeguranca.class);
    }

    @Override
    protected void configAmbienteDesevolvimento() {
        SBCore.configurar(new ConfiguradorCoreControle_Usuario_Basico(), SBCore.ESTADO_APP.DESENVOLVIMENTO);
        SBPersistencia.configuraJPA(new ConfigPersistenciaTestesAcesso());

    }

}
