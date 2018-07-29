/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.Controle_Usuario_Basico.paginas;

import com.super_bits.Super_Bits.Controle_Usuario_Basico.regras_de_negocio_e_controller.FabAcaoSeguranca;
import com.super_bits.config.webPaginas.SiteMap;
import com.super_bits.modulos.SBAcessosModel.model.ConfiguracaoDePermissao;
import com.super_bits.modulosSB.Persistencia.dao.UtilSBPersistencia;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import org.junit.Test;

/**
 *
 * @author desenvolvedor
 */
public class PgCadastroUsuariosTest extends TestesControleDeUsuarioBasicoWebApp {

    @Test
    public void testeInicial() {
        try {
            new SiteMap();
            ConfiguracaoDePermissao configPermissao = (ConfiguracaoDePermissao) UtilSBPersistencia.getRegistroByID(ConfiguracaoDePermissao.class, 0);

//            System.out.println("podeAcessar?" + podeAcessar + "Precisa permissao?" + FabAcaoSeguranca.GRUPO_MB_GERENCIAR.getAcaoDoSistema().isPrecisaPermissao());
            PgCadastroUsuarios teste = new PgCadastroUsuarios();
            teste.inicio();
        } catch (Throwable t) {
            lancarErroJUnit(t);
        }

    }

}
