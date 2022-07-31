package Module1_login1_test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LibraryFiles.class01baseclass;
import LibraryFiles.class02utilityclass;
import Module1_login1.class03;
import Module1_login1.class04;
import Module1_login1.class05;


public class class06 extends class01baseclass  {
	
	class03 login1;
	class04 login2;
	class05 home;
	int TCID ;
	
	@BeforeClass
	public void m1 ()
	{
		openbrowser();
			
	}
	
	
	@BeforeMethod
	public void login() throws EncryptedDocumentException, IOException
	{
		
		login1= new class03(driver);
		login2= new class04(driver);
		home= new class05(driver);
		
		 login1.setclass03username(class02utilityclass.gettestdata(0, 0));
		 login1.setclass03password(class02utilityclass.gettestdata(0, 1));
		 login1.clickclass03loginbtn();
		 
		 
		 login2.setclass04pin(class02utilityclass.gettestdata(0, 2));
		 login2.clickoncnt();
		 
	}
	
	@Test
	public void verifyid() throws EncryptedDocumentException, IOException
	{
		TCID=101;
		String actid = home.getuserid();
		String expid = class02utilityclass.gettestdata(0, 1);
		
		Assert.assertEquals(actid, expid,"failed");
	}
	
	@AfterMethod
	public void logoutfromapp(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			class02utilityclass.captureScreenshot(driver, TCID);
		}
	}
	
	
	@AfterClass
	public void closebrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
		
	}
	
	
	

}
