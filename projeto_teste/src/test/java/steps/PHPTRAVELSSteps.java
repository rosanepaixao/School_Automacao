package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.PHPTRAVELSPage;
import pages.RegistrationPage;

public class PHPTRAVELSSteps {
    private WebDriver driver;
    private PHPTRAVELSPage phptravelsPage;


@Before
public void iniciarDriver() {
    System.setProperty("webdriver.chrome.driver",  "C://School_Automacao//projeto_teste//src//test//resources//drivers/chromedriver.exe");
    driver = new ChromeDriver();
    PHPTRAVELSPage phptravelsPage = new PHPTRAVELSPage(driver);
    driver.manage().window().maximize();
}

@Given("que o usuário esteja na página inicial do site PHPTRAVELS")
    public void queOUsuarioEstejaNaPaginaInicialDoSitePHPTRAVELS(){
    phptravelsPage.acessarSite();
}


    @Then("o logotipo PHPTRAVELS Travel Tech Partner está visível")
    public void oLogotipoPHPTRAVELSTravelTechPartnerEstaVisivel() {
        phptravelsPage.validarlogoTipovisivel();
    }
    @And("logotipo esta escrito PHPTRAVELS Travel Tech Partner")
    public void logotipoEstaEscritoPHPTRAVELSTravelTechPartner() {
            phptravelsPage.validarlogo();
    }

    @Given("que o usuário esteja no rodapé do site PHPTRAVELS")
    public void queOUsuarioEstejaNoRodapeDoSitePHPTRAVELS() {
    phptravelsPage.acessarSite();
    }

    @When("clica em Abuse Policy")
    public void clicaEmAbusePolicy() {
    phptravelsPage.clickAbusePolicy();
    }

    @Then("será redirecionado para a página de política de abuso")
    public void seraRedirecionadoParaAPaginaDePoliticaDeAbuso() {
    phptravelsPage.validarDirecionamentoPagAbusePolicy();
    }

    @When("clica em Privacy Policy")
    public void clicaEmPrivacyPolicy() {
    phptravelsPage.validarDirecionamentoPagPrivacyPolicy();
    }

    @Then("será redirecionado para a página de política de privacidade")
    public void seraRedirecionadoParaAPaginaDePoliticaDePrivacidade() {
    phptravelsPage.validarDirecionamentoPagPrivacyPolicy();
    }

    @When("clica no botão Pricing")
    public void clicaNoBotaoPricing() {
    phptravelsPage.clickPricingButton();
    }

    @Then("Ele é redirecionado para a página de preços")
    public void eleERedirecionadoParaAPaginaDePrecos() {
    phptravelsPage.validarDirecionamentoPagPreco();
    }

    @When("clica no ícone do Facebook")
    public void clicaNoIconeDoFacebook() {
    phptravelsPage.clickFacebookIcon();
    }

    @Then("será redirecionado para a página do Facebook da empresa")
    public void seraRedirecionadoParaAPaginaDoFacebookDaEmpresa() {
    phptravelsPage.validarDirecionamentoPagFacebook();
    }
    @After
    public void fecharDeiver(){
        driver.quit();
    }
}