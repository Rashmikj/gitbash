package Conflict;

import org.testng.annotations.Test;


public class FLoginTest {
@Test(groups="smoke")
public void openApp() {
	String URL= System.getProperty("url");
	String BROWSER= System.getProperty("browser");
	//String UN= System.getProperty("username");
	//String PWD= System.getProperty("password");
	}

@Test(groups="regression")
public void closeApp() {
	System.out.println("closed");
	}
}
