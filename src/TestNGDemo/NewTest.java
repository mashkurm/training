package TestNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("test method");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method");
	 
  }
  @Test
  public void y() {
	  System.out.println("test method 2");
  }
  @BeforeClass
  public void w() {
	  System.out.println("before class");
  }
 
  @AfterClass
public void u() {
	System.out.println("after class");
	
}
}
