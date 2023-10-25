package reqres.WayToPostRequest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateRequestUsingJSON {
	
	@Test
	
	public void createRequest()
	{
		baseURI="https://reqres.in/";
		
		JSONObject obj = new JSONObject();
		obj.put("name", "wasim");
		obj.put("job", "tester");
		
		given()
		.body(obj)
		.contentType(ContentType.JSON)
		
		.when()
			.post("api/users")
			
		.then()
			.assertThat()
			.statusCode(201)
			.contentType(ContentType.JSON)
			.log()
			.all();
		
		
	}

}
