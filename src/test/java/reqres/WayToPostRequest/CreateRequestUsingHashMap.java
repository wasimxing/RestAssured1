package reqres.WayToPostRequest;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class CreateRequestUsingHashMap {
	
	@Test
	
	public void createUserTest()
	{
		baseURI="https://reqres.in/";
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("name", "wasim");
		map.put("job", "trainer");
		
		given()
			.body(map)
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
