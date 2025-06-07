package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.DemonstrationPage;
import pages.RegistrationPage;


public class RegistrationSteps {

    private  WebDriver driver;
    private RegistrationPage registrationPage;

    @Before
    public void iniciarDriver(){
        System.setProperty("webdriver.chrome.driver",  "C://School_Automacao//projeto_teste//src//test//resources//drivers/chromedriver.exe");
        driver = new ChromeDriver();
        RegistrationPage registrationPage = new RegistrationPage(driver);
        driver.manage().window().maximize();
    }

@Given("que o usuário esteja na página Registration")
    public void queOusuarioEstejanaPaginaRegistration(){
        registrationPage.acessarPaginaRegistration();
}
@When("localizar o campo First Name")
public void localizarOCampoFirstName() {
    registrationPage.validarExibCampoFirstName();
}
    @And("localizar o campo Last Name")
    public void localizarOCampoLastName() {
        registrationPage.validarExibCampoLastName();
    }

    @And("localizar o campo Email")
    public void localizarOCampoEmail() {
        registrationPage.validarExibCampoEmailRegistration();
    }

    @And("localizar o campo Password")
    public void localizarOCampoPassword() {
        registrationPage.validarExibCampoPasswordRegistration();
    }

    @And("localizar o campo Select Country")
    public void localizarOCampoSelectCountry() {
        registrationPage.validarExibCampoSelectCountry();
    }

    @And("localizar o campo Whatsapp Number")
    public void localizarOCampoWhatsappNumber() {
        registrationPage.validarExibCampoWhatsapp();
    }

    @Then("validar que todos estão visíveis")
    public void validarQueTodosEstaoVisiveis() {
    }

    @When("localizar o botão Signup")
    public void localizarOBotaoSignup() {
        registrationPage.ClicarBtnSignup();
    }

    @Then("validar que o nome do botão esteja correto")
    public void validarQueONomeDoBotaoEstejaCorreto() {
    }

    @When("preencher os campos First Name, Last Name, Email, Password, Select Country, Whatsapp Number")
    public void preencherOsCamposFirstNameLastNameEmailPasswordSelectCountryWhatsappNumber() {
        registrationPage.digitarCampoFirstName("Rosane");
        registrationPage.digitarCampoLastName("Paixao");
        registrationPage.digitarCampoEmailRegistration("rosanepaixaoqa@gmail.com");
        registrationPage.digitarCampoPasswordRegistration("1234");
        registrationPage.selecionarSelectCountry("+55 Brasil");
        registrationPage.digitarCampoWhatsapp("9625552636");
    }

    @And("seleciona a caixa Não sou um robô")
    public void selecionaACaixaNaoSouUmRobo() {
        registrationPage.clickRecaptchaCheckbox();
    }

    @And("clicar no botão Signup")
    public void clicarNoBotaoSignup() {
        registrationPage.ClicarBtnSignup();
    }

    @Then("o sistema exibirá uma mensagem de email já existe")
    public void oSistemaExibiraUmaMensagemDeEmailJaExiste() {
        registrationPage.validarMensagemEmailExistes();
    }

    @And("não preenche as informações de nenhum campo")
    public void naoPreencheAsInformacoesDeNenhumCampo() {
    }

    @Then("uma mensagem de erro deve ser exibida indicando que o campo First Name é obrigatório e os outros campos tambem")
    public void umaMensagemDeErroDeveSerExibidaIndicandoQueOCampoFirstNameEObrigatorioEOsOutrosCamposTambem() {
        registrationPage.validarErrorMessageNoCampos();
    }

    @When("clica no botão Back to Login")
    public void clicaNoBotaoBackToLogin() {
        registrationPage.ClicarBtnBacktoLogin();
    }

    @Then("ele será redirecionado para a página de Login Panel")
    public void eleSeraRedirecionadoParaAPaginaDeLoginPanel() {
        registrationPage.validarDirecionamentoPagLogin();
    }
    @After
    public void fecharDeiver(){
        driver.quit();
    }
}
