package steps;

import io.cucumber.java.en.*;
import page.AnimationPage;
import page.OsPage;
import utils.Hooks;
public class ApiDemosAppStep extends Hooks {

    AnimationPage animationPage = new AnimationPage();
    OsPage osPage = new OsPage();

    @Given("I have opened the ApiDemos application")
    public void i_have_opened_the_api_demos_application() {
        setUpApplication();
    }
    @When("I click on the Animation Button")
    public void i_click_on_the_animation_button() {
        animationPage.clickElement(animationPage.getAnimationButton());
    }
    @Then("I should be able to see Cloning Button")
    public void i_should_be_able_to_see_cloning_button() {
        animationPage.isDisplayedElement(animationPage.getCloningButton());
    }

    @When("I click on the Operating System Button")
    public void iClickOnTheOperatingSystemButton() {
        osPage.clickElement(osPage.getOSButton());
    }

    @Then("I click on the Morce Code button")
    public void iClickOnTheMorceCodeButton() {
        osPage.clickElement(osPage.getMorseCodeButton());
    }

    @Then("I should type {string} in the Vibrate text box")
    public void iShouldTypeInTheVibrateTextBox(String names) {
        osPage.setTextBox().sendKeys(names);
    }
}

