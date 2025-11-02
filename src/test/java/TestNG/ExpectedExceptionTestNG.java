package TestNG;

import org.testng.annotations.Test;

public class ExpectedExceptionTestNG {
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void testDivisionByZero() {
	    int result = 10 / 0; 
	    System.out.println(result);
	}

}
