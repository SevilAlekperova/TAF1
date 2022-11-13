package tests;

import models.Project;
import org.testng.Assert;
import org.testng.annotations.Test;
import steps.ProjectsStep;

public class ProjectTest {
    ProjectsStep projectStep = new ProjectsStep();

    @Test
    public void createProjectTest(){
       projectStep.createProject("test1", "gvhb", 1, false, true, true);
    }
   @Test
    public void updateProjectTest(String test1, String gvhb, int i, boolean b){
       Project project = new Project();
       project.setName("test2");
       project.setDescription("kjhg");
       project.setType(2);
       project.setShowAnon(false);
       project.setAccess(true);
       project.setDeleted(true);

        projectStep.createProject(project);
    }
    @Test
    public void compareProjectTest(String test1, String gvhb, int i, boolean b){
       Project project = new Project();
       project.setName("test2");
       project.setDescription("kjhg");
       project.setType(2);
       project.setShowAnon(false);
       project.setAccess(true);
       project.setDeleted(true);

 Project project1 = new Project();
       project1.setName("test2");
       project1.setDescription("kjhg");
       project1.setType(2);
       project1.setShowAnon(false);
       project1.setAccess(true);
       project1.setDeleted(true);

        Assert.assertTrue(project.equals(project1));
    }

}
