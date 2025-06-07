package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PHPTRAVELSElements {

    @FindBy(xpath = "//a[class='navbar-brand col-md-2 p-md-2 p-2 rounded-2 d-flex m-0 waves-effect']") public WebElement logoPhptravels;
    @FindBy(xpath = "//a[@href='https://phptravels.com/pricing']") public WebElement clickButtonPricing;
    @FindBy(xpath = "//a[@href='https://www.facebook.com/phptravels']") public WebElement facebookIcon;
    @FindBy(xpath = "//a[@href='https://phptravels.com/abuse-policy']") public WebElement abusePolicyLink;
    @FindBy(xpath = "//a[@href='https://phptravels.com/privacy-statement']") public WebElement privacyPolicyLink;

}
