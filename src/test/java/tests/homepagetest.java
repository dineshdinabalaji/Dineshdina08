package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import objects.homepageobjects;

public class homepagetest {

	homepageobjects HPO;
	private WebElement verifyingwomentab;
	
	public homepagetest()
	{
		HPO=new homepageobjects();
	}
	
	@Test
	public void verifywomentab()
	{
		setVerifyingwomentab(HPO.verifyingwomentab());
		Assert.assertTrue(true, "the page contains dresses tab");
	}

	public WebElement getVerifyingwomentab() {
		return verifyingwomentab;
	}

	public void setVerifyingwomentab(WebElement verifyingwomentab) {
		this.verifyingwomentab = verifyingwomentab;
	}
	
}
