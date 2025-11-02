package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupDependencyTest {

	@Test(groups = "smoke")
	public void test1() {
		System.out.println("Smoke test1 passed");
	}

	@Test(groups = "smoke")
	public void test2() {
		/*
		 * Intentionally failing the below method, so this and the finalTest method will
		 * not execute. If you want it to work, comment out the line below.
		 */
		Assert.assertFalse(true);
		System.out.println("Smoke test2 passed");
	}

	@Test(dependsOnGroups = "smoke")
	public void finalTest() {
		System.out.println("Running final test after all smoke tests");
	}
}
