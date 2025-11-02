package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionInTestNG {
	
	@Test
	public void Test() {
		System.out.println("Hard Assertion Strat from Here :");
		System.out.println("Below is wrong but it will stop There only");
		Assert.assertTrue(false);
		System.out.println("Below is right then it will go to next line");
		Assert.assertTrue(true);
		System.out.println("Hard Assertion Ended Here");
		
		
	}

}
