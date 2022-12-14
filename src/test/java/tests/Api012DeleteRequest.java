package tests;

import baseUrl.AutomationExerciseBaseUrl01;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Api012DeleteRequest extends AutomationExerciseBaseUrl01 {

    /*
        Given
            https://automationexercise.com/api/deleteAccount
        When
	 		User sends DELETE Request to the Url
	 	Then
	 	    Response code is 200
	 	And
		 	Response message "Account Deleted!"
     */

    @Test

    public void deleteAccount(){

        spec.pathParams("first", "deleteAccount");

        Response response = given().spec(spec).when().delete("/{first}");
        response.jsonPath().prettyPrint();

        assertEquals(200, response.getStatusCode());

    }

}
