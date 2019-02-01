package com.perficient.insite.basepages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//import com.perficient.insite.basepages.InsiteSignInPage;
import com.perficient.util.PageManager;
import com.perficient.util.PageObject;

public class InsiteSignInPage extends PageObject {
	public static String TITLE = "Sign In";
	/*
	 * To pass the locator value into the webElement
	 */
	@FindBy(xpath = "//button[@class='btn primary btn-sign-in']")
	public WebElement signInButton;

	@FindBy(xpath = "//input[@name='userName']")
	public WebElement userName;

	@FindBy(xpath = "//input[@name='password']")
	public WebElement password;

	public InsiteSignInPage(PageManager pm) {
		super(pm);
	}

	public boolean titleContains(String title) {

		return pageManager.getTitle().contains(title);
	}
/*
 * This method pass username,password and click signin button on signin page
 */
	public void signIn(String usr, String pwd) throws InterruptedException {
		pageManager.sendKeys(userName, usr);
		pageManager.sendKeys(password, pwd);
		pageManager.click(signInButton);
		Thread.sleep(9000);

	}
/*
 * This method wait for signin button to be present on signin page 
 */
	public InsiteSignInPage waitPageLoad() throws InterruptedException {
		pageManager.until(signInButton);
		return this;
	}

}
