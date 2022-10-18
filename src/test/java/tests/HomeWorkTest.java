package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import services.BrowsersService;

public class HomeWorkTest {
    private WebDriver driver;
    @BeforeMethod
    public void setup() {
        BrowsersService browsersService = new BrowsersService();
        driver = browsersService.getDriver();
    }
    public void validateSmokeTest3() throws InterruptedException {
        driver.get("https://kermi-fko.ru/raschety/Calc-Rehau-Solelec.aspx");
        WebElement weight = driver.findElement(By.id("el_f_width"));
        WebElement height = driver.findElement(By.id("el_f_lenght"));
        WebElement heatLoss = driver.findElement(By.id("el_f_losses"));
        WebElement button = driver.findElement(By.name("button"));
        WebElement selectWebElement = driver.findElement(By.id("room_type"));
        Select selectRoomType = new Select(selectWebElement);
        WebElement selectWebElement1 = driver.findElement(By.id("heating_type"));
        Select selectHeatingType = new Select(selectWebElement1);


        weight.sendKeys("6");
        height.sendKeys("6");
        selectRoomType.selectByValue("2");
        selectHeatingType.selectByValue("3");
        heatLoss.sendKeys("41");

        button.click();
        Thread.sleep(2000);

        WebElement resultCablePower = driver.findElement(By.id("floor_cable_power"));
        Assert.assertEquals(resultCablePower.getAttribute("value"), "23");
        WebElement resultSpecCablePower = driver.findElement(By.id("spec_floor_cable_power"));
        Assert.assertEquals(resultSpecCablePower.getAttribute("value"), "1");

    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

   }




