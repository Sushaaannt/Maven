package LibraryFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class01baseclass {
	
	public WebDriver driver;
	
	public void openbrowser()  //non static so that we can extend it(inheritance)we need it in every testclass that is why
	{
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\Maven\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com/");
		
	}

}
