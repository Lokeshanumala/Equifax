package Basics;

import io.restassured.RestAssured;

public class Get_Github_Repos2_Organized {

	public static void main(String[] args) {
		// Root End point
		RestAssured.baseURI = "https://api.github.com";
		// Resource Path

		String resourcePath = "/users/ameyanaik/repos?sort=pushed";
		//GET Method
		RestAssured.get(resourcePath).prettyPrint();

	}

}
