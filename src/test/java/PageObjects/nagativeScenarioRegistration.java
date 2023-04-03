package PageObjects;

import org.openqa.selenium.By;

import ApplicationBaeTest.BaseClass;

public class nagativeScenarioRegistration extends BaseClass {

	
	By firstname=By.xpath("//input[@id='input-firstname']");
	By lastname=By.xpath("//input[@id='input-lastname']");
	By email =By.xpath("//input[@id='input-email']");
	By telephone =By.xpath("//input[@id='input-telephone']");
	By password =By.xpath("//input[@id='input-password']");
	By confirm  =By.xpath("//input[@id='input-confirm']");
	By continuebutton =By.xpath("//input[@value='Continue']");
	By privacypolicy =By.xpath("//input[@name='agree']");
	
	
	
	public void nagativemethod() {
		driver.findElement(firstname).click();
		driver.findElement(lastname).click();
		driver.findElement(email).click();
		driver.findElement(telephone).click();
		driver.findElement(password).click();
		driver.findElement(confirm).click();
		driver.findElement(privacypolicy).click();
		driver.findElement(continuebutton).click();
		
		
	}
}
