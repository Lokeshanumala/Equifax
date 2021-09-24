package openweathermap;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test_Get_Weather_By_City {

	public static void main(String[] args) {
	
RestAssured.baseURI = "https://api.openweathermap.org";
		
	
		
		RestAssured
		.given()
		.queryParam("q", "New Delhi")
		.queryParam("appid","1c31296b6e3ca473fd950953386a9173")
		.when()
		.get("/data/2.5/weather")
		.then()
		.log().body()
		.assertThat().body("weather[0].main",Matchers.equalTo("Mist"));
		
		String s=RestAssured
		.given()
		.queryParam("q", "New Delhi")
		.queryParam("appid","1c31296b6e3ca473fd950953386a9173")
		.when()
		.get("/data/2.5/weather")
		.then()
		.extract().response().jsonPath().getString("weather[0].main");
System.out.println(s);
	}
 public Response GetWeatherByCity(String cityName) {
	 return RestAssured
		.given()
		.queryParam("q", "New Delhi")
		.queryParam("appid","1c31296b6e3ca473fd950953386a9173")
		.when()
		.get("/data/2.5/weather")
		.then()
		.extract().response();
	 
 }
}
 
 
