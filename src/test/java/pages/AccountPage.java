package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AccountPage {

    public AccountPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@id='nav-link-accountList'])[1]")
    public WebElement signIn;

    @FindBy(xpath = "//a[@id='createAccountSubmit']")
    public WebElement createAccount;

    @FindBy(xpath = "//input[@id='ap_customer_name']")
    public WebElement name;

    @FindBy(xpath = "//input[@id='ap_email']")
    public WebElement email;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@name='passwordCheck']")
    public WebElement passwordCheck;

    @FindBy(xpath = "//input[@id='continue']")
    public WebElement cont;

    @FindBy(xpath = "//button[@data-theme='home.verifyButton']")
    public WebElement startPuzzle;

    //button[@class='sc-nkuzb1-0 sc-d5trka-0 eZxMRy button']

    @FindBy(xpath = "(//div[@class='a-row a-spacing-small'])[1]")
    public WebElement verifyEmailAddress;


}
