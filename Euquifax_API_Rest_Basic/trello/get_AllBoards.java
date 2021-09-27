package trello;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class get_AllBoards extends TrelloBase{
	@Test
	public void testBoardForAUser() {

		List<String> boardnames = Functionality.getAllboards();
		Assert.assertTrue(boardnames.contains("Board_11"));
		List<String> expected = new ArrayList<String>();
		expected.add("Board_1");
		expected.add("Board_11");
		expected.add("Board_44");
		Assert.assertEquals(boardnames, expected);
	}
}
