import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class HelloWorldTest {

    @Test
    public void testRestAssured() {

        Redirects redirects = new Redirects();

        redirects.checkRedirect();
    }
}