package core;

import org.openqa.selenium.WebDriver;

abstract public class BaseSeleniumPage {
    protected static WebDriver driver;

    public static void setDriwer(WebDriver webDriver){
        driver = webDriver;
    }
}
