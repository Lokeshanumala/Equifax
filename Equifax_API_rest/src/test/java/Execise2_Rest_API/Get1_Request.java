package Execise2_Rest_API;

import io.restassured.RestAssured;

public class Get1_Request {

	public static void main(String args[]) {

		RestAssured.get("https://httpbin.org/get").prettyPrint();

	}

}
