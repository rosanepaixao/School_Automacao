package pages;

import elements.LoginPanelElements;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPanelPage extends LoginPanelElements {
    private WebDriver driver;
    private WebDriverWait wait;

    public LoginPanelPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }
    public void acessarPagina() {
        driver.get("https://app.phptravels.com/login");
    }
    public void visualizarCampoEmail() {
        emailLogin.isDisplayed();
    }
    public void digitarEmail(String email){
        emailLogin.sendKeys(email);
    }
    public void visualizarCampoPassword() {
        passwordLogin.isDisplayed();
    }
    public void digitarSenha(String senha) {
        passwordLogin.sendKeys(senha);
    }
    public void clicarBotaoLogin() {
        Actions action = new Actions(driver);
        action.moveToElement(loginButton).click().perform();
    }
    public boolean verificarMensagemErroLogin() {
        Alert alert = driver.switchTo().alert();
        Assertions.assertEquals("Email is required to login", alert.getText());
        return false;
    }
    public void marcarRememberMe() {
        if (!checkBoxRememberMe.isSelected()) {
            checkBoxRememberMe.click();
        }
    }
    public boolean verificarCheckboxRememberMeMarcado() {
        checkBoxRememberMe.isSelected();
        return false;
    }
    public  void mensagemSucesso(){
        Assertions.assertEquals("Activate Your Account Please check your mailbox for account activation",mesagemDeSucesso.getText());
    }
    }
