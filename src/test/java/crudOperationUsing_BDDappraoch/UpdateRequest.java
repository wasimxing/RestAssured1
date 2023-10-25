package crudOperationUsing_BDDappraoch;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class UpdateRequest {
	@Test
	
	public void updateUserTest()
	{
		baseURI="https://reqres.in/";
		
		JSONObject obj = new JSONObject();
		obj.put("name", "raja");
		obj.put("job", "QA");
		
		given()
			.body(obj)
			.contentType(ContentType.JSON)
			
		.when()
			.put("api/users/2")
			
		.then()
			.assertThat()
			.statusCode(200)
			.contentType(ContentType.JSON)
			.log()
			.all();
		
		
			
	}

}
