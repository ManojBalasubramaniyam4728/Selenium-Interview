package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	
	@Parameters("browserName")
	@Test
	public void test(String browserName) {
		System.out.println(browserName);
		
	}

}
