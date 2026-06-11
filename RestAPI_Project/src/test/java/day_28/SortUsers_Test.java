package day_28;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class SortUsers_Test 
{
	@Test
	public void sortUsers()
	{
		given()
			.queryParam("sortBy", "firstName")
			.queryParam("order", "asc")

		.when()
			.get("https://dummyjson.com/users")

		.then()
			.statusCode(200)
			.log().all();
	}
}