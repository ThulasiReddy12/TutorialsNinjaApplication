package TestCases;

import org.testng.annotations.Test;

import ApplicationBaeTest.BaseClass;
import PageObjects.Regisstrationpage;

public class registrationpagetestcases extends BaseClass {
	
	Regisstrationpage registration = new Regisstrationpage ();
	@Test
	public void myaccountdropdownvalidation() {
		registration.myaccountbutton();
	}
	@Test
	public void myregistrationvalidation() {
		registration.registrationbutton();
	}
}


