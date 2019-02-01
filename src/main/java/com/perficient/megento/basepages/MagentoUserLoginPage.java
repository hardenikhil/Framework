package com.perficient.megento.basepages;
/**
 * @author pooja.manna
 * UserLogin base page
 */

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//import com.perficient.insite.basepages.InsiteSignInPage;
import com.perficient.util.PageManager;
import com.perficient.util.PageObject;

public class MagentoUserLoginPage extends PageObject {
	public static String TITLE = "My Account";
	
	//To pass the locator value into the webElement
	@FindBy(id = "send2")
	public WebElement LogInButton;

	@FindBy(id = "email")
	public WebElement userName;

	@FindBy(id = "pass")
	public WebElement password;

	public MagentoUserLoginPage(PageManager pm) {
		super(pm);
	}

	/**
	 * Method to get the title and check weather the title matches or not
	 * @param title
	 * @return
	 */
	public boolean titleContains(String title) {

		return pageManager.getTitle().contains(title);
	}

	/**
	 * Method for login with username and password and clicking on login button 
	 * @param usr
	 * @param pwd
	 * @throws InterruptedException
	 */
	public void LoginIn(String usr, String pwd) throws InterruptedException {
		pageManager.sendKeys(userName, usr);
		pageManager.sendKeys(password, pwd);
		pageManager.click(LogInButton);
		Thread.sleep(9000);

	}

	/**
	 * Method to wait until the login page is loaded
	 * @return
	 * @throws InterruptedException
	 */
	public MagentoUserLoginPage waitPageLoad() throws InterruptedException {
		pageManager.until(LogInButton);
		return this;
	}

}
