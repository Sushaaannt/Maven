package Module1_login1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class class05 {
	
	@FindBy(xpath = "//span[@class='user-id']") private WebElement ActUN;
	
	public class05(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getuserid()
	{
		String act = ActUN.getText();
		return act;
	}

}
