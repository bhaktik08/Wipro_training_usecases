package day_28;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class GetUsersPost_test 
{
	@Test
	public void getUserPosts()
	{
		given()

		.when()
			.get("https://dummyjson.com/users/5/posts")

		.then()
			.statusCode(200)
			.log().all();
	}
}

