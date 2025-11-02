package TestNG;

import org.testng.annotations.Test;

public class Groups {

    @Test(groups = {"smoke"})
    public void testLogin() {
        System.out.println("Running Smoke Test: Login");
    }

    @Test(groups = {"regression"})
    public void testProfileUpdate() {
        System.out.println("Running Regression Test: Profile Update");
    }

    @Test(groups = {"smoke", "regression"})
    public void testDashboard() {
        System.out.println("Running Smoke and Regression Test: Dashboard");
    }

    @Test
    public void testNoGroup() {
        System.out.println("Running Test with No Group");
    }
}
