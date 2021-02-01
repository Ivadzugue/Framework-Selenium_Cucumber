package masGlobal.pageObjects;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class GoogleSearchHome extends GenericPageObject {

    @FindBy(xpath = "//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")
    WebElement searchInput;

    @FindBy(xpath = "//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")
    WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"result-stats\"]")
    WebElement resultStatsDiv;

    @FindBy(id = "rso")
    WebElement queryResultsDiv;

    @FindBy(xpath = "//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div[2]/ul")
    WebElement suggestionList;


    public GoogleSearchHome() {

    }

    @Override
    public void validate() {
        Assert.assertTrue(this.searchButton.isDisplayed());
        Assert.assertTrue(this.searchInput.isDisplayed());
        Assert.assertTrue(this.searchButton.isEnabled());
        Assert.assertTrue(this.searchInput.isEnabled());
    }

    public void clickSearchInput() {
        this.searchInput.click();
    }

    public void writeIntoSearchInput(String text) {
        this.searchInput.sendKeys(text);
    }

    public void clickSearchButton() {
        this.searchButton.click();
    }

    public void goToGoogleSearchHome() {
        super.setup();
        PageFactory.initElements(this.driver, this);
        this.driver.get("http://www.google.com");
    }

    public void validateTheTotalResultOfTheSearchSimetrikIsDifferentToZero(String text) {
        List<WebElement> basicResults = this.queryResultsDiv.findElements(new By.ByClassName("g"));
        if (basicResults.size() > 0) {
            WebElement firstTitle = basicResults.get(0).findElement(new By.ByTagName("h3"));
            if (!firstTitle.getText().equals(text)) {
                Assert.fail();
            }
        } else {
            Assert.fail();
        }
    }

    public void areThereSimpleGoogleResults() {
        List<WebElement> basicResults = this.queryResultsDiv.findElements(new By.ByClassName("g"));
        if (!(basicResults.size() > 0)) {
            Assert.fail();
        }
    }


}
