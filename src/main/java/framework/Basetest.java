package framework;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Basetest {
    private Browser browser;



    @BeforeSuite
    public void beforeSuite() {
        browser = new Browser();
        browser.loadEnvironment();
    }
    @AfterSuite
    public void tearDown(){

    }

    public Browser getBrowser() {
        return browser;
    }
}

