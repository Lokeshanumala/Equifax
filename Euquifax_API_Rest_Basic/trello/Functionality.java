package trello;

import static org.testng.Assert.expectThrows;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;



public class Functionality extends TrelloBase {
	
	
	
	public static  Response Create_Board(String boardname) {
		
		String path="/1/boards";
		
		
		 RestAssured
		.given()
//		.header("content_Type" )
		.contentType(ContentType.JSON)
		.queryParam("name", boardname)
		.queryParam("key", "efba9640ea8580c5840fe200b70016e8")
		.queryParam("token", "1d5f57ba363dceced0047bb3d979b50c0fcef1e762509f6430beb654e2d045be")
		.when()
		.post(path)
		.then()
		.log().all();
		return null;
		
		
		
	}

	public static List<String> getAllboards() {
		
		List<String>boardnames =new ArrayList<>();
		boardnames= RestAssured
			.given()
//			.header("content_Type" )
			.contentType(ContentType.JSON)
			
			.queryParam("key", "efba9640ea8580c5840fe200b70016e8")
			.queryParam("token", "1d5f57ba363dceced0047bb3d979b50c0fcef1e762509f6430beb654e2d045be")
			.when()
			.get("/1/members/me/boards")
			.then()
			//.log().all()
	       .extract().response().jsonPath().getList("name");
		 System.out.println(boardnames);
		return boardnames;
	}
}
