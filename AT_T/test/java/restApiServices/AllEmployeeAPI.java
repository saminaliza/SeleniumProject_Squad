package restApiServices;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AllEmployeeAPI {
    @Test()
    public void callAllEmployeeResources() {
        Response response = RestAssured.get("http://info.venturepulse.org:8080/service-webapp/api/AllEmployeeResources");
        String statusLine = response.getStatusLine();
        int statusCode = response.getStatusCode();
        String body = response.getBody().prettyPrint();
        Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
        Assert.assertEquals(statusCode, 200);
        System.out.println("Status Code is " + statusCode);
        System.out.println("Time of response is: " + response.getTime());
    }
     @Test
    public void badCallAllEmployeeResources(){
        Response response = null;
        int statusCode = 0;

        try{
            response = RestAssured.get("http://info.venturepulse.org:8098/service-webapp/api/AllEmployeeResources");
            statusCode = response.getStatusCode();
            String body = response.getBody().prettyPrint();

        }catch (Exception ex){
        }
        Assert.assertEquals(statusCode,404);
        System.out.println("Status Code is " + statusCode);
        System.out.println("Time of response is: " + response.getTime());

     }
}
