/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.config.webPaginas;

import com.super_bits.Super_Bits.Controle_Usuario_Basico.regras_de_negocio_e_controller.FabMenuExemplo;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.siteMap.MB_SiteMapa;
import com.super_bits.Controle_Usuario_Basico.paginas.PgAcessos;
import com.super_bits.Controle_Usuario_Basico.paginas.PgCadastroUsuarios;
import com.super_bits.Controle_Usuario_Basico.paginas.PgPermissoes;
import com.super_bits.Controle_Usuario_Basico.paginas.Pg_paginaInicial;

import com.super_bits.modulosSB.SBCore.modulos.view.menu.ItfFabricaMenu;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.siteMap.ItfSiteMapa;
import javax.faces.bean.ApplicationScoped;
import javax.inject.Inject;

/**
 *
 *
 * Todas as paginas do seu sistema precisam ser Injetadas no SiteMAP
 *
 * O site Map, ajuda o bean paginaAtual a identificar qual pagina está sendo
 * referenciada, e serve de parametro para montar o site Map da pagina
 *
 *
 * @author Salvio
 */
@ApplicationScoped
public class SiteMap extends MB_SiteMapa implements ItfSiteMapa {

    @Inject
    private PgCadastroUsuarios usuarios;
    @Inject
    private PgAcessos controleDeAcesso;
    @Inject
    private PgPermissoes controleDePermissoes;
    @Inject
    private Pg_paginaInicial paginaInicial;

    @Override
    public Class<? extends ItfFabricaMenu> getFabricaMenu() {
        return FabMenuExemplo.class;
    }

}
