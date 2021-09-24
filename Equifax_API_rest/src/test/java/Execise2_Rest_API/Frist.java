package Execise2_Rest_API;

import io.restassured.RestAssured;

public class Frist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.get("https://httpbin.org/get").prettyPrint();
	}

}
