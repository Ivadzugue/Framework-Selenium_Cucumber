package masGlobal.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class GenericPageObject {

    public WebDriver driver;

    public GenericPageObject(){
    }
    public void setup(){
        this.driver = new ChromeDriver();
    }

    public abstract void validate();

    public void quitDriver(){
        this.driver.quit();
    }

    protected WebDriver getDriver(){
        return this.driver;
    }
}
