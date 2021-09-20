package Execise2_Rest_API;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Get2_Request {
	
	@Test
	public void get2WhetherDetails() {
		
		RestAssured.baseURI="https://reqres.in/api/users?page=2";
		RestAssured.given().param("page", "3")
		.when()
		.get()
		.then()
		.assertThat().log().all()
		.statusCode(200);
		
	}
	

}
