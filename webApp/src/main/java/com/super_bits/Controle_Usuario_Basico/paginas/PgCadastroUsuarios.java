/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.Controle_Usuario_Basico.paginas;

import com.super_bits.Super_Bits.Controle_Usuario_Basico.regras_de_negocio_e_controller.FabAcaoSeguranca;
import com.super_bits.Super_Bits.Controle_Usuario_Basico.regras_de_negocio_e_controller.InfoAcaoSeguranca;
import com.super_bits.Super_Bits.Controle_Usuario_Basico.regras_de_negocio_e_controller.ModuloSeguranca;
import com.super_bits.modulos.SBAcessosModel.model.GrupoUsuarioSB;
import com.super_bits.modulos.SBAcessosModel.model.UsuarioSB;
import com.super_bits.modulos.SBAcessosModel.model.acoes.AcaoDoSistema;
import com.super_bits.modulosSB.Persistencia.dao.UtilSBPersistencia;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.ItfResposta;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ItfAcaoDoSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.estadoFormulario.FabEstadoFormulario;
import com.super_bits.modulosSB.webPaginas.JSFManagedBeans.declarados.util.PgUtil;
import com.super_bits.modulosSB.webPaginas.JSFManagedBeans.formularios.MB_paginaCadastroEntidades;
import com.super_bits.modulosSB.webPaginas.JSFManagedBeans.formularios.reflexao.anotacoes.InfoPagina;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 *
 *
 * @author rjesus
 */
@InfoPagina(nomeCurto = "GUS", tags = {"cadastro de usuarios"}, acessoLivre = false)
@Named
@ViewScoped
@InfoAcaoSeguranca(acao = FabAcaoSeguranca.USUARIO_MB_GERENCIAR)
public class PgCadastroUsuarios extends MB_paginaCadastroEntidades<UsuarioSB> {

    private List<GrupoUsuarioSB> grupoDeUsuarios;
    private List<AcaoDoSistema> acoesDisponiveis;

    @Inject
    private PgUtil pgUtil;

    public PgCadastroUsuarios() {
        super(new AcaoDoSistema[]{
            FabAcaoSeguranca.USUARIO_FRM_EDITAR.getAcaoDoSistema(),
            FabAcaoSeguranca.USUARIO_CTR_ALTERAR_STATUS.getAcaoDoSistema(),
            FabAcaoSeguranca.USUARIO_FRM_VISUALIZAR.getAcaoDoSistema()

        }, FabAcaoSeguranca.USUARIO_FRM_NOVO.getAcaoDoSistema().getComoFormularioEntidade(),
                FabAcaoSeguranca.USUARIO_FRM_LISTAR.getAcaoDoSistema().getComoFormularioEntidade(),
                FabAcaoSeguranca.USUARIO_CTR_SALVAR_MERGE.getAcaoDoSistema().getComoControllerEntidade(),
                true
        );

    }

    private void atualizarDados() {

        grupoDeUsuarios = UtilSBPersistencia.getListaTodos(GrupoUsuarioSB.class, getEMPagina());
        setEntidadesListadas(UtilSBPersistencia.getListaTodos(UsuarioSB.class, getEMPagina()));
    }

    @PostConstruct
    public void inicio() {
        atualizarDados();
        xhtmlAcaoAtual = acaoListarRegistros.getXhtml();

    }

    @Override
    public void executarAcao(UsuarioSB pUsuarioSelecionado) {

        super.executarAcao(pUsuarioSelecionado);

        if (acaoSelecionada.equals(FabAcaoSeguranca.USUARIO_CTR_ALTERAR_STATUS.getAcaoDoSistema())) {
            ModuloSeguranca.usuarioAlterarStatus(pUsuarioSelecionado);

        }

        if (acaoSelecionada.equals(FabAcaoSeguranca.USUARIO_FRM_VISUALIZAR.getAcaoDoSistema())) {
            atualizaInformacoesDeEdicao(FabEstadoFormulario.VISUALIZAR);

        }

        if (acaoSelecionada.equals(FabAcaoSeguranca.USUARIO_CTR_SALVAR_MERGE.getAcaoDoSistema())) {
            salvarAlteracoes();
        }

    }

    @Override
    protected String defineTitulo() {
        return "Cadastro de usuários";
    }

    @Override
    protected String defineNomeLink() {
        return "Gerenciar Usuários";
    }

    @Override
    protected String defineDescricao() {
        return "Pagina para gerenciamento de usuário";
    }

    @Override
    public int getId() {
        return 3;
    }

    public UsuarioSB getUsuarioSelecionado() {
        return getEntidadeSelecionada();
    }

    public void setUsuarioSelecionado(UsuarioSB pUsuarioSelecionado) {
        setEntidadeSelecionada(pUsuarioSelecionado);
    }

    public List<UsuarioSB> getUsuariosDoSistema() {
        return getEntidadesListadas();
    }

    public void setUsuariosDoSistema(List<UsuarioSB> pUsuariosDoSistema) {
        setEntidadesListadas(pUsuariosDoSistema);
    }

    public List<GrupoUsuarioSB> getGrupoDeUsuarios() {
        return grupoDeUsuarios;
    }

    public void setGrupoDeUsuarios(List<GrupoUsuarioSB> grupoDeUsuarios) {
        this.grupoDeUsuarios = grupoDeUsuarios;
    }

    public List<AcaoDoSistema> getAcoesDisponiveis() {
        return acoesDisponiveis;
    }

    public void setAcoesDisponiveis(List<AcaoDoSistema> acoesDisponiveis) {
        this.acoesDisponiveis = acoesDisponiveis;
    }

    @Override
    public ItfAcaoDoSistema getAcaoSelecionada() {
        return acaoSelecionada;
    }

    public void setAcaoSelecionada(AcaoDoSistema acaoSelecionada) {
        this.acaoSelecionada = acaoSelecionada;
    }

    public PgUtil getPgUtil() {
        return pgUtil;
    }

    public void setPgUtil(PgUtil pgUtil) {
        this.pgUtil = pgUtil;
    }

    public void salvarAlteracoes() {

        ItfResposta resp = ModuloSeguranca.usuarioPersistirAlteracoes((UsuarioSB) getEntidadeSelecionada(), getEMPagina());

        if (resp.isSucesso()) {

            xhtmlAcaoAtual = acaoListarRegistros.getXhtml();
            listarDados();

            pgUtil.atualizaTelaPorID("formulario");
        }
        atualizaInformacoesDeEdicao(FabEstadoFormulario.VISUALIZAR);
    }

    @Override
    public void listarDados() {
        if (isNovoRegistro()) {
            getEntidadesListadas().clear();
            getEntidadesListadas().add(getEntidadeSelecionada());
        } else {
            atualizarDados();
        }
    }

}
