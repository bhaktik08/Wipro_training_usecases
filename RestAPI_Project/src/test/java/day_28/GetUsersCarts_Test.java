package day_28;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class GetUsersCarts_Test
{
	@Test
	public void getUserCarts()
	{
		given()

		.when()
			.get("https://dummyjson.com/users/6/carts")

		.then()
			.statusCode(200)
			.log().all();
	}
}

