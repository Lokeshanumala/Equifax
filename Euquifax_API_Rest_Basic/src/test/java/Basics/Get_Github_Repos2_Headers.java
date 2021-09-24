package Basics;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;

public class Get_Github_Repos2_Headers {

	public static void main(String[] args) {
		// Root End point
		RestAssured.baseURI = "https://api.github.com";
		// Resource Path

		String resourcePath = "/users/{username}/repos";
		// GET Method
		RestAssured
				// Pre-requisites //arrange

				.given()
				.header("accept","application/vnd.github.v3+json") //header recommed by git hub
				.header("My_Header_1","My_Header_Value_1")//custom header ignored by git hub
				.queryParam("sort", "created")
				.pathParam("username", "Lokesh")
		        .header("Content-Type","application/json")
		        
//		        .log().all()

				// actions //act
				.when().get(resourcePath)

				// assertions //assert
				.then()
				.log().everything()
				.assertThat().statusCode(200)
//				.extract().response().prettyPrint();
		        .assertThat().body("[1].name", Matchers.equalToIgnoringCase("RestAssured"));
		
	}

}
