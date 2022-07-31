package LibraryFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class class02utilityclass {
	
	
	//static method because we can access it by className.methodName
	//we dont have to inherit it
	public static String gettestdata (int Rowindex,int Cellindex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("D:\\New folder\\Maven\\Test Data\\Book1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		String value = sh.getRow(Rowindex).getCell(Cellindex).getStringCellValue();
		
		return value;
	}
	public static void captureScreenshot(WebDriver driver ,int TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("D:\\New folder\\Maven\\Screenshots\\Testcase"+ TCID +".png");
		
		FileHandler.copy(src, dest);
		
	}
	public static String getPFdata(String key) throws IOException
	{
		FileInputStream file= new FileInputStream("D:\\New folder\\Maven\\propertyFile.properties");
		Properties p = new Properties();
		p.load(file);
		
		String value = p.getProperty(key);
		
		return value;
		
	}


}
