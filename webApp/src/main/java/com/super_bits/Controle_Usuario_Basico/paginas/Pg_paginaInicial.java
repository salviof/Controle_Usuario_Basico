/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.Controle_Usuario_Basico.paginas;

import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.siteMap.MB_PaginaConversation;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.siteMap.anotacoes.InfoPagina;
import com.super_bits.modulosSB.webPaginas.controller.paginasDoSistema.FabAcaoPaginasDoSistema;
import com.super_bits.modulosSB.webPaginas.controller.paginasDoSistema.InfoAcaoPaginaDoSistema;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 *
 * Anotação Named para o Managed bean ficar acessivel direto nos XHTML <br>
 * Anotação ViewScoped indica que o ciclo de vida da instancia do objeto limita
 * a aba do navegador <br>
 * Anotação infoAcao que vincula a ação do tipo Maneged Bean <br>
 *
 *
 *
 * @author desenvolvedor
 */
@ViewScoped
@Named
@InfoAcaoPaginaDoSistema(acao = FabAcaoPaginasDoSistema.PAGINA_MB_HOME)
@InfoPagina(nomeCurto = "home", tags = {"home"})
public class Pg_paginaInicial extends MB_PaginaConversation {

    private String beanExemplo;

    public String getBeanExemplo() {
        return beanExemplo;
    }

    public void setBeanExemplo(String beanExemplo) {
        this.beanExemplo = beanExemplo;
    }

}
