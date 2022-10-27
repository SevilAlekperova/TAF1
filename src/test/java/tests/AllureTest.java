package tests;

import io.qameta.allure.*;
import org.apache.commons.io.filefilter.FalseFileFilter;
import org.testng.Assert;
import org.testng.annotations.Test;

//Epic -> Feature -> Story
@Epic("Epic 1")
@Feature("Feature 1")
public class AllureTest {

    @Test
    @Issue("AQA21-1")
    public void testIssue() {
        Assert.assertTrue(true);
    }

    @Test
    @TmsLink("TMS-1")
    public void testTms() {
        Assert.assertTrue(true);
    }

    @Test
    @Link("http://onliner.by")
    @Link(name = "Onliner Catalog", type = "myLink", url = "https://onliner.by")
    public void linkTest() {
        Assert.assertTrue(true);
    }

    @Test(description = "Описание теста")
    public void descriptionTest() {
        Assert.assertTrue(true);
    }

    @Test
    @Description("Описание теста Allure")
    public void descriptionTest1() {
        Assert.assertTrue(true);
    }

    @Test
    @Severity(SeverityLevel.BLOCKER)
    public void severityTest() {
        Assert.assertTrue(true);
    }

    @Test
    @Story("Test Story 1" + "Test Story 2")
    public void storyTest() {
        Assert.assertTrue(true);
    }


}
