package TestCases;

import org.testng.annotations.Test;

import ApplicationBaeTest.BaseClass;
import PageObjects.CreateAccountPage;

public class CreateAccountPageTestcases extends BaseClass{
	CreateAccountPage accountpage = new CreateAccountPage();
	@Test
	public void verifyingDefaultMessage() throws Exception {
		accountpage.accountcreating();
		accountpage.accountDetails();
		accountpage.lastnamevalidation();
		accountpage.newsLetterValidation();
		accountpage.emailValidation();
		accountpage.passwordValidation();
		accountpage.confirmPasswordValidation();
		//accountpage.newsLetterValidation();
		
		
	}
	
}
