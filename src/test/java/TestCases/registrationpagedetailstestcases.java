package TestCases;

import org.testng.annotations.Test;

import PageObjects.registrationpageaDetails;

public class registrationpagedetailstestcases {
	registrationpageaDetails pagedetails=new registrationpageaDetails();
	@Test
	public void registrationpagevalidation() throws Exception {
		pagedetails.detailspage();
		
	}
}
