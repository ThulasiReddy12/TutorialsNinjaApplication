package TestCases;

import org.testng.annotations.Test;

import PageObjects.SignOutpage;

public class SignoutTestcases {
	SignOutpage soutpage = new SignOutpage ();
	@Test
	public void SignoutValidation() {
		soutpage.SignoutValidation();
	}

}
