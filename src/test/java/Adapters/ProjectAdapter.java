package Adapters;

import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import models.Project;
import utils.Endpoints;

import static io.restassured.RestAssured.given;

public class ProjectAdapter extends BaseAdapter {

    public Project add(Project newProject) {
       return given()
                .body(newProject, ObjectMapperType.GSON)
                .log().body()
                .when()
                .post(Endpoints.ADD_PROJECT)
                .then()
                .log().body()
                .extract()
                .as(Project.class, ObjectMapperType.GSON);
    }

    public Response add1(Project newProject) {
       return given()
                .body(newProject, ObjectMapperType.GSON)
                .log().body()
                .when()
                .post(Endpoints.ADD_PROJECT);
    }

    public Project[] getAllProject(){
        Response response = given()
                .get(Endpoints.GET_ALL_PROJECTS);

        return gson.fromJson(response.getBody().asPrettyString(), Project[].class);
    }

    public void getProject(){

    }
}
