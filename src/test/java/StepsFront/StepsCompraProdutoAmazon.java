package StepsFront;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;





import static org.junit.Assert.*;
import java.util.concurrent.TimeUnit;

public class StepsCompraProdutoAmazon {

    WebDriver navegador;
    private Object ScrollStrategy;
    private Object TimeSpan;


    //@Before
    @Dado("que estou na tela de principal da home site www.amazon.com.br")
    public void que_estou_na_tela_de_principal_da_home_site_www_amazon_com_br() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ipinheir\\IdeaProjects\\frontedWeb\\Driver\\chromedriver.exe");
        navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.get("https://www.amazon.com.br/");
        navegador.manage().window().maximize();

    }

    @Dado("clico no botao {string}")
    public void clico_no_botao(String string) {

        //clicar na opção "faça seu login"
        Actions actions = new Actions(navegador);
        actions.moveToElement(navegador.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")));
        actions.click();
        actions.build().perform();
        // clica no botão faça seu login
        navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Dado("informo corretamente os dados de acesso")
    public void informo_corretamente_os_dados_de_acesso() {
        Actions actions = new Actions(navegador);

        // informa e-mail
        actions.moveToElement(navegador.findElement(By.xpath("//*[@id=\"ap_email\"]")));
        actions.click();
        actions.sendKeys("mentorisa_qa@hotmail.com");
        actions.build().perform();

        // clicar botao continuar
        actions.moveToElement(navegador.findElement(By.className("a-button-inner")));
        actions.click();
        actions.build().perform();

        // informa senha
        actions.moveToElement(navegador.findElement(By.xpath("//*[@id=\"ap_password\"]")));
        actions.click();
        actions.sendKeys("Teste123@teste");
        actions.build().perform();

    }

    @Quando("clico no botão {string}")
    public void clico_no_botão(String string) {

        Actions actions = new Actions(navegador);
        // clica no botÃ£o Controle de privacidade Cokies
        actions.moveToElement(navegador.findElement(By.xpath("//*[@id=\"signInSubmit\"]")));
        actions.click();
        actions.build().perform();
    }

    @Entao("deve ser exibira a mensgem {string}")
    public void deve_ser_exibira_a_mensgem(String string) {
        String valido = navegador.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).getText();
        assertEquals("Olá, Isa", valido);

    }

    //Cenário 2
@Test
    @E("acesso os produtos mais vendidos, seleciona o ítem {string}")
    public void acessoOsProdutosMaisVendidosSelecionaOÍtem(String arg0) {
        // clica no link mais vendido
        Actions actions = new Actions(navegador);
        actions.moveToElement(navegador.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")));
        actions.click();
        actions.build().perform();
        navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // clico novamente
       actions.moveToElement(navegador.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")));
       actions.click();
       actions.sendKeys("Suporte para Notebook, OCTOO, Uptable, UP-BL, Preto");
       actions.build().perform();
      // clica no botão pesquisar
       actions.moveToElement(navegador.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")));
       actions.click();
       actions.build().perform();
      //    JavascriptExecutor jse = (JavascriptExecutor) navegador;
      //    jse.executeScript("window.scrollBy(0,250)", "");
       navegador.findElement(By.linkText("Suporte para Notebook, OCTOO, Uptable, UP-BL, Preto")).click();
       navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

   }

       @Quando("clico no {string}")
        public void clicoNo(String arg0) {

        Actions actions = new Actions(navegador);
        actions.moveToElement(navegador.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")));
        actions.click();
        actions.build().perform();

    }

       @Entao("será exibido a mensagem {string}")
        public void seráExibidoAMensagem(String arg0) {
        boolean suporte = true;

        // VALIDANDO ITEM EXISTENTE
        String SUPORTE = navegador.findElement(By.xpath("//*[@id=\"huc-v2-order-row-confirm-text\"]/h1")).getText();
        assertEquals("Adicionado ao carrinho", SUPORTE);
        if (suporte) {
            System.out.println(" ITEM ADICIONADO NO CARRINHO COM SUCESSO!");
        } else {

            System.out.println(" PRODUTO NÃO ADICIONADO AO CARRINHO, TENTE NOVAMENTE!");
        }


    }

    //SITUAÇÃO 3
    @Dado("clico em fechar pedido")
    public void clico_em_fechar_pedido() {
        Actions actions = new Actions(navegador);
        actions.moveToElement(navegador.findElement(By.id("hlb-ptc-btn-native")));
        actions.click();
        actions.build().perform();

    }

    @Dado("adiciono os meus dados cadastrais")
    public void adiciono_os_meus_dados_cadastrais() throws InterruptedException {
        Actions actions = new Actions(navegador);
        //Nome usuario
       /* actions.moveToElement(navegador.findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressFullName\"]")));
        actions.click();
        actions.sendKeys("Isa Pinheiro");
        actions.build().perform();

        */
        //Telefone
        actions.moveToElement(navegador.findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressPhoneNumber\"]")));
        actions.click();
        actions.sendKeys("0713333-3330");
        actions.build().perform();
        //Cep
        actions.moveToElement(navegador.findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressPostalCode\"]")));
        actions.click();
        actions.sendKeys("40335000");
        actions.build().perform();
       //clica no botão validar cep
        Thread.sleep(2000);
        actions.moveToElement(navegador.findElement(By.xpath("//span[@id='address-ui-widgets-enterAddressPostalCode-submit-announce' and . ='Validar CEP']")));
        actions.click();
        actions.build().perform();
        Thread.sleep(2000);
        //Informe número da residencia
        actions.moveToElement(navegador.findElement(By.id("address-ui-widgets-buildingNumber")));
        actions.click();
        Thread.sleep(1000);
        actions.sendKeys("17");
        actions.build().perform();
        JavascriptExecutor jse = (JavascriptExecutor) navegador;
        jse.executeScript("window.scrollBy(0,250)", "");
        //Clica notão adicionar Endereço
        actions.moveToElement(navegador.findElement(By.xpath("//*[@id=\"address-ui-widgets-form-submit-button\"]/span/input")));
        actions.click();
        actions.build().perform();

    }

// Realiza pagamento via cartao de credito

    @Dado("realizo pagamento via cartão de credito")
    public void realizo_pagamento_via_cartão_de_credito() throws InterruptedException {

        //rola pra cima (scroll)
        JavascriptExecutor jse = (JavascriptExecutor) navegador;
        jse.executeScript("window.scrollBy(0,-250)", "");
         Actions actions = new Actions(navegador);
         actions.moveToElement(navegador.findElement(By.cssSelector("#pp-kcRlwt-87")));
         actions.click();
         actions.build().perform();



    }
    @Quando("clico no botão continuar")    public void clico_no_botão_continuar() {
        Actions actions = new Actions(navegador);
        // clico em adicionar cartao
        actions.moveToElement(navegador.findElement(By.xpath("//*[@id=\"pp-4alKZt-90\"]/span/input")));
        actions.click();
        actions.build().perform();
        System.out.println("Botão Continuar Clicado!");

    }
    @Entao("o botão continuar ficará inativo, e a simulação da compra foi realizada com sucesso.")
    public void o_botão_continuar_ficará_inativo_e_a_simulação_da_compra_foi_realizada_com_sucesso() {

        String btcontinuar = navegador.findElement(By.xpath("//*[@id=\"pp-jPGjSi-76\"]/span/input")).getText();
        assertEquals("Continuar", btcontinuar);
        System.out.println(" BOTÃO CONTINUAR FOI CLICADO E ESTÁ INATIVO, VALIADO OK!");
        navegador.quit();

    }

}
