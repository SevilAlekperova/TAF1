package tests;

import org.openqa.selenium.WebDriver;
import org.testng.TestRunner;
import org.testng.annotations.Test;


public class FirstTest {

    @Test
    public void simpleDriverTest() throws InterruptedException {
        SimpleDriver simpleDriver = new SimpleDriver();
        WebDriver driver = simpleDriver.getDriver();
        Thread.sleep(2000);
        driver.quit();
    }
}
