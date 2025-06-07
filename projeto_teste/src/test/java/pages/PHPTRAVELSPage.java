package pages;

import elements.PHPTRAVELSElements;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class PHPTRAVELSPage extends PHPTRAVELSElements {

    private WebDriver driver;
    private WebDriverWait wait;

    public PHPTRAVELSPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public void acessarSite() {
        driver.get("https://phptravels.com/demo");
    }
    public void validarlogoTipovisivel(){
        Assertions.assertTrue(logoPhptravels.isDisplayed());
    }
    public void validarlogo(){
        Assertions.assertEquals("PHPTRAVELS Travel Tech Partner", driver.getTitle());
    }

    public void clickPricingButton() {
        Actions action = new Actions(driver);
        action.moveToElement(clickButtonPricing).click().perform();
    }
    public void clickFacebookIcon(){
        Actions action = new Actions(driver);
        action.moveToElement(facebookIcon).click().perform();
    }
    public void clickAbusePolicy(){
        Actions action = new Actions(driver);
        action.moveToElement(abusePolicyLink).click().perform();
    }
    public void clickPrivacyPolicy() {
        Actions action = new Actions(driver);
        action.moveToElement(privacyPolicyLink).click().perform();
    }
    public void validarDirecionamentoPagPreco() {
        Set<String> aba = driver.getWindowHandles();
        List<String> abasAbertas = new ArrayList<>(aba);
        driver.switchTo().window(abasAbertas.get(2));
        Assertions.assertEquals("Plans and Prices", driver.getTitle());
    }
    public void validarDirecionamentoPagFacebook() {
        Set<String> aba = driver.getWindowHandles();
        List<String> abasAbertas = new ArrayList<>(aba);
        driver.switchTo().window(abasAbertas.get(2));
        Assertions.assertEquals("Facebook.com", driver.getTitle());
    }
    public void validarDirecionamentoPagPrivacyPolicy() {
        Set<String> aba = driver.getWindowHandles();
        List<String> abasAbertas = new ArrayList<>(aba);
        driver.switchTo().window(abasAbertas.get(2));
        Assertions.assertEquals("Privacy And Policy", driver.getTitle());
    }
    public void validarDirecionamentoPagAbusePolicy() {
        Set<String> aba = driver.getWindowHandles();
        List<String> abasAbertas = new ArrayList<>(aba);
        driver.switchTo().window(abasAbertas.get(2));
        Assertions.assertEquals("Abuse Policy", driver.getTitle());
    }

}
