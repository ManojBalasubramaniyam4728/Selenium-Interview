package TestNG;

import org.testng.annotations.Test;

public class Groups2 {
	
	@Test(groups = {"smoke"})
    public void testLogin() {
        System.out.println("Running Smoke Test: Login for  Mobile");
    }

    @Test(groups = {"regression"})
    public void testProfileUpdate() {
        System.out.println("Running Regression Test: Mobile Profile Update");
    }

}
