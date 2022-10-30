package tests;

import baseEntities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IFrameTest extends BaseTest {
    @Test
    public void iFrameTest() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/iframe");


        driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
        Thread.sleep(2000);

        WebElement containText = driver.findElement(By.xpath("//p[. = 'Your content goes here.']"));
        containText.isDisplayed();
        Assert.assertEquals(containText.getText(), "Your content goes here.");
    }
}
