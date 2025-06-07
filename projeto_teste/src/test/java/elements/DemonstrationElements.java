package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class DemonstrationElements {


    // Demo Request Form
    @FindBy(xpath = "//h1[@class='mb-0']") public WebElement titulo;
    @FindBy(xpath = "//p[@class='mt0']") public WebElement subtitulo;
    @FindBy(xpath = "//input[@name='first_name']") public WebElement firstName;
    @FindBy(xpath = "//input[@name='last_name']") public WebElement lastName;
    @FindBy(xpath = "//select[@name='country_id']") public WebElement selectCountry;
    @FindBy(xpath = "//input[@name='whatsapp']") public WebElement whatsapp;
    @FindBy(xpath = "//input[@name='business_name']") public WebElement businessName;
    @FindBy(xpath = "//input[@name='email']") public WebElement email;
    @FindBy(xpath = "//button[@id='demo']") public WebElement btnSubmit;
    @FindBy(xpath = "//span[@id='numb1']") public WebElement somaNumero1;
    @FindBy(xpath = "//span[@id='numb2']") public WebElement somaNumero2;
    @FindBy(xpath = "//input[@style='height:58px;']") public WebElement campoResult;
    @FindBy(xpath = "//p[@class='m-0']") public WebElement msgErroEmail;
    @FindBy(xpath = "//div[@class='completed']") public WebElement msgSucesso;

}
