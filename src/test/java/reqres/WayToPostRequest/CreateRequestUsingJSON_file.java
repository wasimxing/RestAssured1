package reqres.WayToPostRequest;

import java.io.File;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreateRequestUsingJSON_file {
	
	@Test
	
	public void createUsingJsonFile()
	{
		File obj = new File("./src/test/resources/data.json");
		baseURI="https://reqres.in/";
		
		given()
		.body(obj)
		.contentType(ContentType.JSON)
		
		.when()
			.post("api/users")
		
		.then()
			.assertThat()
			.statusCode(201)
			.log()
			.all();
	}

}
