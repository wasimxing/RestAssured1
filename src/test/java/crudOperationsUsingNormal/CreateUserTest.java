package crudOperationsUsingNormal;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateUserTest {
	
	@Test
	public void createUserTest()
	{
		JSONObject obj = new JSONObject();
		obj.put("name", "wasim");
		obj.put("job", "Tester");
		
		RequestSpecification rs = RestAssured.given();
		rs.body(obj);
		rs.contentType(ContentType.JSON);
		
		Response response = rs.post("https://reqres.in/api/users");
		
		ValidatableResponse val = response.then();
		
		val.assertThat().contentType(ContentType.JSON).statusCode(201).log().all();
	}
	

}
