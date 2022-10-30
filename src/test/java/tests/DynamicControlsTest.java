package tests;

import baseEntities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.WaitsService;

import java.time.Duration;

public class DynamicControlsTest extends BaseTest {
    @Test
    public void dynamicControlsCheckBoxTest() {
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
        WaitsService wait = new WaitsService(driver, Duration.ofSeconds(10));

        wait.waitForVisibilityBy(By.cssSelector("[type = 'checkbox']"));
        Actions actions = new Actions(driver);
        actions
                .click(wait.waitForVisibilityBy(By.cssSelector("[type = 'checkbox']")))
                .click(wait.waitForVisibilityBy(By.cssSelector("[onclick='swapCheckbox()']")))
                .build()
                .perform();
        Assert.assertEquals(wait.waitForVisibilityBy(By.id("message")).getText(), "It's gone!");
    }

    @Test
    public void inputBoxTest(){
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
        WaitsService wait = new WaitsService(driver, Duration.ofSeconds(10));

        WebElement inputBox = wait.waitForVisibilityBy(By.cssSelector("[type = 'text']"));

        Assert.assertFalse(inputBox.isEnabled());

        Actions actions = new Actions(driver);
        actions
                .click(wait.waitForVisibilityBy(By.cssSelector("[onclick='swapInput()']")))
                .build()
                .perform();
        Assert.assertEquals(wait.waitForVisibilityBy(By.id("message")).getText(), "It's enabled!");
        Assert.assertTrue(inputBox.isEnabled());
    }

}
