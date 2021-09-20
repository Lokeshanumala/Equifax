package Execise2_Rest_API;

import org.testng.annotations.Test;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.equalTo;


public class Get1_Request {
	
	@Test
	public void getWeatherDetails() {
		given()
		.when()
		.get("http://dummy.restapiexample.com/api/v1/employees")
		.then()
			
			.statusCode(200)
			.statusLine("HTTP/1.1 200 OK")
			.assertThat().body("employee_salary", equalTo("320800"))
			.header("Content-Type", "application/json");
	}



}
