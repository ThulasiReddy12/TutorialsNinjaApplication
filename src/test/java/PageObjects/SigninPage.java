package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import ApplicationBaeTest.BaseClass;

public class SigninPage extends BaseClass{
	By signin = By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]");
	By signmsg = By.xpath("//span[@class='base']");
	By email1 = By.xpath("//input[@id='email']");
	By password1 = By.xpath("//fieldset[@class='fieldset login']//input[@id='pass']");
	By signinbutton = By.xpath("//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]");
	By passwordempty = By.xpath("//div[@id='pass-error']");
	By emailempty = By.xpath("//div[@id='email-error']");
	By emailempty1 = By.xpath("//*[@id=\"email-error\"]");
	By passwordempty1 = By.xpath("//*[@id=\"pass-error\"]");
	By emailmistake = By.xpath("//*[@id=\"email-error\"]");
	By passwordmistake = By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div");
	public void signindropdown() {
click(signin);
	
	WebElement s = driver.findElement(signmsg);
	String str = driver.getTitle();
//enterText( email1,dataPro.getProperty("email"));
//enterText(password1 ,dataPro.getProperty("password"));
	//click(signinbutton);
	}
	//public void invalidusername() {
	//	enterText( email1,dataPro.getProperty("email"));
		//enterText(password1 ,dataPro.getProperty("password"));
			//click(signinbutton);}
public void emptyemail() {
	//email empty
	/*enterText(password1 ,dataPro.getProperty("password"));
	click(signinbutton);
	
	String actualMsg=Xpath(emailempty).getText();
	//System.out.println(actualMsg);
	//Assert.assertEquals(actualMsg, dataPro.getProperty("e1msg"), "This is a required field. message is not showing correct");
	String actualmsg= "This is a required field.";
	Assert.assertTrue(actualMsg.contains(dataPro.getProperty("e1msg")));
	
	System.out.println(actualMsg);
	//password empty
	enterText( email1,dataPro.getProperty("email"));
	click(signinbutton);

	String actualMsg=Xpath(passwordempty).getText();
	System.out.println(actualMsg);
	//both email and password empty
	click(signinbutton);
	String actualMsg=Xpath(emailempty1).getText();
	System.out.println(actualMsg);
	String actualMsg1=Xpath( passwordempty1).getText();
	System.out.println(actualMsg1);*/
	//wrong email(without giving @ symbol)
	//driver.findElement( email1).sendKeys("thulasi111gmail.com");
	//driver.findElement( password1).sendKeys("reddy@123");
	//click(signinbutton);

	//String actualMsg=Xpath(emailmistake).getText();
	//System.out.println(actualMsg);
	//wrong password(withoutgiving 3)
	driver.findElement( email1).sendKeys("thulasi111@gmail.com");
	driver.findElement( password1).sendKeys("reddy@12");
	click(signinbutton);
	String actualMsg=Xpath(passwordmistake).getText();
	System.out.println(actualMsg);
}
}