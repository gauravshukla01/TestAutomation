package RestAssuredAPITest;


import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;


public class RestAssuredAPITest {

    @Test(enabled = true)
    public void PostRequest(){
        RestAssured.baseURI = "https://demoqa.com/BookStore/v1";
        RequestSpecification request = RestAssured.given();
        JSONObject requestParams = new JSONObject();
        requestParams.put("userId","TQ1234");
        requestParams.put("isbn","9781449325862");

        request.header("Content-Type", "application/json");
        request.body(requestParams.toJSONString());

        Response response = request.post("/Books");
        System.out.println("The status received: " + response.statusLine());
        JsonPath jsonPathEval = response.jsonPath();
        //jsonPathEval.getl
    }


    @Test(enabled = false)

    public void GetBookDetails(){
        RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
        RequestSpecification httpRequest = RestAssured.given();
       // httpRequest.queryParam("","")
        Response httpResponse = httpRequest.request(Method.GET,"");
        System.out.println("Status code received from the response = " +httpResponse.getStatusLine());
        System.out.println("Status code received from the response = " +httpResponse.getStatusCode());
        System.out.println("Response body ==>"+httpResponse.prettyPrint());
        System.out.println("Response HEADERS  ==>"+httpResponse.getHeaders());
        //httpResponse.body().as
      //  httpResponse.jsonPath().get()
    }
    @Test(enabled = false)
    public void GetWeatherDetails(){
        RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
        RequestSpecification httpRequest = RestAssured.given();

        Response response = httpRequest.get("/Hyderabad");
        System.out.println("Status code received from the response = " +response.getStatusLine());
        System.out.println("Status code received from the response = " +response.getStatusCode());
        System.out.println("Response ==>"+response.prettyPrint());
        System.out.println("Response AS STRING  ==>"+response.asString());
    }
}
