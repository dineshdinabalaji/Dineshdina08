package objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepageobjects extends basepage {

	@FindBy(xpath="//div[@id='block_top_menu']/ul/li[1]/a[@title='women']")
	private WebElement tabWomen;
	
	@FindBy(xpath="//div[@id='block_top_menu']/ul/li[2]/a[@title='Dresses']")
	private WebElement tabDresses;
	
	@FindBy(xpath="//div[@id='block_top_menu']/ul/li[3]/a[@title='T-shirts']")
	private WebElement tabTshirts;
	
	public homepageobjects()
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement verifyingwomentab()
	{
		return tabWomen;
		
	}
	
	public WebElement verifyingdressestab()
	{
		return tabDresses;
		
	}
	
	
	
	
	
}
