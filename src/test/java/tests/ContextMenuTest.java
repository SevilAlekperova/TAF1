package tests;

import baseEntities.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.WaitsService;

import java.time.Duration;

public class ContextMenuTest extends BaseTest {
    @Test
    public void contextMenuAlertTest() {
        driver.get("https://the-internet.herokuapp.com/context_menu");
        WaitsService wait = new WaitsService(driver, Duration.ofSeconds(10));

        Actions actions = new Actions(driver);
        actions
                .contextClick(wait.waitForExists(By.id("hot-spot")))
                .build()
                .perform();

        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "You selected a context menu");
        alert.accept();


    }
}
