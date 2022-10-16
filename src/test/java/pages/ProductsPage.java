package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {
    private final static String pagePath = "inventory.html";

    // Блок описания селекторов для элементов
    private final By headerTitleLabelLocator = By.xpath("//span[contains(text(), 'Products')]");

    // Блок инициализации страницы
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLabelLocator;
    }

    // Блок атомарных методов
    //public WebElement getHeaderTitleLabel() { return driver.findElement(headerTitleLabelLocator); }

    //public boolean isHeaderTitleLabelDisplayed() { return getHeaderTitleLabel().isDisplayed(); }
}
