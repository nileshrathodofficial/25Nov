package Buy1stShare;
import java.io.IOException;
import java.time.Duration;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Buy1stSharefromTop20List.login1;
import Buy1stSharefromTop20List.login2_1;
import Buy1stSharefromTop20List.login3;
import Buy1stSharefromTop20List.login4;
import Buy1stSharefromTop20List.select1stShare;
import libraryFiles.baseClass;
import libraryFiles.utilityClass;
public class select1stShareTest extends baseClass
{
	login1 obj1;
	login2_1 obj2;
	login3 obj3;
	login4 obj4;
	select1stShare obj5;
	private static Logger logger =LogManager.getLogger(select1stShareTest.class);
	
	@BeforeClass 
	public void openBrowser() throws IOException, InterruptedException
	{
		logger.info("Hello World.....");
		logger.info("we are in logger info mode");
		initializeBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		obj1 = new login1(driver);
		obj2 = new login2_1(driver);
		obj3 = new login3(driver);
		obj4 = new login4(driver);
		obj5 = new select1stShare(driver);
		
		obj1.setlogin1UN();
		obj1.setlogin1PWD();
		obj1.clicklogin1signInBtn();
		obj2.setlogin2PIN();
		obj3.clicklogin3declineTour();
		Thread.sleep(3000);
	}
	/*@BeforeMethod
	public void loginToApp() throws IOException, InterruptedException
	{
		
	}*/
	
	@Test(priority=1)
	public void verifyUser() throws EncryptedDocumentException, IOException
	{
		String actUN =obj4.getlogin4VerifyUN(); 
		String expUN = utilityClass.getdatafromExcel(4, 1);
		Assert.assertEquals(actUN, expUN,"Expected & Actual username not match");
	}
	@Test(priority=2, dataProvider="stockname")
	public void verifyBuybtn(String share) throws InterruptedException
	{
		Thread.sleep(5000);
		obj5.clickselect1stSharewishlistbtn();
		obj5.setselect1stSharesearchShare(share);
		obj5.clickselect1stShareShare();
		String d = obj5.verifyselect1stBuy();
		String f = "Buy";
		Assert.assertEquals(d, f);
		Reporter.log("Buy Share Button is present", true);	
	}
	@Test(priority=3)
	public void BuyShare()
	{
		obj5.clickBuy();
		obj5.setQuantity();
		obj5.selectProductType(driver);//delivery
		String str = obj5.getEstMargin();
		Reporter.log("Estimated margin Rs. "+str, true);
		obj5.clickReviewOrder();
		obj5.clickPlaceOrder();
	}
	@AfterClass
	public void logoutToapp()
	{
		//logout
		driver.quit();
		driver=null;
		obj1=null;
		obj2=null;
		obj3=null;
		obj4=null;
		obj5=null;
	}
}
