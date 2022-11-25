package libraryFiles;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.DataProvider;

public class baseClass
{
/*   Author Name : @Nilesh Rathod 
     Base class consist of mandatory code; which run everytime like open browser, Open URL
*/
	protected WebDriver driver;
	public void initializeBrowser() throws IOException
	{
//		driver =new ChromeDriver();
//		driver.manage().window().maximize();
//		
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\NILESH\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		
		FirefoxOptions options =new FirefoxOptions();
		options.setHeadless(true);
		
		driver = new FirefoxDriver(options);
		driver.get(utilityClass.getdatafromPF("URL"));
	}
	@DataProvider(name="stockname")
	public Object[][] datasupplier() throws IOException
	{
//		Object [][] data = new Object [4][4][4][4];
//		data[0][0] =utilityClass.getdatafromPF("UN1");
//		data[0][1] =utilityClass.getdatafromPF("PWD1");
//		data[0][2] =utilityClass.getdatafromPF("PIN1");
//		data[0][3] =utilityClass.getdatafromPF("USERNAME1");
		Object [][] data = {{"TATA"}, {"IFCI"}, {"SBI"}};
		return data;
	}
	
}
