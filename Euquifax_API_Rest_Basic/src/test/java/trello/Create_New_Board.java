package trello;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Create_New_Board {

	@Test
	public void testCreateOfNewBoard() {
		Response r=Functionality.Create_Board("Board_44");
		Assert.assertNotNull(r);
		Assert.assertTrue(r.statusCode() == 200);
	}
	
}
