package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgetPasswordElements {
    @FindBy(xpath = "//p[@class='mb-0 text-center']") public WebElement tituloForgetPassword;
    @FindBy(xpath = "//p[@class='mb-0 text-center']") public WebElement subtituloForgetPassword;
    @FindBy(xpath = "//a[@href='href=https://app.phptravels.com/user-forget-password']") public WebElement bntforgetPassword;
    @FindBy(xpath = "//input[@class='form-control rounded-3']") public WebElement emailForget;
    @FindBy(xpath = "//span[@id='recaptcha-anchor']") public WebElement recaptchaCheckbox;
    @FindBy(xpath = "//button[@id='submit']") public WebElement btnResetPassword;
    @FindBy(xpath = "//a[@href='href=\"./login\"']") public WebElement btnBacktoLogin;
    @FindBy(xpath = "//div[@class='vt-card error']") public WebElement errorMessage;
    @FindBy(xpath = "//div[@class='vt-card success']") public WebElement msgDeSucesso;

}
