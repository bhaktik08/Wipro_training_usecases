package day_28;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class AddNewUser 
{
	@Test
	public void addUser()
	{
		String requestBody = "{\r\n"
				+ "  \"firstName\": \"Muhammad\",\r\n"
				+ "  \"lastName\": \"Ovi\",\r\n"
				+ "  \"age\": 250\r\n"
				+ "}";

		given()
			.header("Content-Type", "application/json")
			.body(requestBody)

		.when()
			.post("https://dummyjson.com/users/add")

		.then()
			.statusCode(201)
			.log().all();
	}
}
