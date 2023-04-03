package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import ApplicationBaeTest.BaseClass;
import utilities.Utilities;

public class registrationpageaDetails extends BaseClass{
	
		By firstname=By.xpath("//input[@id='input-firstname']");
		By lastname=By.xpath("//input[@id='input-lastname']");
		By email =By.xpath("//input[@id='input-email']");
		By telephone =By.xpath("//input[@id='input-telephone']");
		By password =By.xpath("//input[@id='input-password']");
		By confirm  =By.xpath("//input[@id='input-confirm']");
		By continuebutton =By.xpath("//input[@value='Continue']");
		By privacypolicy =By.xpath("//input[@name='agree']");
	By message =By.xpath("//*[@id=\"content\"]/p[1]");
	public void detailspage() throws Exception {
		WebElement fn= driver.findElement(firstname);
		Boolean first = fn.isDisplayed();
		System.out.println(first);
		Boolean first1 = fn.isEnabled();
		System.out.println(first1);
		driver.findElement( firstname).sendKeys("kalwakolu");
		
		WebElement ln = driver.findElement(lastname);
		Boolean last = ln.isDisplayed();
		System.out.println(last);
		Boolean last1 = ln.isEnabled();
		System.out.println(last1);
		driver.findElement(lastname ).sendKeys("Thulasi");
		
		WebElement em = driver.findElement (email);
		Boolean email1 =  em.isDisplayed();
		System.out.println(email1);
		Boolean email2 =  em.isEnabled();
		System.out.println(email2);
		driver.findElement(email ).sendKeys(Utilities.random_EmailID());
		
		WebElement tn =  driver.findElement(telephone);
		Boolean display = tn.isDisplayed();
		System.out.println( display);
		Boolean enable =  tn.isEnabled();
		System.out.println(enable );
		driver.findElement(telephone).sendKeys("9542425388");
		
		WebElement ps = driver.findElement(password);
		Boolean display1 = ps.isDisplayed();
		System.out.println(display1 );
		Boolean enable2 = ps.isEnabled();
		System.out.println(enable2 );
		driver.findElement(password ).sendKeys("thulasireddy@2017");
		
		WebElement cn = driver.findElement(confirm);
		Boolean display2 = cn.isDisplayed();
		System.out.println(display2);
		Boolean display3 = cn.isEnabled();
		System.out.println(display3);
		driver.findElement(confirm ).sendKeys("thulasireddy@2017");
		
		Thread.sleep(3000);
		driver.findElement(privacypolicy ).click();
		Thread.sleep(3000);
		driver.findElement( continuebutton).click();
		Thread.sleep(3000);
		
		WebElement ms = driver.findElement(message);
		String s=ms.getText();
		String actualOutput = "Congratulations! Your new account has been successfully created!";
		Assert.assertEquals(actualOutput, s,"outputmessagenotequal");
		System.out.println(s);
		
	}
}
	

