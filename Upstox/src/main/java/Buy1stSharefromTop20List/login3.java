package Buy1stSharefromTop20List;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login3 
{
	@FindBy(xpath="//button[@data-id='declineTour']")
	private WebElement declineTour;
	
	public login3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clicklogin3declineTour() throws IOException
	{
		declineTour.click();
	}

}
