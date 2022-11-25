package Login.Upstox;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import libraryFiles.utilityClass;

public class login2 {
	
	@FindBy(id="yob")
	private WebElement passcode;
	
	login2(WebDriver driver)   //constructor
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setlogin2PIN() throws IOException
	{
		passcode.sendKeys(utilityClass.getdatafromPF("PIN"));
	}
	
	
}
