package tests;

import configuration.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import services.BrowsersService;

public class Task8 {
    private WebDriver driver;


    @BeforeMethod
    public void start() throws InterruptedException {
        BrowsersService browsersService = new BrowsersService();
        driver = browsersService.getDriver();
        driver.get(ReadProperties.getUrl());
        driver.findElement(By.id("user-name")).clear();  // поиск по id
        driver.findElement(By.id("user-name")).sendKeys(ReadProperties.username());
        driver.findElement(By.name("password")).clear(); // поиск имени
        driver.findElement(By.name("password")).sendKeys(ReadProperties.password());
        driver.findElement(By.className("submit-button")).click();
        Thread.sleep(1000);

    }

    @Test
    public void SaucedemoTest1() throws InterruptedException {
        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack")).click(); //поиск по cелектору #id
        Thread.sleep(100);
        Assert.assertEquals(driver.findElement(By.cssSelector(".inventory_item_price")).getText(), "$29.99"); // поис по селетору .сlass

        Assert.assertEquals(driver.findElements(By.className("inventory_item_name")).size(), 6); // поиск по classname
        driver.findElement(By.tagName("ul")); // поиск по  tagname
        driver.findElement(By.linkText("Twitter")).click(); // поиск по  по linkText
        Thread.sleep(1000);

        driver.findElement(By.partialLinkText("book")).click(); // поиск по  по   partiallinktext
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("a.shopping_cart_link")).click(); //поиск по селектору o tagname.class
        Thread.sleep(200);
    }


    @Test
    public void SaucedemoTest2() {
        driver.findElement(By.xpath("//*[@data-test='add-to-cart-sauce-labs-backpack']")).click();
        driver.findElement(By.xpath("//*[ contains(text(),'Add') and @id='add-to-cart-sauce-labs-onesie']")).click();
        driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
        Assert.assertEquals(driver.findElement(By.className("shopping_cart_badge")).getText(), "3");

        Assert.assertEquals(driver.findElements(By.xpath("//*[@class='inventory_item_label']/preceding::a")).size(), 16);

    }


    @AfterMethod
    public void end() {
        driver.quit();
    }
}
