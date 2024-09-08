package demoqa;

import core.BaseSeleniumPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class inputPage extends BaseSeleniumPage {


    @FindBy(xpath = "//span[text()=\"Text Box\"]")
    private WebElement textBoxButton;

    @FindBy(xpath = "//input[@id='userName']")
    private WebElement name;

    @FindBy(xpath = "//input[@id='userEmail']")
    private WebElement email;

    @FindBy(xpath = "//textarea[@id='currentAddress']")
    private WebElement currentAddress;

    @FindBy(xpath = "//textarea[@id='permanentAddress']")
    private WebElement permanentAddress;

    @FindBy(xpath = "//button[@id='submit']")
    private WebElement submitButton;

    @FindBy(xpath = "//p[text()='Obama']")
    private WebElement resultName;

    @FindBy(xpath = "//p[text()='blackbox@tester.su']")
    private WebElement resultEmail;

    @FindBy(xpath = "//p[text()='Kremlin, Moscow']")
    private WebElement resultCurrentAddress;

    @FindBy(xpath = "//p[text()='White house, Washington']")
    private WebElement resultPermanentAddress;


    public inputPage() {
        driver.get("https://demoqa.com/elements");
        PageFactory.initElements(driver,this);
    }

    public inputPage createTicket(String nameValue, String emailValue, String currentAddressValue, String permanentAddressValue) {

        textBoxButton.click();
        name.sendKeys(nameValue);
        email.sendKeys(emailValue);
        currentAddress.sendKeys(currentAddressValue);
        permanentAddress.sendKeys(permanentAddressValue);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        submitButton.click();
return this;
    }
}
