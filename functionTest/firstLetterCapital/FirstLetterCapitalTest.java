import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class FirstLetterCapitalTest{

	@Test
	public void testFirstLetterCapitalTest() {

		//Start
		FirstLetterCapital firstLetterCapital = new FirstLetterCapital();
		String sentence = "All is well that ends well";

		//Action
		String result = FirstLetterCapital.hasAllFirstCapitalLetter(sentence);
		String expected = "All Is Well That Ends Well";

		//Check
		assertEquals(result, expected);
		
	}

}
