package StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.LoginPage;

public class LoginSteps {
    WebDriver driver;
    LoginPage loginPage;

    @Given("^I am on the SwagLabs login page$")
    public void iAmOnTheSwagLabsLoginPage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        loginPage.open();
    }

    @When("^I enter valid username and password$")
    public void iEnterValidUsernameAndPassword() {
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
    }

    @And("^I click the login button$")
    public void iClickTheLoginButton() {
        loginPage.clickLogin();
    }

    @Then("^I should be logged in successfully$")
    public void iShouldBeLoggedInSuccessfully() {
        Assert.assertTrue(loginPage.isOnProductsPage());
        driver.quit();
    }


    @When("I enter valid {string} and {string}")
    public void iEnterValidCreds(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }
}