package pages;

import elements.ForgetPasswordElements;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ForgetPasswordPage extends ForgetPasswordElements {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;

    public ForgetPasswordPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public void acessarSite() {
        driver.get("https://app.phptravels.com/user-forget-password");
    }

    public void validarTituloPagForgetPassaword(){
        Assertions.assertEquals("Forget Password", tituloForgetPassword.getText());
    }
    public void validarSubtituloPagForgetPassaword(){
        Assertions.assertEquals("Please enter your email below", subtituloForgetPassword.getText());
        }
        public void preencherEmailInvalido(String emailinvalido){
        emailForget.sendKeys(emailinvalido);
        }
        public void preencherCampoEmailForget(String email){
        emailForget.sendKeys(email);
        }
    public void deixarEmailVazio() {
        emailForget.clear();
    }

        public void clicarEmResetPassword(){
        Actions actions = new Actions(driver);
        actions.moveToElement(btnResetPassword).click().perform();
        }
    public void  validarMensagemDeAlertaForget(){
        Alert alert = driver.switchTo().alert();
        Assertions.assertEquals("Email is required to reset password", alert.getText());
    }
    public void mensagemDeErroExibida() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(errorMessage));
        Assertions.assertEquals("Invalid Email Address No Account found with this email", errorMessage.getText());
    }
    public void mensagemSucesso(){
        Assertions.assertEquals("ResetPassword New pasword has been sent to your mail", msgDeSucesso.getText());
    }
    public void clicarBtnBackToLogin(){
        btnBacktoLogin.click();
    }
    public void validarDirecionamentoPagLogin(){
        Set<String> aba = driver.getWindowHandles();
        List<String> abasAbertas= new ArrayList<>();
        driver.switchTo().window(abasAbertas.get(3));
        Assertions.assertEquals("Login", driver.getTitle());

    }
    public void marcarRecaptcha(){
        recaptchaCheckbox.click();
    }




}
