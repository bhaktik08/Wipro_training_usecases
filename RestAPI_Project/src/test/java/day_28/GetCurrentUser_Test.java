package day_28;


import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class GetCurrentUser_Test {

    @Test
    public void getCurrentUser() {

        // Login and fetch token
        String token =
                given()
                    .contentType("application/json")
                    .body("{\r\n"
                            + "\"username\": \"emilys\",\r\n"
                            + "\"password\": \"emilyspass\"\r\n"
                            + "}")

                .when()
                    .post("https://dummyjson.com/auth/login")

                .then()
                    .statusCode(200)
                    .extract()
                    .path("accessToken");


        System.out.println("Token = " + token);


        // Use token in Authorization header
        given()
            .header("Authorization", "Bearer " + token)

        .when()
            .get("https://dummyjson.com/auth/me")

        .then()
            .statusCode(200)
            .log().all();
    }
}
