package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationElements {
    @FindBy(xpath = "//input[@name='first_name']") public WebElement firstnameRegistration;
    @FindBy(xpath = "//input[@name='last_name']") public WebElement lastnameRegistration;
    @FindBy(xpath = "//input[@name='email']") public WebElement emailRegistration;
    @FindBy(xpath = "//input[@name='password']") public WebElement passwordRegistration;
    @FindBy(xpath = "//select[@name='country_id']") public WebElement selectCountryRegistration;
    @FindBy(xpath = "//input[@name='mobile']") public WebElement whatsappNumberRegistration;
    @FindBy(xpath = "//button[@class='rounded-3 login_button mt-1 btn btn-dark w-100 btn-lg']") public WebElement btnSignup;
    @FindBy(xpath = "//input[@class='recaptcha-checkbox-checkmark']") public WebElement recaptchaCheckbox;
    @FindBy(xpath="//input[@id='first_name_id']/following-sibling::span") public WebElement errorMessage;
    @FindBy(xpath ="//p[@class='alert alert-danger mt-3']") public  WebElement  emailExistsErrorMessage;
    @FindBy(xpath = "//a[@href='href=\"./login\"']") public WebElement btnBacktoLogin;


}

