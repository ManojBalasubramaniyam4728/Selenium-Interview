package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTest {

    @Test
    public void login() {
        System.out.println("Login successful");
    }

    @Test(dependsOnMethods = "login")
    public void accessDashboard() {
    	/* Intentionally failing the below method, 
    	   so this and the logout method will not execute.
    	   If you want it to work, comment out the line below. */
    	 Assert.assertFalse(true);
        System.out.println("Accessing dashboard after login");
    }

    @Test(dependsOnMethods = {"login", "accessDashboard"})
    public void logout() {
        System.out.println("Logout successful");
    }
}

