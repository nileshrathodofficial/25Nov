package Login.Upstox;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import libraryFiles.utilityClass;

public class login1 {

	
	@FindBy(id="userCode")
	private WebElement username;
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	@FindBy(id="submit-btn")
	private WebElement signIn;
	
	login1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setlogin1UN() throws IOException
	{
		username.sendKeys(utilityClass.getdatafromPF("UN"));
	}
	
	public void setlogin1PWD() throws IOException
	{
		password.sendKeys(utilityClass.getdatafromPF("PWD"));
	}
	
	public void clicklogin1signInBtn()
	{
		signIn.click();
	}
}
