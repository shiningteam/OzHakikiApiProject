package tests;

import baseUrl.AutomationExerciseBaseUrl01;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;


import static io.restassured.RestAssured.given;

public class Api009DeleteRequest extends AutomationExerciseBaseUrl01 {
    @Test
    public void delete(){

        //Set the url
        spec.pathParam("first","verifyLogin");

        //Set the expected data

        //Send request and get the response

        Response response = given().spec(spec).
                when().
                delete("/{first}");
        response.jsonPath().prettyPrint();

        //Do Assertion

        response.then().assertThat().statusCode(200);

    }





}
