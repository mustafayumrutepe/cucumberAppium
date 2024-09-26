package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.SauceDemoPage;
import utils.HooksWeb;

public class SauceDemoStep extends HooksWeb {

SauceDemoPage sauceDemoPage = new SauceDemoPage();

    @Given("I have opened Souce Demo Web Page")
    public void iHaveOpenedSouceDemoWebPage() {
        androidDriver.get("https://www.saucedemo.com/");
    }

    @When("I enter {string} and {string}")
    public void iEnterAnd(String username, String password) {
        sauceDemoPage.usernameTextBoxJS(username);
        sauceDemoPage.passwordTextBoxJS(password);
    }

    @Then("I click on the login button")
    public void iClickOnTheLoginButton() {
        sauceDemoPage.clickLogin();
    }

    @And("I should be able to see header text")
    public void iShouldBeAbleToSeeHeaderText() {
    }
}
