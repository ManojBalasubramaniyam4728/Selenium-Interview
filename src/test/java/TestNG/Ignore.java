package TestNG;

import org.testng.annotations.Test;

public class Ignore {
	@Test
    public void test1() {
        System.out.println("Running test1");
    }

    @Test(enabled = false)
    public void test2() {
        System.out.println("This test is excluded and won't run");
    }

    @Test
    public void test3() {
        System.out.println("Running test3");
    }
}
