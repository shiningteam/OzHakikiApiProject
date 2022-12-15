package shiningTeam;

import base_url.AutomationExerciseBaseUrl01;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

import static org.testng.AssertJUnit.assertEquals;

public class Api005PostRequest extends AutomationExerciseBaseUrl01 {

    @Test
    public void US05(){

        spec.pathParam("first", "searchProduct");

        Api005_PojoClass requestData=new Api005_PojoClass("Searched products list", 200);

        Response response= given().spec(spec).contentType(ContentType.JSON).
                body(requestData). auth().basic("admin", "password123").
                when().post("/{first}");
        // response.prettyPrint();

        Api005_PojoClass actualDAta= response.as(Api005_PojoClass.class);
        assertEquals(200, response.getStatusCode());
        assertEquals(requestData.getResponseCode(), actualDAta.getResponseCode());
        assertEquals(requestData.getResponseJSON(), actualDAta.getResponseJSON());
    }
}
