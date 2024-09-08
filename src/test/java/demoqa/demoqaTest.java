package demoqa;

import core.BaseSeleniumTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class demoqaTest extends BaseSeleniumTest {

    @Test
    public void checkTicket() {

        String name = "Obama";
        String email = "blackbox@tester.su";
        String currentAddress = "Kremlin, Moscow";
        String permanentAddress = "White house, Washington";
        inputPage InputPage = new inputPage();
        InputPage.createTicket(name, email, currentAddress, permanentAddress);
        String resultName = "Obama";
        Assert.assertEquals(name, resultName);
        String resultEmail = "blackbox@tester.su";
        Assert.assertEquals(email, resultEmail);
        String resultCurrentAddress = "Kremlin, Moscow";
        Assert.assertEquals(currentAddress, resultCurrentAddress);
        String resultPermanentAddress = "White house, Washington";
        Assert.assertEquals(permanentAddress, resultPermanentAddress);

    }

}
