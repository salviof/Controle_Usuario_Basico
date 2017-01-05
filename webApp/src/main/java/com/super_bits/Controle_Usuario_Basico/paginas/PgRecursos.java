/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.Controle_Usuario_Basico.paginas;

import com.super_bits.modulos.SBAcessosModel.fabricas.acoesDemonstracao.FabAcaoDemonstracaoSB;
import com.super_bits.modulos.SBAcessosModel.fabricas.acoesDemonstracao.InfoAcaoDemonstracaoSB;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.ItfMB_Recursos;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.siteMap.MB_Pagina;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.siteMap.anotacoes.InfoPagina;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Default;
import javax.inject.Named;

/**
 *
 * @author desenvolvedor
 */
@SessionScoped
@Named
@InfoPagina(nomeCurto = "RC",
        tags = {"recursos"})
@InfoAcaoDemonstracaoSB(acao = FabAcaoDemonstracaoSB.DEMONSTRACAO_MB_RECURSOS)
@Default
public class PgRecursos extends MB_Pagina implements ItfMB_Recursos {

    @Override
    public void setId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
