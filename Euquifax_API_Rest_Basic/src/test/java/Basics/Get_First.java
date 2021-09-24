package Basics;

import io.restassured.RestAssured;

public class Get_First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.get("https://httpbin.org/get").prettyPrint();

	}

}
