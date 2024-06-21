package Testing_Academy.com.RA_01.TESTNG;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class LAB2 {
    @Description("Allure")
    @Test
    public void GetRequest() {
        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/booking")
                .when().get().then().statusCode(200);
    }

    @Description("Allure")
    @Test
    public void GetRequest1() {
        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/booking")
                .when().get().then().statusCode(200);
    }


}
