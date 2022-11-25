package Login.Upstox;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import libraryFiles.baseClass;
import libraryFiles.utilityClass;
public class LoginAndVerifyUser extends baseClass
{

	login1 obj1;
	login2 obj2;
	login3 obj3;
	login4 obj4;
	int TCID;
	@BeforeClass
	public void OpenBrowser() throws IOException
	{
		initializeBrowser();
		obj1 = new login1(driver);
		obj2 = new login2(driver);
		obj3 = new login3(driver);
		obj4 = new login4(driver);
	}
	
	@BeforeMethod
	public void loginToApp() throws IOException
	{
		obj1.setlogin1UN();
		obj1.setlogin1PWD();
		obj1.clicklogin1signInBtn();
		obj2.setlogin2PIN();
		obj3.clicklogin3declineTour();
	}
	@Test
	public void verifyUser() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		TCID=101;
		Thread.sleep(3000);
		String actUN =obj4.getlogin4VerifyUN(); 
		String expUN = utilityClass.getdatafromExcel(4, 1);
		Assert.assertEquals(actUN, expUN,"Expected & Actual username not match");
	}
	
	@AfterMethod
	public void logoutToApp(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE) 
		{
			utilityClass.captureSS(driver, TCID);
		}
		//driver.logout();
		driver=null;
		obj1=null;
		obj2=null;
		obj3=null;
		obj4=null;
	}
	
	@AfterClass
	public void quitBrowser()
	{
		//driver.quit();
	}
	
}
