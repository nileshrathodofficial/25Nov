package Login.Upstox;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login4 
{ // check whether correct user login or not
  // To verify UserName
	
	@FindBy(xpath="(//span[@class=\"_3YI_lRyLDAFhz2WE-6yGuX\"])[2]")
	private WebElement verifyUN;
	
	login4(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getlogin4VerifyUN() 
	{
	    String usernm=verifyUN.getText();	
	    return usernm;
	}

}
