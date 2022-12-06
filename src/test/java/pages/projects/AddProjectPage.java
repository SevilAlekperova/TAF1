package pages.projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProjectPage extends pages.projects.BaseProjectPage {
    private final By saveButtonLocator = By.id("accept");

    public AddProjectPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIndetifier() {
        return null;
    }

    @Override
    protected By getPageIdentifier() {
        return null;
    }

    public WebElement getSaveButton() {
        return driver.findElement(saveButtonLocator);
    }
}
