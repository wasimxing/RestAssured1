package crudOperationsUsingNormal;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class UpdateUserTest {
	@Test
	public void updateUserTest()
	{
		JSONObject obj = new JSONObject();
		obj.put("name", "raja");
		obj.put("job", "manager");
		
		RequestSpecification rs = RestAssured.given();
		rs.body(obj);
		rs.contentType(ContentType.JSON);
		
		Response response = rs.put("https://reqres.in/api/users/2");
		
		
		ValidatableResponse val = response.then();
		val.assertThat().contentType(ContentType.JSON).statusCode(200);
		val.log().all();
		
		
	}

}
