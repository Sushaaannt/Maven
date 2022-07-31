package Module1_login1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class class04 {
	
	@FindBy(xpath ="//input[@id='pin']")private WebElement pn;
	@FindBy(xpath ="//button[@type='submit']")private WebElement cntbtn;
	
	
	
	public class04(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setclass04pin (String pin)
	{
		pn.sendKeys(pin);
	}
	public void clickoncnt ()
	{
		cntbtn.click();
	}
	

}
