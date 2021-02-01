package masGlobal.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import masGlobal.pageObjects.GenericPageObject;
import masGlobal.pageObjects.GoogleSearchHome;

public class Hook {

    GenericPageObject pageObject;

    public Hook(GoogleSearchHome genericPageObject) {
        this.pageObject = genericPageObject;
    }

    @Before
    public void beforeTest() {
        WebDriverManager.chromedriver().setup();
    }

    @After
    public void  afterTest() {
        this.pageObject.quitDriver();
    }


}
