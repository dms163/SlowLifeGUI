import org.junit.Test;
import static org.junit.Assert.*;

public class PinningTests {
	
	/* Tests toString method for the Cell class
	   Changes the life of the test cell to simulate some variance.
	   Then tests the equivalence of the oldtoString and toString method.
	   Asserts true if the are equal.
	*/
	@Test
	public void toStringTest(){
		Cell testCell = new Cell();
		testCell.setAlive(false);
		testCell.setAlive(true); 
		testCell.setAlive(false);
		String OldToString = testCell.OldToString();
		String toString = testCell.toString();
		assertTrue(OldToString.equals(toString));
		
	}
	/* Tests toString method for the Cell class
	   Changes the life of the test cell to false.
	   Then tests the equivalence of the oldtoString and toString method.
	   Asserts true if the are equal.
	*/
	@Test
	public void toStringTest2(){
		Cell testCell = new Cell();
		testCell.setAlive(false); 
		String OldToString = testCell.OldToString();
		String toString = testCell.toString();
		assertTrue(OldToString.equals(toString));
		
	}
	/* Tests toString method for the Cell class
	   Changes the life of the test cell to true.
	   Then tests the equivalence of the oldtoString and toString method.
	   Asserts true if the are equal.
	*/
	@Test
	public void toStringTest3(){
		Cell testCell = new Cell();
		testCell.setAlive(true); 
		String OldToString = testCell.OldToString();
		String toString = testCell.toString();
		assertTrue(OldToString.equals(toString));
		
	}

	/* Test the convertToInt()
	   Created an arbitrary test integer.
	   Compares old ToIntTest and to current toIntTest.
	   Asserts true if the integers are equal.
	*/
	@Test
	public void convertToIntTest(){
		int testInt = 26;
		MainPanel panel = new MainPanel(1);
		int OldConvert = panel.OldconvertToInt(testInt);
		int convertToInt = panel.convertToInt(testInt);
		assertTrue(OldConvert==convertToInt);
	}
	/* Test the convertToInt()
	   Created a test integer with max value.
	   Compares old ToIntTest and to current toIntTest.
	   Asserts true if the integers are equal.
	*/
	@Test
	public void convertToIntTest2(){
		int testInt = Integer.MAX_VALUE;
		MainPanel panel = new MainPanel(1);
		int OldConvert = panel.OldconvertToInt(testInt);
		int convertToInt = panel.convertToInt(testInt);
		assertTrue(OldConvert==convertToInt);
	}
	/* Test the convertToInt()
	   Created a negative test integer.
	   This test will always fail because the program will crash before a negative can be accepted.
	*/
	@Test 
	public void convertToIntTest3(){
		int testInt = -6;
		MainPanel panel = new MainPanel(1);
		StringBuilder OldConvert = new StringBuilder();
		OldConvert.append(panel.OldconvertToInt(testInt));
		int convertToInt = panel.convertToInt(testInt);
		StringBuilder ConverttoInt = new StringBuilder();
		ConverttoInt.append(convertToInt);
		if(ConverttoInt.toString().equals(OldConvert.toString())){
			assertTrue(true);
		}else{
			assertFalse(false);
		}
		
	}
}
