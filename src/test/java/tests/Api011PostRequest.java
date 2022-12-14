package tests;

import baseUrl.AutomationExerciseBaseUrl01;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Api011PostRequest extends AutomationExerciseBaseUrl01 {

            /*

           Given
               1) https://automationexercise.com/api/createAccount
               2) {
                    "name": "John",
                    "email": "j@gmail.com"
                    "phone": 123456
                    "title": "Mr"
                    "birth_year": 2000
                    }
           When
               User sends a POST Request to the url to create/register the page
           Then
               HTTP Status Code should be 201
           And
               Response message "User Created!"

            */

    @Test

    public void postCreateAccount() {

        spec.pathParam("first", "createAccount");

        Map<String, Object> expectedData = new HashMap<>();
        expectedData.put("name", "John");
        expectedData.put("email", "j@gmail.com");
        expectedData.put("phone", 123456);
        expectedData.put("title", "Mr");
        expectedData.put("birth_year", 2000);
        System.out.println("expectedData: " + expectedData);

        //Send the request and get the response
        Response response = given().spec(spec).contentType(ContentType.JSON).body(expectedData).when().post("/{first}");
        response.jsonPath().prettyPrint();

        //Do Assertion
        Map<String, Object> actualData = response.as(HashMap.class);
        System.out.println("actualData: " + actualData);

        assertEquals(201, response.statusCode());
        assertEquals(expectedData.get("User Created"), actualData.get("User Created"));

    }
}










