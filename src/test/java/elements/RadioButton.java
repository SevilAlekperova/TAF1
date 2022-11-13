package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButton {
    private UIElement uiElement;
    private WebDriver driver;


    public RadioButton(WebDriver driver, By by) {
        this.uiElement = new UIElement(driver, by);
        this.driver = driver;
    }

    public RadioButton(WebDriver driver, WebElement webElement) {
        this.uiElement = new UIElement(driver, webElement);
        this.driver = driver;
    }


    public void selectedByText(String text) {
        radioButtonSelected(text);
    }

    public void selectByIndex(int number) {
        radioButtonSelected(number);
    }


    private void radioButtonSelected(String text) {
        switch (text) {
            case "Use multiple test suites to manage cases":
                driver.findElement(By.id("suite_mode_multi")).click();
                ;
            case "Use a single repository with baseline support":
                driver.findElement(By.id("suite_mode_single_baseline")).click();
                ;
            case "Use a single repository for all cases (recommended)":
                driver.findElement(By.id("suite_mode_single")).click();
                ;
        }
    }

    private void radioButtonSelected(int value) {
        switch (value) {
            case 1:
                driver.findElement(By.id("suite_mode_single")).click();
                ;
            case 2:
                driver.findElement(By.id("suite_mode_single_baseline")).click();
                ;
            case 3:
                driver.findElement(By.id("suite_mode_multi")).click();
                ;
        }
    }
}
