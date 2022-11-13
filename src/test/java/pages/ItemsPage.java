package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemsPage extends BasePage {
    private final static String pagePath = "inventory.html";

    // Блок описания селекторов для элементов
    private final By headerTitleLabelLocator = By.xpath("//span[contains(text(), 'Products')]");

    // Блок инициализации страницы
    public ItemsPage(WebDriver driver) {
        super(driver);
    }
}
