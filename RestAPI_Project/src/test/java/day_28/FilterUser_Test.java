package day_28;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class FilterUser_Test 
{
	@Test
	public void filterUser()
	{
		given()
			.queryParam("key", "hair.color")
			.queryParam("value", "Brown")

		.when()
			.get("https://dummyjson.com/users/filter")

		.then()
			.statusCode(200)
			.log().all();
	}
}