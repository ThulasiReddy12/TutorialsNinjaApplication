package TestCases;

import org.testng.annotations.Test;

import ApplicationBaeTest.BaseClass;

import PageObjects.SigninPage;

public class SigninPageTestcases extends BaseClass{
	SigninPage signpage = new SigninPage ();
	@Test
public void signinDrvalidation() {
	signpage.signindropdown();
	signpage.emptyemail();
}
}
