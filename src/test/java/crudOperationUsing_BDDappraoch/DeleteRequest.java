package crudOperationUsing_BDDappraoch;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class DeleteRequest {
	
	@Test
	
	public void deleteUserRequest()
	{
		baseURI="https://reqres.in/";
		given()
		
		.when()
			.delete("api/users/2")
		
		.then()
			.assertThat()
			.statusCode(204)
			.log()
			.all();
	}

	
}
