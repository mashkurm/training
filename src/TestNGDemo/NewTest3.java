package TestNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest3 {
  @Test (priority = 1)
  public void f() {
	  System.out.println("test method f");
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }
  @Test (priority = 0)
  public void a() {
	  System.out.println("test method a");
	}
  @Test (priority = 2)
  public void b() {
	  System.out.println("test method b");
  }
  @Test (priority = -1)
  public void c() {
	  System.out.println("test method c");
  }
  @Test (priority = 3)
  public void d() {
	  System.out.println("test method d");
  }
}
