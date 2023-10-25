package crudOperationsUsingNormal;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetSingleUserTst {
	@Test
	public void getSingleTest()
	{
		//Step//1 - create prerequisites 
		// step: 2 send request
		Response response = RestAssured.get("https://reqres.in/api/users/2");
		
		//step 3: validate response
		ValidatableResponse val = response.then();
		val.assertThat().statusCode(200).log().all();
		
		
		
	}

}
