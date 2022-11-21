package tests.api;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ReqresApiTest {

    @Test
    public void simpleStepByStepApiTest() {

        //setup RestAssured
        RestAssured.baseURI = "https://reqres.in";

        //setup endpoint
        int userID = 2;
        String endpoint = "/api/users/" + userID;

        //setup request object / настроить реквест объект
        RequestSpecification httpRequest = given();

        //setup response object
        Response response = httpRequest.request(Method.GET, endpoint);

        //Get response status code проверка статуса кода
        int statusCode = response.getStatusCode();
        System.out.println(statusCode);

        Assert.assertEquals(statusCode, 200);
        Assert.assertEquals(statusCode, HttpStatus.SC_OK);

        //get response body
        String responseBody = response.getBody().asPrettyString();
        System.out.println(responseBody);
    }


    @Test
    public void simpleShortApiTest() {

//setup RestAssured
        RestAssured.baseURI = "https://reqres.in";

        int userID = 2;
        String endpoint = "/api/users/" + userID;
        given()
                .when()
                .get(endpoint)
                .then()
                .statusCode(HttpStatus.SC_OK)
                .log().body();
    }

}
