package defs;

import configuration.ReadProperties;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.LoginPage;
import services.BrowsersService;

public class FirstStepdefs {
    WebDriver driver;
    @Given("открыт бразуер")
    public void openBrowser() {
        System.out.println("Open browser");
        driver= new BrowsersService().getDriver();
    }

    @When("cтраница логина открыта")
    public void openLoginPage() {
        driver.get(ReadProperties.getUrl());
    }
    @After
    public void tearDown(){
        driver.quit();
    }

    @Then("отоброжается поле username")
    public void isUsernameFieldDisplayed() {
        Assert.assertTrue(new LoginPage(driver).getEmailInput().isDisplayed());
    }
}
