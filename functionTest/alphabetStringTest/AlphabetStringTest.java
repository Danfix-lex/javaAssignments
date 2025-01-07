import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;



public class AlphabetStringTest{

	@Test
	public void testAlphabetStringTest() {

		//Given
		AlphabetString alphabetString = new AlphabetString();
		String input = "The  quick brown fox jumps over the lazy dog";

		//Action
		boolean result = AlphabetString.hasAllAlphabets(input);

		//Check
		assertTrue(result);
		
	}

}
