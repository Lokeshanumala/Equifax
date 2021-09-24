package Basics;



import java.util.List;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test_Get_Countories_By_Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI = "https://restcountries.eu/";
		
		String resourcePath ="/rest/v2/name/{name}";
		
		Response r=RestAssured 
		.given()
		.pathParam("name", "United")
		.when()
		.get(resourcePath)
		.then()
		.extract().response();
		//Print the first country
		
	System.out.println("List of COuntries: "+r.jsonPath().getList("name"));
	List<String> listofcountries =r.jsonPath().getList("name");
	for(String country: listofcountries) {
		System.out.println(country);
		
		//2.Print all details
		
		System.out.println(r.jsonPath().getString("[1]"));
	}
	}

}
