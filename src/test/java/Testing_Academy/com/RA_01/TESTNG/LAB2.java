package Testing_Academy.com.RA_01.TESTNG;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class LAB2 {

@Test
    public void GetRequest() {
    RestAssured
            .given()
            .baseUri("https://restful-booker.herokuapp.com")
            .basePath("/booking")
            .when().get().then().statusCode(200);
}
@Test
    public void GetRequest2() {
        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/booking")
                .when().get().then().statusCode(200);
    }


}
