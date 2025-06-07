package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ForgetPasswordPage;



public class ForgetPasswordSteps {
    private WebDriver driver;
    private ForgetPasswordPage forgetPasswordPage;


    @Before
    public void iniciarDriver(){
        System.setProperty("webdriver.chrome.driver",  "C://School_Automacao//projeto_teste//src//test//resources//drivers/chromedriver.exe");
        driver = new ChromeDriver();
        forgetPasswordPage = new ForgetPasswordPage(driver);
    }

    @Given("que o usuário esteja na página Forget Password")
    public void queOUsuarioEstejaNaPaginaForgetPassword(){
        forgetPasswordPage.acessarSite();
    }
    @When("o usuário visualiza a página")
    public void oUsuarioVisualizaAPagina() {
        forgetPasswordPage.acessarSite();
    }

    @Then("o título da página deve ser exibido como Forget Password no cabeçalho")
    public void oTituloDaPaginaDeveSerExibidoComoForgetPasswordNoCabecalho() {
        forgetPasswordPage.validarTituloPagForgetPassaword();
    }

    @And("o subtítulo deve ser Please enter your email below")
    public void oSubtituloDeveSerPleaseEnterYourEmailBelow() {
        forgetPasswordPage.validarSubtituloPagForgetPassaword();
    }

    @When("digita um email válido no campo Email")
    public void digitaUmEmailValidoNoCampoEmail() {
        forgetPasswordPage.preencherCampoEmailForget("rosanepaixaoqa@gmail.com");
    }

    @Then("uma mensagem de confirmação deve ser exibida indicando que o email de recuperação foi enviado")
    public void umaMensagemDeConfirmacaoDeveSerExibidaIndicandoQueOEmailDeRecuperacaoFoiEnviado() {
        forgetPasswordPage.mensagemSucesso();
    }
    @When("não preenche o campo Email")
    public void naoPreencheOCampoEmail() {
        forgetPasswordPage.deixarEmailVazio();
    }

    @Then("uma mensagem de erro deve ser exibida indicando que o campo email é obrigatório")
    public void umaMensagemDeErroDeveSerExibidaIndicandoQueOCampoEmailEObrigatorio() {
        forgetPasswordPage.validarMensagemDeAlertaForget();
    }

    @When("preenche um email inválido no campo Email")
    public void preencheUmEmailInvalidoNoCampoEmail() {
        forgetPasswordPage.preencherEmailInvalido("rosane123@gmail");
    }

    @And("marca a opção Não sou um robô")
    public void marcaAOpcaoNaoSouUmRobo() {
        forgetPasswordPage.marcarRecaptcha();
    }

    @And("clica no botão Reset Password")
    public void clicaNoBotaoResetPassword() {
        forgetPasswordPage.clicarEmResetPassword();
    }

    @Then("uma mensagem de erro deve ser exibida indicando que o email fornecido não é válido")
    public void umaMensagemDeErroDeveSerExibidaIndicandoQueOEmailFornecidoNaoEValido() {
        forgetPasswordPage.mensagemDeErroExibida();

    }

    @When("clicar no botão Back to Login")
    public void clicarNoBotaoBackToLogin() {
        forgetPasswordPage.clicarBtnBackToLogin();
    }
    @Then("o sistema direciona para a página de login")
    public void oSistemaDirecionaParaAPaginaDeLogin() {
        forgetPasswordPage.validarDirecionamentoPagLogin();
    }
    @After
    public void fecharDeiver(){
        driver.quit();
    }

}



