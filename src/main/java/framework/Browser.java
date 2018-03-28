package framework;

import okhttp3.internal.http2.Settings;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import sun.plugin2.util.BrowserType;

import java.io.File;

public class Browser {
    private WebDriver driver;
    private Settings settings;
    private Environment environment;

    //constructor that builds setting object from the settings class and then calls the method set settings//
    public Browser() {
        setSettings(new Settings());

        setupDriver();
    }
    // a method to call the actual web driver from the pathname//
            public void setupDriver () {
                File chromeDriver = new File("C:\\chromedriver\\chromedriver.exe");
                environment = new Environment();
                ChromeDriverService chromeDriverServiceHeaded = new ChromeDriverService.Builder().
                        usingDriverExecutable(chromeDriver).build();
                driver = new ChromeDriver(chromeDriverServiceHeaded);
            }
    //method/getter to return the web driver//
        public WebDriver getDriver () {
            return driver;
        }
        public void loadEnvironment(){
        getDriver().get(environment.getEnvironmentURL());}

        public Settings getSettings() {
            return settings;}


    private void setSettings(Settings settings) {
        this.settings = settings;

    }
}



