package trello;

import io.restassured.RestAssured;

public class TrelloBase {
	
	public TrelloBase() {
		
		System.out.println("Hello form constructor");
		RestAssured.baseURI="https://api.trello.com";
		
	}
	
}
