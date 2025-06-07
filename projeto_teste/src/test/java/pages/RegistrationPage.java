package pages;

import elements.RegistrationElements;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class RegistrationPage extends RegistrationElements {
    private WebDriver driver;
    private WebDriverWait wait;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public void acessarPaginaRegistration() {
        driver.get("https://app.phptravels.com/signup");
    }

    public void validarExibCampoFirstName() {
        Assertions.assertTrue(firstnameRegistration.isDisplayed());
    }

    public void digitarCampoFirstName(String nome) {
        firstnameRegistration.sendKeys(nome);
    }

    public void validarExibCampoLastName() {
        Assertions.assertTrue(lastnameRegistration.isDisplayed());
    }

    public void digitarCampoLastName(String nome) {
        lastnameRegistration.sendKeys(nome);
    }

    public void validarExibCampoEmailRegistration() {
        Assertions.assertTrue(emailRegistration.isDisplayed());
    }

    public void digitarCampoEmailRegistration(String email) {
        emailRegistration.sendKeys(email);
    }

    public void validarExibCampoPasswordRegistration() {
        Assertions.assertTrue(passwordRegistration.isDisplayed());
    }

    public void digitarCampoPasswordRegistration(String senha) {
        passwordRegistration.sendKeys(senha);
    }

    public void validarExibCampoSelectCountry() {
        Assertions.assertTrue(selectCountryRegistration.isDisplayed());
    }

    public void selecionarSelectCountry(String pais) {
        selectCountryRegistration.sendKeys(pais);
    }

    public void validarExibCampoWhatsapp() {
        Assertions.assertTrue(whatsappNumberRegistration.isDisplayed());
    }

    public void digitarCampoWhatsapp(String telefone) {
        whatsappNumberRegistration.sendKeys(telefone);
    }

    public void ClicarBtnSignup() {
        Actions action = new Actions(driver);
        action.moveToElement(btnSignup).click().perform();
    }
    public void ClicarBtnBacktoLogin() {
        Actions action = new Actions(driver);
        action.moveToElement(btnBacktoLogin).click().perform();
    }

    public void clickRecaptchaCheckbox() {
        recaptchaCheckbox.click();
    }

    public void validarDirecionamentoPagLogin() {
        Set<String> aba = driver.getWindowHandles();
        List<String> abasAbertas = new ArrayList<>(aba);
        driver.switchTo().window(abasAbertas.get(3));
        Assertions.assertEquals("Login", driver.getTitle());
    }
    public void validarErrorMessageNoCampos() {
        Assertions.assertEquals("Preencha este campo",errorMessage.getText());
    }
    public void validarMensagemEmailExistes() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(emailExistsErrorMessage));
        Assertions.assertEquals("Email exist please use different email or reset password to use this email", emailExistsErrorMessage.getText());
    }
}

