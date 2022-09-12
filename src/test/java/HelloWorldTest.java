import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.junit.jupiter.api.Test;

public class HelloWorldTest {

    @Test
    public void testHelloWorld() {
        Response res = RestAssured
                .get("https://playground.learnqa.ru/api/get_text")
                .andReturn();

        System.out.println("Text from body: " + res.prettyPrint());
    }
}