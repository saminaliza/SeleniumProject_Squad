package api;

import org.seleniumhq.jetty9.server.Response;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CnnApi1 {
    @Test
    public void callSingleEmployeeResources() {
        Response response = given().when().get("https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=a820cb3e99be48b785457f809e898ef0").then().statusCode(200).extract().response();
        String statusLine = response.getStatusLine();
        int statusCode = response.getStatusCode();
        String body = response.getBody().prettyPrint();
        Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
        Assert.assertEquals(statusCode, 200);
    }
}