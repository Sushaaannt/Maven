package Module1_login1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class class03 {
	@FindBy(xpath ="//input[@id='userid']")private WebElement UN;
	@FindBy(xpath ="//input[@id='password']")private WebElement pwd;
	@FindBy(xpath ="//button[@type='submit']")private WebElement login;
	
	
	
	public class03(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setclass03username (String username)
	{
		UN.sendKeys(username);
	}
	public void setclass03password (String password)
	{
		pwd.sendKeys(password);
	}
	public void clickclass03loginbtn ()
	{
		login.click();
	}
	

}
