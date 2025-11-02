package TestNG;

import org.testng.annotations.Test;

public class ExcludeGroup {
	
	@Test(groups = "smoke")
    public void test1() {
        System.out.println("Running test1 - smoke group");
    }

    @Test(groups = "regression")
    public void test2() {
        System.out.println("Running test2 - regression group");
    }

    @Test
    public void test3() {
        System.out.println("Running test3 - no group");
    }

}
