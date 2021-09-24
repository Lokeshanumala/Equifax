package openweathermap;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test_Get_Weather_By_City2_Orginzed {

	public static void main(String[] args) {
		RestAssured.baseURI = "https://api.openweathermap.org";
		printWeather(GetWeatherByCity("New Delhi"));
		
		printWeather(GetWeatherByCity("Mumbai"));
		
	}
 public static Response GetWeatherByCity(String cityName) {
	 return RestAssured
		.given()
		.queryParam("q", "New Delhi")
		.queryParam("appid","1c31296b6e3ca473fd950953386a9173")
		.when()
		.get("/data/2.5/weather")
		.then()
		.extract().response();
	 
 }
 
 public static void printWeather(Response r) {
	 System.out.println(r.jsonPath().getString("weather[0].main"));
 }
}
 
 
