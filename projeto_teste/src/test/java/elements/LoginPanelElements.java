package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPanelElements {
    @FindBy(xpath = "//input[@name='email']") public WebElement emailLogin;
    @FindBy(xpath = "//input[@name='password']") public WebElement passwordLogin;
    @FindBy(xpath = "//input[@name='form-check-input']") public WebElement checkBoxRememberMe;
    @FindBy(xpath = "//button[@id='submit']") public WebElement loginButton;
    @FindBy(xpath = "//div[@class='vt-card success']") public WebElement mesagemDeSucesso;

}
