package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPanelPage;


public class LoginPanelSteps {
    private WebDriver driver;
    private  LoginPanelPage loginPanelPage;


    @Before
    public void iniciarDriver(){
        System.setProperty("webdriver.chrome.driver",  "C://School_Automacao//projeto_teste//src//test//resources//drivers/chromedriver.exe");
    driver = new ChromeDriver();
        LoginPanelPage loginPanelPage = new LoginPanelPage(driver);
    }

    @Given("que o usuário esteja na página Login Panel")
    public void OqueOUsuarioEstejaNaPaginaLoginPanel(){
        loginPanelPage.acessarPagina();
    }

    @When("visualizar o campo Email")
    public void visualizarOCampoEmail() {
        loginPanelPage.visualizarCampoEmail();
    }

    @Then("digita seu email no campo Email")
    public void digitaSeuEmailNoCampoEmail() {
        loginPanelPage.digitarEmail("rosanepaixaoqa@gmail.com");
    }

    @When("visualizar o campo Password")
    public void visualizarOCampoPassword() {
        loginPanelPage.visualizarCampoPassword();
    }

    @Then("digita sua senha no campo Password")
    public void digitaSuaSenhaNoCampoPassword() {
        loginPanelPage.digitarSenha("123098mnj");
    }

    @When("clicar no botão Login")
    public void clicarNoBotaoLogin() {
        loginPanelPage.clicarBotaoLogin();
    }

    @Then("o sistema exibirá uma mensagem Email is required to login na tela")
    public void oSistemaExibiraUmaMensagemEmailIsRequiredToLoginNaTela() {
        loginPanelPage.verificarMensagemErroLogin();
    }

    @When("preencher o campo de Email")
    public void preencherOCampoDeEmail() {
        loginPanelPage.digitarEmail("rosanepaixaoqa@gmail.com");
    }

    @And("Password valido")
    public void passwordValido() {
        loginPanelPage.digitarSenha("B>8ckb5s");
    }

    @Then("o sistema exibirá uma mensagem de sucesso")
    public void oSistemaExibiraUmaMensagemDeSucesso() {
        loginPanelPage.mensagemSucesso();
    }

    @When("visualizar o botão Remember Me")
    public void visualizarOBotaoRememberMe() {
        loginPanelPage.visualizarCampoEmail();
    }

    @And("clicar no icone do Remember Me")
    public void clicarNoIconeDoRememberMe() {
        loginPanelPage.marcarRememberMe();
    }

    @Then("o icone será marcado com sucesso")
    public void oIconeSeraMarcadoComSucesso() {
        loginPanelPage.verificarCheckboxRememberMeMarcado();
    }
    @After
    public void fecharDeiver(){
        driver.quit();
    }
}
