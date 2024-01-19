package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AccountPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static hooks.Hooks.driver;

public class AccountStepdefs {
AccountPage accountPage=new AccountPage();
    @Given("user goes to homepage")
    public void user_goes_to_homepage() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("google_url"));
        driver.get("https://www.amazon.co.uk/");
        Thread.sleep(3000);
    }

    @When("user goes to the Hello sign in block")
    public void user_goes_to_the_hello_sign_in_block() {

    accountPage.signIn.click();
        ReusableMethods.waitFor(2);
    }

    @When("user clicks create your amazon account button")
    public void user_clicks_create_your_amazon_account_button() {
    accountPage.createAccount.click();
    ReusableMethods.waitFor(2);
    }

    @And("user enters name {string}")
    public void userEntersName(String name) {
        accountPage.name.sendKeys(name);
        ReusableMethods.waitFor(2);
    }

    @And("user enters email {string}")
    public void userEntersEmail(String email) {
    accountPage.email.sendKeys(email);
        ReusableMethods.waitFor(2);
    }

    @And("user enters password {string}")
    public void userEntersPassword(String password) {
        accountPage.password.sendKeys(password);
        ReusableMethods.waitFor(2);
    }

    @And("user enters repassword{string}")
    public void userEntersRepassword(String repassword) {
        accountPage.passwordCheck.sendKeys(repassword);
        ReusableMethods.waitFor(2);
    }
    @When("user clicks continue button")
    public void user_clicks_continue_button() {
        accountPage.cont.click();
        ReusableMethods.waitFor(2);

    }

    @When("user click start puzzle button")
    public void user_click_start_puzzle_button() throws InterruptedException {
    accountPage.startPuzzle.click();
    Thread.sleep(5);

    }

    @Then("user verifies the {string} is visible")
    public void user_verifies_the_is_visible(String string) {
    Assert.assertTrue(accountPage.verifyEmailAddress.isDisplayed());
    ReusableMethods.waitFor(2);
    }


    @Then("user verifies the {string} is not visible")
    public void userVerifiesTheIsNotVisible(String arg0) {

    }



}
