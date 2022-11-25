package Buy1stSharefromTop20List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class select1stShare 
{	
	@FindBy(xpath="//button[@data-id='watchlistAdd']")
	private WebElement wishlistbtn;
	@FindBy(xpath="//input[@data-id='scripSearchInput']")
	private WebElement searchShare;
	@FindBy(xpath="(//div[@class='_1xbaDJ9uOYw7CYWQ8GccOj'])[1]")
	private WebElement selectShare;
	@FindBy(xpath="//div[@id='scripDetailsActions']//div[text()='Buy']")
	private WebElement verifyBuy;
	@FindBy(xpath="//div[@id='scripDetailsActions']//div[text()='Buy']")
	private WebElement clickOnBuy;
	@FindBy(id="quantity")
	private WebElement quantity;
	@FindBy(xpath="(//span[@id='undefined_dropdown_btn'])[2]")
	private WebElement productType;
	@FindBy(xpath="//span[@class='_1YYA2Qt24RztqlfeEeazOp']")
	private WebElement estMargin;
	@FindBy(xpath="//div[text()='Review Buy Order']")
	private WebElement reviewOrder;
	@FindBy(xpath="//div[text()='Place Buy Order']")
	private WebElement placeOrder;
	public select1stShare(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickselect1stSharewishlistbtn()
	{
		wishlistbtn.click();
	}
	
	public void setselect1stSharesearchShare(String share)
	{
		searchShare.sendKeys(share);
	}
	public void clickselect1stShareShare()
	{
	  selectShare.click();
	}
	public String verifyselect1stBuy()
	{
		return verifyBuy.getText();
	
	}
	public void clickBuy()
	{
		clickOnBuy.click();
	}
	public void setQuantity()
	{
		quantity.sendKeys("1");
	}
	public void selectProductType(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.moveToElement(productType).click().perform();
		act.sendKeys(Keys.DOWN).click().perform();
	}
	public String getEstMargin()
	{
		return estMargin.getText();
	}
	public void clickReviewOrder()
	{
		reviewOrder.click();
	}
	public void clickPlaceOrder()
	{
		placeOrder.click();
	}

}
