import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HelloWorldTest {

    @Test
    public void testRestAssured() {
        Map<String, String> params = new HashMap<>();
        params.put("name", "John");

        JsonPath resp = RestAssured
                .given()
                .queryParams(params)
                .get("https://playground.learnqa.ru/api/get_json_homework")
                .jsonPath();

        System.out.println("Весь JSON: " + resp.prettyPrint());
    }
}