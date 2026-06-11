package day_28;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class SearchUser_Test 
{
	@Test
	public void searchUser()
	{
		given()

		.when()
			.get("https://dummyjson.com/users/search?q=John")

		.then()
			.statusCode(200)
			.log().all();
	}
}