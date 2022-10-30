package tests;

import baseEntities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.WaitsService;

import java.time.Duration;

public class FileUploadTest extends BaseTest {
    @Test
    public void fileUploadTest() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/upload");

        WaitsService wait = new WaitsService(driver, Duration.ofSeconds(10));

        WebElement fileUploadPath = wait.waitForExists(By.id("file-upload"));

        String pathToFile = ActionsTest.class.getClassLoader().getResource("download.jpeg").getPath();
        String pathToFile1 = pathToFile.substring(1, pathToFile.length());
        System.out.println(pathToFile1);
        fileUploadPath.sendKeys(pathToFile1);
        wait.waitForExists(By.id("file-submit")).submit();


        WebElement downloadFileName = driver.findElement(By.id("uploaded-files"));
        Assert.assertEquals(downloadFileName.getText(), "download.jpeg");

        Thread.sleep(1000);
    }
}
