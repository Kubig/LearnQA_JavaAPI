import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class HelloWorldTest {

    @Test
    public void testRestAssured() {
        String mainURL = "http://playground.learnqa.ru/api/";

        Response resp = RestAssured
                .given()
                .redirects()
                .follow(false)
                .when()
                .get(mainURL + "long_redirect")
                .andReturn();

        String locationHeader = resp.getHeader("Location");
        System.out.println("Redirect: " + locationHeader);
    }
}