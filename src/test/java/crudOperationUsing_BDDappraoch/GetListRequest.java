package crudOperationUsing_BDDappraoch;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class GetListRequest {
	
	@Test
	public void getListUserTest()
	{
		
		given()
		
		.when()
			.get("https://reqres.in/api/users?page=2")
		
		.then()
			.assertThat()
			.statusCode(200)
			.log()
			.all();
	}

}
