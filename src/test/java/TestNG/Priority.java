package TestNG;

import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority = 1)
	public void Test1() {
		System.out.println("Order 1");
	}
	
	@Test(priority = 2)
	public void Test2() {
		System.out.println("Order 2");
	}


}
