package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import services.BrowsersService;

public class SmokeTest2 {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        BrowsersService browsersService = new BrowsersService();
        driver = browsersService.getDriver();
    }

    @Test
    public void validateSKFTest() throws InterruptedException {
        driver.get("http://13gp.by/informatsiya/meditsinskie-kalkulyatory/995-raschet-skorosti-klubochkovoj-filtratsii-skf");

        WebElement selectWebElement = driver.findElement(By.id("oSex"));
        Select selectSex = new Select(selectWebElement);
        selectSex.selectByVisibleText("женский");
        Thread.sleep(2000);
        WebElement nCr = driver.findElement(By.name("nCr"));
        WebElement nAge = driver.findElement(By.name("nAge"));
        WebElement nWeight = driver.findElement(By.name("nWeight"));
        WebElement nHeight = driver.findElement(By.name("nHeight"));

//        WebElement button = driver.findElement(By.id("calc-mass-c"));

        nCr.sendKeys("80");
        Thread.sleep(2000);
        nAge.sendKeys("38");
        Thread.sleep(2000);
        nWeight.sendKeys("55");
        Thread.sleep(2000);
        nHeight.sendKeys("163");
        Thread.sleep(2000);
        WebElement button = driver.findElement(By.xpath("//*[@id=\"Form1\"]/ul/li[6]/input[1]"));

        button.click();

        WebElement result1 = driver.findElement(By.id("txtMDRD"));
        Assert.assertEquals(result1.getText(), "MDRD: 74 (мл/мин/1,73кв.м)");
        WebElement result2 = driver.findElement(By.id("txtMDRD1"));
        Assert.assertEquals(result2.getText(), "ХБП: 2 стадия (при наличии почечного повреждения)");
        WebElement result3 = driver.findElement(By.id("txtCG"));
        Assert.assertEquals(result3.getText(), "Cockroft-Gault: 70 (мл/мин)");
        WebElement result4 = driver.findElement(By.id("txtBSA"));
        Assert.assertEquals(result4.getText(), "Поверхность тела:1.58 (кв.м)");

    }

//    @Test
//    public void validateSKF() throws InterruptedException {
//        driver.get("http://13gp.by/informatsiya/meditsinskie-kalkulyatory/995-raschet-skorosti-klubochkovoj-filtratsii-skf");
//
//
//        WebElement selectWebElement = driver.findElement(By.id("oSex"));
//        Select selectSex = new Select(selectWebElement);
//        selectSex.selectByIndex(1);
//        Thread.sleep(2000);
//        selectSex.selectByValue("0");
//        Thread.sleep(2000);
//        selectSex.selectByVisibleText("женский");
//        Thread.sleep(2000);
//    }

    @AfterMethod

    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
