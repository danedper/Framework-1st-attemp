package framework.Controls;

import framework.Browser;
import org.openqa.selenium.By;

public abstract class Control {
    private By selector;
    private Browser browser;


    public Browser getBrowser(){
        return browser;
    }
    public By getSelector(){
        return selector;
    }
    public void setSelector(By selector) {
        this.selector= selector;
    }
    public void click(){

    }
}
