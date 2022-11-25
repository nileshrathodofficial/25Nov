package libraryFiles;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class utilityClass {
	/* Author Name : @Nilesh Rathod
	 * 
	 * utility class consist of selenium common functions
	 * like TakesScreenshot, Parameterization
	 * inside utility class we use static methods
	 * Use returntype String instead of void 
	 */
	public static String getdatafromPF(String key) throws IOException //properties file
	{
		FileInputStream PF = new FileInputStream("C:\\Users\\NILESH\\eclipse-workspace\\Upstox Project\\Upstox\\upstoxPropertiesFile.properties");
		Properties p = new Properties();
		p.load(PF);
		String value = p.getProperty(key);
		return value;
	}
	
	public static String getdatafromExcel(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException
	{
	   FileInputStream file = new FileInputStream("C:\\Users\\NILESH\\eclipse-workspace\\Upstox Project\\Upstox\\Testdata\\Framework.xlsx");
	   Sheet sh = WorkbookFactory.create(file).getSheet("Upstox-Akshay");
	   String data = sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
	   return data;
	}
	
	public static void captureSS(WebDriver driver,int TCID) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String str = RandomString.make(3);
		File dest=new File("C:\\Users\\NILESH\\eclipse-workspace\\Upstox Project\\Upstox\\Screenshots\\TCID"+TCID+str+".jpeg");
		FileHandler.copy(src, dest);
	}
	
	
	
	
}
