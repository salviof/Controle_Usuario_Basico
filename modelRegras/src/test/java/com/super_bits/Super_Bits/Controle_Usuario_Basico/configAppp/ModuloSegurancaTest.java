/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.Super_Bits.Controle_Usuario_Basico.configAppp;

import com.super_bits.Super_Bits.Controle_Usuario_Basico.regras_de_negocio_e_controller.ModuloSeguranca;
import com.super_bits.Super_Bits.Controle_Usuario_Basico.configAppp.ConfiguradorCoreControle_Usuario_Basico;

import com.super_bits.modulos.SBAcessosModel.fabricas.FabSegurancaGruposPadrao;
import com.super_bits.modulosSB.Persistencia.ConfigGeral.SBPersistencia;

import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.ItfResposta;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfSessao;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfUsuario;
import com.super_bits.modulosSB.SBCore.modulos.sessao.Interfaces.ItfControleDeSessao;

import config.ConfigPersistenciaTestesAcesso;

import org.junit.Test;
import testesFW.TesteJunitSBPersistencia;

/**
 *
 * @author desenvolvedor
 */
public class ModuloSegurancaTest extends TesteJunitSBPersistencia {

    public ModuloSegurancaTest() {
    }

    @Test
    public void testUsuarioAlterarStatus() {

        ItfControleDeSessao controleDeSessao = SBCore.getControleDeSessao();
        ItfSessao sessao = controleDeSessao.getSessaoAtual();
        ItfUsuario usuario = sessao.getUsuario();
        controleDeSessao.logarEmailESenha("root@superBits.com", "senh@Screta");
        System.out.println("Usuário logado=" + usuario.getNome());

        ItfResposta resp = ModuloSeguranca.grupoAlterarStatus(FabSegurancaGruposPadrao.GRUPO_ADMINISTRADOR.getRegistro());

        System.out.println("Sucessso:" + resp.isSucesso());
        assertFalse("O sistema permitiu que o status do grupo fosse alterado com um susuário anomimo, isto é um absurdo", resp.isSucesso());
        resp.getRetorno();
        assertTrue("Mesmo o usuario sendo Root, a ação não foi executada", resp.isSucesso());

    }

    @Override
    protected void configAmbienteDesevolvimento() {
        SBCore.configurar(new ConfiguradorCoreControle_Usuario_Basico(), SBCore.ESTADO_APP.DESENVOLVIMENTO);
        SBPersistencia.configuraJPA(new ConfigPersistenciaTestesAcesso());
    }

}
