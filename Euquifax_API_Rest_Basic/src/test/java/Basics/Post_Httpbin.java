package Basics;

import io.restassured.RestAssured;

public class Post_Httpbin {

	public static void main(String[] args) {
		
		RestAssured.baseURI="https://restcountries.eu/rest/v2/name/";
		
		RestAssured
		.given()
		.body("This is a Post test")
		.log().all()
		.when()
		.post("/post")
		.then()
		.log().all()
		.assertThat().statusCode(200);
		
		
		
		
	}

}
