package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BasePage;
import pages.DemonstrationPage;

import static org.junit.Assert.assertEquals;

public class DemonstrationSteps {
    private  WebDriver driver;
    private DemonstrationPage demonstrationPage;
@Before
    public void iniciarDriver(){
    System.setProperty("webdriver.chrome.driver", "C://School_Automacao//projeto_teste//src//test//resources//drivers/chromedriver.exe");
    driver = new ChromeDriver();
    demonstrationPage = new DemonstrationPage(driver);
    driver.manage().window().maximize();
}

    @Given("que o usuário esteja na página de demonstração do PHPTRAVELS")
    public void queOUsuarioEstejaNaPaginaDeDemonstracaoDoPHPTRAVELS() {
    demonstrationPage.acessarSite();
    }

    @When("o usuário verifica o título")
    public void oUsuarioVerificaOTitulo() {
    demonstrationPage.visualizarOTituloDemonstration();
    }
    @And("o subtítulo da página")
    public void oSubtituloDaPagina() {
    demonstrationPage.visualizarOSubtituloDemonstration();
    }
    
    @Then("o usuário deve ver Demonstration no título")
    public void oUsuarioDeveVerDemonstrationNoTitulo() {
    demonstrationPage.visualizarOTituloDemonstration();
    }

    @And("o usuário deve ver Test drive online the demo product available with complete features no subtítulo")
    public void oUsuarioDeveVerTestDriveOnlineTheDemoProductAvailableWithCompleteFeaturesNoSubtitulo() {
    demonstrationPage.visualizarOSubtituloDemonstration();
    }

    @When("visualizar o campo First Name")
    public void visualizarOCampoFirstName() {
    demonstrationPage.firstName.click();
    }


    @And("não preenche o campo First Name")
    public void naoPreencheOCampoFirstName() {
    }

    @And("clicar no botão Submit")
    public void clicarNoBotaoSubmit() {
    demonstrationPage.clicarBtnSubmit();
    }

    @Then("o sistema exibirá uma mensagem que o campo first name e obrigatorio")
    public void oSistemaExibiraUmaMensagemQueOCampoFirstNameEObrigatorio() {
    demonstrationPage.validarMensagemDeAlerta();
    }

    @And("preenche o campo Email com email invalido")
    public void preencheOCampoEmailComEmailInvalido() {
    demonstrationPage.digitarCampoEmail("usuario@exemplo");

    }

    @When("clica no botão Submit")
    public void clicaNoBotaoSubmit() {
    demonstrationPage.clicarBtnSubmit();
    }

    @Then("o sistema irá exibira uma mensagem de erro")
    public void oSistemaIraExibiraUmaMensagemDeErro() {
    demonstrationPage.mensagemErroEmail();
    }

    @When("visualizar os números exibidos")
    public void visualizarOsNumerosExibidos() {
    }
    @And("inserir a soma dos dois números no campo de resultado")
    public void inserirASomaDosDoisNumerosNoCampoDeResultado() {
    demonstrationPage.inserirSomaNoCampoResultado();
    }
    @Then("o campo de resultado deve exibir o valor correto da soma")
    public void oCampoDeResultadoDeveExibirOValorCorretoDaSoma() {
        int resultadoEsperado = Integer.parseInt(demonstrationPage.obterTextoDoNumero1()) +
                Integer.parseInt(demonstrationPage.obterTextoDoNumero2());
        assertEquals(String.valueOf(resultadoEsperado), demonstrationPage.obterResultado());
    }

    @When("preencher os campos First Name, Last Name, Select Country, Whatsapp Number, Business Name, Email e o resultado da soma apresentada na tela")
    public void preencherOsCamposFirstNameLastNameSelectCountryWhatsappNumberBusinessNameEmailEOResultadoDaSomaApresentadaNaTela() {
    demonstrationPage.digitarCampoFirstName("Rosane");
    demonstrationPage.digitarCampoLastName("Paixão");
    demonstrationPage.selecionarPais("Brasil");
    demonstrationPage.digitarCampoWhatsappNumber("11999857868");
    demonstrationPage.digitarCampoBusinessName("MJV");
    demonstrationPage.digitarCampoEmail("rosane@gmail.com");

    }

    @And("clicar np botão Submit")
    public void clicarNpBotaoSubmit() {
    demonstrationPage.clicarBtnSubmit();
    }

    @Then("o sistema irá realizar o envio do formulário apresentando mensagem de sucesso")
    public void oSistemaIraRealizarOEnvioDoFormularioApresentandoMensagemDeSucesso() {
    demonstrationPage.validarMensagemDeSucesso();
    }
    @After
    public void fecharDeiver(){
        driver.quit();
    }

}






