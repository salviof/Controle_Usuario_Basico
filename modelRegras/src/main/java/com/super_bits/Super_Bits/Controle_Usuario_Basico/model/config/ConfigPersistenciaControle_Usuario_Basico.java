/*
 *  Super-Bits.com CODE CNPJ 20.019.971/0001-90

 */
package com.super_bits.Super_Bits.Controle_Usuario_Basico.model.config;

import com.super_bits.modulosSB.Persistencia.ConfigGeral.ItfConfigSBPersistencia;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabrica;

/**
 *
 * @author Salvio
 */
public class ConfigPersistenciaControle_Usuario_Basico implements ItfConfigSBPersistencia {

    @Override
    public String bancoPrincipal() {
        return "Controle_Usuario_BasicoTestes";
    }

    @Override
    public String[] bancosExtra() {
        return new String[0];
    }

    @Override
    public String formatoDataBanco() {
        return "yyy-MM-dd";
    }

    @Override
    public String formatoDataUsuario() {
        return "dd/MM/yy";
    }

    @Override
    public String pastaImagensJPA() {
        return "/resources/img";
    }

    /**
     *
     * Metodo chamado no inicio da aplicação para atualizar os valores fixos das
     * tabelas,
     *
     */
    @Override
    public void criarBancoInicial() {
        //configure aqui os comando de SQL que devem ser executados no momento do start da aplicação
    }

    @Override
    public Class<? extends ItfFabrica>[] fabricasRegistrosIniciais() {
        return new Class[]{};
    }

}
