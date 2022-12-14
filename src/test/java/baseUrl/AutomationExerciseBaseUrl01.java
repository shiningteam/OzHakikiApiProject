package baseUrl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeEach;

public class AutomationExerciseBaseUrl01 {

    protected RequestSpecification spec;

    @BeforeEach

    public void setUp(){
        spec = new RequestSpecBuilder().setBaseUri("https://automationexercise.com/api").build();

    }

}
