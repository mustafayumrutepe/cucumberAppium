package steps;

import io.cucumber.java.en.*;
import page.AmazonWebPage;
import utils.HooksWeb;

public class AmazonSearchBoxStep extends HooksWeb {

    AmazonWebPage amazonWebPage = new AmazonWebPage(androidDriver);

    @Given("I have opened Amazon Mobile Web page")
    public void iHaveOpenedAmazonMobileWebPage() {
        androidDriver.get("https://www.amazon.com");
    }

    @When("I enter {string} in the search bar")
    public void iEnterInTheSearchBar(String product) {
        amazonWebPage.searchTextBoxJS(product);
    }

    @Then("I click on the search button")
    public void iClickOnTheSearchButton() {
        amazonWebPage.clickSearchBoxJS();
    }
}
