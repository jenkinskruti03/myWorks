package StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

public class SwaglabsStepdefs {

    WebDriver driver;
    LoginPage loginPage;

    @Given("^I am on the SwagLabs home page$")
    public void iAmOnTheSwagLabsHomePage() {
    }

    @When("^I add a product to the cart$")
    public void iAddAProductToTheCart() {
    }

    @Then("^the product should be added to the cart$")
    public void theProductShouldBeAddedToTheCart() {
    }

    @Then("^I should be logged out successfully$")
    public void iShouldBeLoggedOutSuccessfully() {
    }
}
