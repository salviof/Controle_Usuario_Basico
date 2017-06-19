/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.config.webPaginas;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormulario;
import com.super_bits.modulosSB.webPaginas.ConfigGeral.ItfConfigWebPagina;
import com.super_bits.modulosSB.webPaginas.JSFManagedBeans.siteMap.parametrosURL.ParametroURL;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Salvio
 */
public class ConfigWPControle_Usuario_Basico implements ItfConfigWebPagina {

    @Override
    public String SITE_HOST() {
        return "http://localhost:8080";
    }

    @Override
    public String pastaImagens() {
        return "/img";
    }

    @Override
    public String nomePacoteProjeto() {
        return "Controle_Usuario_Basico";
    }

    @Override
    public String TituloAppWeb() {
        return "Controle de Usuário Básico";
    }

    @Override
    public String URLBASE() {
        return SITE_HOST() + "/" + nomePacoteProjeto();
    }

    @Override
    public Class mapaSite() {
        return SiteMap.class;
    }

    @Override
    public List<ParametroURL> parametrosDeAplicacao() {
        return new ArrayList<>();
    }

    @Override
    public boolean parametroDeAplicacaoEmSubDominio() {
        return false;
    }

    @Override
    public ItfAcaoFormulario getAcaoPaginaInicial() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
