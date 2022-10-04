import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Redirects {

    public Response redirectUrl(String text, boolean one) {
        String mainURL = "https://playground.learnqa.ru/api/long_redirect";
        Response resp = RestAssured
                .given()
                .redirects()
                .follow(one)
                .when()
                .get(text)
                .andReturn();

        return resp;
    }

    public void checkRedirect() {
        String mainUrl = "https://playground.learnqa.ru/api/long_redirect";
        int statusCode = 0;
        int countRedirect = 0;
        for(int i = 0; ;i++) {
           mainUrl = redirectUrl(mainUrl, false).getHeader("location");
           statusCode = redirectUrl(mainUrl, false).getStatusCode();
           countRedirect++;
           if(statusCode == 200) {
               System.out.println("Последняя страница: " + mainUrl);
               System.out.println("Количество редиректов:" + countRedirect);
               break;
           }
        }
    }
}
