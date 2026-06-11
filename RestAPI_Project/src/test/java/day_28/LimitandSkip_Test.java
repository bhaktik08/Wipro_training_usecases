package day_28;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class LimitandSkip_Test
{
	@Test
	public void getLimitedUsers()
	{
		given()
			.queryParam("limit", 5)
			.queryParam("skip", 10)
			.queryParam("select", "firstName,age")

		.when()
			.get("https://dummyjson.com/users")

		.then()
			.statusCode(200)
			.log().all();
	}
}

