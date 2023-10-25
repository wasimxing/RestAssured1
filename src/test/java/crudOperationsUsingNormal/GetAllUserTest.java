package crudOperationsUsingNormal;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetAllUserTest {
	@Test
	public void getAllUserTest()
	{
		  Response req = RestAssured.get("https://reqres.in/api/users?page=2");
		  
		 ValidatableResponse val = req.then();
		 val.assertThat().statusCode(200).log().all();
	}

}
