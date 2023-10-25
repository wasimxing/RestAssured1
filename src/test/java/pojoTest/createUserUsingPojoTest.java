package pojoTest;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import pojoClass.UserLibrary;

public class createUserUsingPojoTest {
	
	@Test
	public void createUserTest()
	{
		UserLibrary obj = new UserLibrary("wasim", "tester");
		
		baseURI="https://reqres.in/";
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
