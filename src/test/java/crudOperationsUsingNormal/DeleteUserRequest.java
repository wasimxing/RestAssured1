package crudOperationsUsingNormal;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class DeleteUserRequest {
	@Test
	public void deleteUserRequest()
	{
		Response respo = RestAssured.delete("https://reqres.in/api/users/2");
		ValidatableResponse val = respo.then();
		val.assertThat().statusCode(204).log().all();
		
		
		
	}

}
