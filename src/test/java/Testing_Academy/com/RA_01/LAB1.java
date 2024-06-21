package Testing_Academy.com.RA_01;

import io.restassured.RestAssured;

public class LAB1 {
    public static void main(String[] args) {

        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/booking")
                .when().get().then().statusCode(200);
        System.out.println("byyyyyyyyyy");
    }
}
