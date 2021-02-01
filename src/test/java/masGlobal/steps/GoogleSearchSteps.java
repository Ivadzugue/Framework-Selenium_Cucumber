package masGlobal.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import masGlobal.pageObjects.GoogleSearchHome;

public class GoogleSearchSteps {

    private final GoogleSearchHome googleSearchHome;

    public GoogleSearchSteps(GoogleSearchHome googleSearchHome) {
        this.googleSearchHome = googleSearchHome;

    }

    @Given("I am on the homepage")
    public void validateHomePage() {
        googleSearchHome.validate();
    }

    @Given("Open Google search home Page")
    public void openHomePage() {
        googleSearchHome.goToGoogleSearchHome();
    }

    @When("I type {string} into the search field")
    public void searchFromText(String text) {
        googleSearchHome.clickSearchInput();
        googleSearchHome.writeIntoSearchInput(text);
    }

    @And("^I click the Google Search button$")
    public void clickToSearch() {
        googleSearchHome.clickSearchButton();
    }

    @Then("I go to the search results page")
    public void isThereGoogleResults() {
        googleSearchHome.areThereSimpleGoogleResults();
    }

    @And("the first result is {string}")
    public void validateTheTotalResultOfTheSearchSimetrikIsDifferentToZero(String text) {
        googleSearchHome.validateTheTotalResultOfTheSearchSimetrikIsDifferentToZero(text);
    }
}