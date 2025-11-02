package TestNG;

import org.testng.annotations.Test;

public class Parallel {
	@Test
	public void test1() {
		System.out.println("Test 1 - Thread ID: " + Thread.currentThread().getName());
	}

	@Test
	public void test2() {
		System.out.println("Test 2 - Thread ID: " + Thread.currentThread().getName());
	}

	@Test
	public void test3() {
		System.out.println("Test 3 - Thread ID: " + Thread.currentThread().getName());
	}
}
