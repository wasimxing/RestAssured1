package crudOperationUsing_BDDappraoch;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PartialUpdateRequest {
	
	@Test
	
	public void partialUpdateRequest()
	{
		baseURI="https://reqres.in/";
		
		JSONObject obj = new JSONObject();
		obj.put("name", "wasim");
		obj.put("job", "AE");
		
		given()
		.body(obj)
		.contentType(ContentType.JSON)
		
		.when()
			.patch("api/users/2")
			
		.then()
			.assertThat()
			.statusCode(200)
			.contentType(ContentType.JSON)
			.log()
			.all();
		
		
		
	}

}
