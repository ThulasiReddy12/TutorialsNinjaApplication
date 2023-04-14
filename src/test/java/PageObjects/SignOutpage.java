package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import ApplicationBaeTest.BaseClass;

public class SignOutpage extends BaseClass{
	By welcmemsg = By.xpath("//html/body/div[1]/header/div[1]/div/ul/li[1]/span");
By dropdwn = By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/span/button");
By signout = By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a");
public void SignoutValidation() {
	
		WebElement wm = driver.findElement( welcmemsg );
		String s1 = wm.getText();
		System.out.println(s1);
		System.out.println("printed");
		click(dropdwn );
		WebElement SignOut= driver.findElement(signout);
		Actions action = new Actions(driver);
		action.moveToElement(SignOut).click().perform();
		System.out.println("signed out");
}



}
