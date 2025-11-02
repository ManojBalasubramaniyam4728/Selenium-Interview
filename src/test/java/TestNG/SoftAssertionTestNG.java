package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionTestNG {
	
	@Test
	public void Test() {
		System.out.println("Soft Assertion Strat from Here :");
		SoftAssert softAssert=new SoftAssert();
		System.out.println("Below is wrong but it will not stop go to next line");
		softAssert.assertTrue(false);
		System.out.println("Below is right then it will go to next line");
		softAssert.assertTrue(true);
		System.out.println("Soft Assertion Ended Here");
		//report all softassertion here
		softAssert.assertAll();
		
		
	}

}
