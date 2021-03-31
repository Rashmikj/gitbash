package Conflict;

import org.testng.annotations.Test;

public class ContacTest {

	@Test(groups="smoke")
	public void orgTest() {
		System.out.println("apple");

		//System.out.println("ball pen");

		

		//System.out.println("cat");
	}
	

	@Test(groups="smoke")
	public void LoginTest() {
		System.out.println("dog");
		//System.out.println("testing continuosly");
	}
	
	

	@Test(groups="smoke")
	public void Test() {
		System.out.println("elephant");
	}
	
	@Test(groups="regression")
	public void Modify() {
		//a=10;
		System.out.println("fox");
	}
	

	
	
}
