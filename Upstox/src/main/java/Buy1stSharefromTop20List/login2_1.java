package Buy1stSharefromTop20List;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import libraryFiles.utilityClass;

public class login2_1 {
	
	@FindBy(id="yob")
	private WebElement passcode;
	
	public login2_1(WebDriver driver)   //constructor
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setlogin2PIN() throws IOException
	{
		passcode.sendKeys(utilityClass.getdatafromPF("PIN"));
	}
	
	
}
