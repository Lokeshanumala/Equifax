package Execise2_Rest_API;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Post_Request {
	
	@Test
	public void postAPIAutomation() {
		
		RestAssured.baseURI = "https://reqres.in/api/users";
		RestAssured.given().body("{\r\n" + 
				"    \"name\": \"Lokesh\",\r\n" + 
				"    \"job\": \"API\"\r\n" + 
				"}").post().then()
		.log().all()
		.assertThat().statusCode(201);
		
	}
	
	
}
