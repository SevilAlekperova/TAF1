package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.MilestonePage;

public class MilestoneStep {
    MilestonePage addMilestonePage;
    ProjectsEntities projectsEntities;

    public MilestoneStep(WebDriver driver) {
        super(driver);
        addMilestonePage = new MilestonePage(driver);
        projectsEntities = new ProjectsEntities();
    }

    @Step
    public void openPageByUrl() {
        addMilestonePage.openPageByUrl();
    }


}
