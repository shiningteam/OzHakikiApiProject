import baseUrl.AutomationExerciseBaseUrl01;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Api010PostRequest extends AutomationExerciseBaseUrl01 {
    /*
    Given
        1)https://automationexercise.com/api/verifyLogin
        2)      {
                "email" : "shiningteam@gmail.com",
                "password" : 123456
                }
    When
        I send POST Request to the Url
    Then
        Status code is 200

        POSTMAN'e göre
        And response body should be like {
                                            "responseCode": 400,
                                            "message": "Bad request, email or password parameter is missing in POST request."
                                        }
        TEST CASE'e göre
        And response body should be like {
                                            "responseCode": 404,
                                            "message": "User not found!"
                                        }
     */



    @Test
    public void post(){

        //Set the url
        spec.pathParam("first", "verifyLogin");

        //Set the expected data
        Map<String,Object> expectedData = new HashMap<>();
        expectedData.put("email", "shiningteam@gmail.com");
        expectedData.put("password", 123456);
        System.out.println("expectedData = " + expectedData);

        //Send request and get the response
        Response response = given().spec(spec).body(expectedData).when().post("/{first}");
        response.prettyPrint();

        //Do Assertion
        Map<String,Object> actualData = response.as(HashMap.class);
        assertEquals(404, response.statusCode());
        assertEquals(expectedData.get("email"),actualData.get("email"));
        assertEquals(expectedData.get("password"),actualData.get("password"));




    }

}
