package Buy1stSharefromTop20List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login4 
{ // check whether correct user login or not
  // To verify UserName
	
	@FindBy(xpath="(//span[@class=\"_3YI_lRyLDAFhz2WE-6yGuX\"])[2]")
	private WebElement verifyUN;
	
	public login4(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getlogin4VerifyUN() 
	{
		return verifyUN.getText();	
	     
	}

}
