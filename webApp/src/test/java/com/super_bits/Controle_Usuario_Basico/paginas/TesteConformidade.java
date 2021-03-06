/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.Controle_Usuario_Basico.paginas;

import com.super_bits.Super_Bits.Controle_Usuario_Basico.model.config.ConfigPersistenciaControle_Usuario_Basico;
import com.super_bits.config.webPaginas.ConfiguradorCoreWebAppControle_Usuario_Basico;
import com.super_bits.modulosSB.Persistencia.ConfigGeral.SBPersistencia;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.webPaginas.TratamentoDeErros.RelatorioTesteWebPaginas;

import org.junit.Test;

/**
 *
 * É recomendável que seu projeto tenha uma classse basica abstrata de testes,
 * onde os testes genericos posssam ser criados, e o setup do teste possa ser
 * universalizado, utilize este exemplo para aprimorar a classe de testes do
 * projeto
 *
 * Estas informações podem te ajudar nesta tarefa:
 *
 * O Sistema oferece 3 classes abstratas nativas para testes com métodos para
 * axiliar nesta tarefa.
 *
 * TesteJunit,
 *
 * que obriga criar um método para configurar o ambiente,(SBCore.configurar)
 * possui o metodo lancar exececao, para exibição de relatório de erro mantendo
 * a compatibilidade com o Junit, e importa todos os Asserts do JUNIT
 *
 * TesteAcoes,
 *
 * para testar ações do Sistema (Importante certificar que as ações estejam
 * corretamente configuradas antes iniciar um projeto)
 *
 *
 * TesteJunitPercistencia
 *
 * possui um entityManager principal do projeto no padrão singleton (Singleton
 * no sentido literal signfica coisa única), e é um padrão de desenvolvimento
 * que checa se a coisa é nula e se não for instancia, no modo estático.
 *
 *
 * Este exemplo foi criado pensando no seu aprendizado, divirta-se!
 *
 * @author sfurbino
 */
public class TesteConformidade extends RelatorioTesteWebPaginas {

    @Test
    public void testeConformidadeSistema() {

        try {

            System.out.println("Realizando Teste");
            exibirRelatorioCompleto();

        } catch (Throwable t) {

            lancarErroJUnit(t);

        }

    }

    @Override
    protected void configAmbienteDesevolvimento() {

        SBCore.configurar(new ConfiguradorCoreWebAppControle_Usuario_Basico(), SBCore.ESTADO_APP.DESENVOLVIMENTO);

        SBPersistencia.configuraJPA(new ConfigPersistenciaControle_Usuario_Basico());

    }

}
