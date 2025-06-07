package pages;

import elements.DemonstrationElements;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DemonstrationPage extends DemonstrationElements {
    private WebDriver driver;

    public DemonstrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void acessarSite() {
        driver.get("https://phptravels.com/demo");
    }

    public void visualizarOTituloDemonstration(){
        Assertions.assertEquals("Demonstration", titulo.getText());
    }
    public void visualizarOSubtituloDemonstration(){
        Assertions.assertEquals("Test drive online the demo product available with complete features",subtitulo.getText());
    }
    public void digitarCampoFirstName(String nome) {
        firstName.sendKeys(nome);
    }
    public void digitarCampoLastName(String sobrenome) {
        lastName.sendKeys(sobrenome);
    }

    public void selecionarPais(String pais) {
        selectCountry.sendKeys(pais);
    }

    public void digitarCampoWhatsappNumber(String zap) {
        whatsapp.sendKeys(zap);
    }

    public void digitarCampoBusinessName(String empresa) {
        businessName.sendKeys(empresa);
    }

    public void digitarCampoEmail(String EMAIL) {
        email.sendKeys(EMAIL);
    }

    public String obterTextoDoNumero1() {
        return somaNumero1.getText();
    }

    public String obterTextoDoNumero2() {
        return somaNumero2.getText();
    }
    public void inserirSomaNoCampoResultado() {
        int num1 = Integer.parseInt(obterTextoDoNumero1());
        int num2 = Integer.parseInt(obterTextoDoNumero2());
        int resultado = num1 + num2;
        campoResult.clear();
        campoResult.sendKeys(String.valueOf(resultado));
    }

    public String obterResultado() {
        return campoResult.getAttribute("value");
    }

    public void clicarBtnSubmit() {
        Actions action = new Actions(driver);
        action.moveToElement(btnSubmit).click().perform();
    }

    public void mensagemErroEmail() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(msgErroEmail));
        Assertions.assertEquals("Email address is not valid. please use real email address", msgErroEmail.getText());
    }
    public void  validarMensagemDeAlerta(){
        Alert alert = driver.switchTo().alert();
        Assertions.assertEquals("Please type your first name", alert.getText());
    }
    public void validarMensagemDeSucesso(){
        Assertions.assertEquals("Thank you!\n" + "We have sent your demo credentials to your email please check your mailbox. if demo credentials not found inbox please check spam folder", msgSucesso.getText());
    }

}