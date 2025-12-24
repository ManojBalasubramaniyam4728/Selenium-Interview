package TestNG;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(invocationCount = 10)
	  public void testcase() {
        System.out.println("Running 10 times");
    }
	
	@Test
	  public void testcase1() {
        System.out.println("Running one time");
    }

}
