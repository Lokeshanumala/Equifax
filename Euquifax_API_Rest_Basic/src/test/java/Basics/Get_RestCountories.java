package Basics;

import io.restassured.RestAssured;

public class Get_RestCountories {

	public static void main(String[] args) {
		// Root End point
		RestAssured.baseURI = "https://api.github.com";
		// Resource Path

		String resourcePath = "/users/{username}/repos";
		// GET Method
		RestAssured
				// Pre-requisites //arrange

				.given().queryParam("sort", "pushed")
				.pathParam("username", "Lokeshanumala")

				// actions //act
				.when().get(resourcePath)

				// assertions //assert
				.then().extract().response().prettyPrint();
	}

}
