package PageObjects;

import org.openqa.selenium.By;

import ApplicationBaeTest.BaseClass;

public class Regisstrationpage extends BaseClass{
	
	By account=By.xpath("//span[normalize-space()='My Account']");
	By register=By.xpath("//a[normalize-space()='Register']");
	
	
	public void myaccountbutton () {
		driver.findElement(account).click();
	}
public void registrationbutton () {
	driver.findElement(register).click();
}
}


