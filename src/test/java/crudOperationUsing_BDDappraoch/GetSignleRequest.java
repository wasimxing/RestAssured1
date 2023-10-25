package crudOperationUsing_BDDappraoch;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;


public class GetSignleRequest {
	@Test
	
	public void getSingleRequest()
	{
		baseURI ="https://reqres.in/";
		
		given()
		
		.when()
		.get("api/users/2")
		
		.then()
			.assertThat()
			.statusCode(200)
			.log()
			.all();
	}

}
