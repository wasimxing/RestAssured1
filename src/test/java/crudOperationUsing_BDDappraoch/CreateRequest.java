package crudOperationUsing_BDDappraoch;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;


public class CreateRequest {

	@Test 
	void CreateUserTest()
	
	{
		JSONObject obj = new JSONObject();
		obj.put("name", "Wasim");
		obj.put("job", "tester");
		
		given()
		.body(obj)
		.contentType(ContentType.JSON)
		
		.when()
		.post("https://reqres.in/api/users")
		
		.then()
			.assertThat()
			.statusCode(201)
			.contentType(ContentType.JSON)
			.log().all();
		
	}
	
	
	

}
