package crudOperationsUsingNormal;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PartialUpdateUserTest {

	@Test

	public void partiallyUpdateUserTest() {
		
		JSONObject obj = new JSONObject();
		obj.put("name", "wasim");
		obj.put("job", "TE");
		
		RequestSpecification rs = RestAssured.given();
		rs.body(obj);
		rs.contentType(ContentType.JSON);
		
	Response respo = rs.patch("https://reqres.in/api/users/2");
	
	ValidatableResponse val = respo.then();
	val.assertThat().contentType(ContentType.JSON).statusCode(200);
	val.log().all();
		
		

	}

}
