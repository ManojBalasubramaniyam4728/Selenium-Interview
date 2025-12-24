package TestNG;

import org.testng.annotations.Test;

public class ThreadPoolSize {
	
	@Test(threadPoolSize = 10, invocationCount = 10)
	  public void testcase() {
      System.out.println("Running 10 times in 10 diffrent threads");
  }
	
	@Test
	  public void testcase1() {
      System.out.println("Running one time");
  }

}
