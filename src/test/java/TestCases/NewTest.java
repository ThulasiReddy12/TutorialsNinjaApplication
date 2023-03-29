package TestCases;

import org.testng.annotations.Test;

import ApplicationBaeTest.BaseClass;

public class NewTest extends BaseClass {
  @Test
  public void f() {
	  String s= driver.getCurrentUrl();
	  System.out.println(s);
	  
  }
}
