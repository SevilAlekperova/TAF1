package services;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleDriver {
    public WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\salekperova\\IdeaProjects\\TAF1\\src\\test\\resources\\chromedriver.exe");
   return new ChromeDriver();
    }
}
