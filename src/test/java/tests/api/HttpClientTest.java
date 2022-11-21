package tests.api;


import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;


public class HttpClientTest {

    @Test
    public void simpleApiTest() throws IOException {
        String restUrl = "https://reqres.in";

        //создать объект и пробросить url
        HttpUriRequest request = new HttpGet(restUrl);

        //отправляем запрос
        HttpResponse httpResponse = HttpClientBuilder
                .create()
                .build()
                .execute(request);

        System.out.println(request.toString());

        Assert.assertEquals(httpResponse.getStatusLine().getStatusCode(), HttpStatus.SC_OK);
    }
}
