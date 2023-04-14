package PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;



import ApplicationBaeTest.BaseClass;
import utilities.Utilities;

public class CreateAccountPage extends BaseClass{
	By defaultmsg = By.xpath("//div[@class='panel header']//span[@class='not-logged-in'][normalize-space()='Default welcome msg!']");
	By createacc = By.xpath("//div[@class='panel header']//a[normalize-space()='Create an Account']");
	By Firsrname = By.xpath("//input[@id='firstname']");
	By Lastname = By.xpath("//input[@id='lastname']");
	By Newsletter  = By.xpath("//input[@id='is_subscribed']");
	By Email = By.xpath("//input[@id='email_address']");
	By Password = By.xpath("//input[@id='password']");
	By confirmpass= By.xpath("//input[@id='password-confirmation']");
	By Createaccount= By.xpath("//button[@title='Create an Account']//span[contains(text(),'Create an Account')]");
	//By message= By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div");
	static By success=By.xpath("//*[contains(text(),'Thank you for registering with Main Website Store.')]");
	public void accountcreating() {
		WebElement dm = driver.findElement(defaultmsg);
		String s1 = dm.getText();
		System.out.println(s1);
		driver.findElement(createacc).click();
		System.out.println("excecuted");
		
	}
	
	public void accountDetails() throws Exception {
		WebElement fn = driver.findElement(Firsrname);
		Boolean display = fn.isDisplayed();
		System.out.println(display);
		Boolean enable = fn.isEnabled();
		System.out.println(enable);
		Boolean select = fn.isSelected();
		System.out.println(select);
		enterText(Firsrname,dataPro.getProperty("firstName"));
		//driver.findElement(Firsrname).sendKeys("Thulasi");
		
	}
		public void lastnamevalidation() throws Exception {
			
		WebElement ln= driver.findElement(Lastname);
		Boolean display1 = ln.isDisplayed();
		System.out.println(display1);
		Boolean enable1 = ln.isEnabled();
		System.out.println(enable1);
		enterText(Lastname,dataPro.getProperty("lastName"));
		
		}
		public void newsLetterValidation() throws Exception {
		WebElement nl= driver.findElement(Newsletter);
		Boolean display2 = nl.isDisplayed();
		System.out.println(display2);
		Boolean enable2 = nl.isEnabled();
		System.out.println(enable2);
		click(Newsletter);
		//driver.findElement(Newsletter).click();
		enterText(Email ,Utilities.random_EmailID());
		}
		public void emailValidation() throws Exception {
		WebElement em= driver.findElement(Email );
		Boolean display3 = em.isDisplayed();
		System.out.println(display3);
	Boolean enable3 = em.isEnabled();
	System.out.println(enable3);
	driver.findElement(Email).sendKeys(Utilities.random_EmailID());
	enterText(Email,Utilities.random_EmailID());
	}
		

		public void passwordValidation() throws Exception {
		WebElement ps= driver.findElement(Password);
		Boolean display4 = ps.isDisplayed();
		System.out.println(display4);
		Boolean enable4 = ps.isEnabled();
		System.out.println(enable4);
		enterText(Password,dataPro.getProperty("password"));
		//driver.findElement(Password).sendKeys("welcome@123");
		
		}
		public void confirmPasswordValidation() throws Exception {
		WebElement cp= driver.findElement(confirmpass);
		Boolean display5 = cp.isDisplayed();
		System.out.println(display5);
		Boolean enable5 = cp.isEnabled();
		System.out.println(enable5);
		enterText(confirmpass,dataPro.getProperty("confirmpassword"));
		//driver.findElement(confirmpass).sendKeys("welcome@123");
		
			
		WebElement ca= driver.findElement(Createaccount);
		Boolean display6 = ca.isDisplayed();
		System.out.println(display6);
		Boolean enable6 = ca.isEnabled();
		System.out.println(enable6);
		click(Createaccount);
		//driver.findElement(Createaccount).click();
		Thread.sleep(5000);
		WebElement succ = driver.findElement(success);
		//Thread.sleep(2000);
		//driver.navigate().refresh();
		
		String s=succ.getText();
		System.out.println(s);
		String actualOutput = "Thank you for registering with Main Website Store.";
		Thread.sleep(2000);
		Assert.assertTrue(s.contains(actualOutput));
		System.out.println(s);
		
		}
		
	}


			
		
	


