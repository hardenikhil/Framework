package com.perficient.megento.basepages;
/**
 * @author pooja.manna
 * Home page base 
 */

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.perficient.util.PageManager;
import com.perficient.util.PageObject;
import com.perficient.util.SystemUtil;

/**
 * Home Page
 */
public class MagentoHomePage extends PageObject {
	public static String TITLE = "Madison Island";

	@FindBy(xpath = ".//*[@id='header']/div/div[2]/a[3]")
	public WebElement clickOnAccount;

	@FindBy(xpath = ".//*[@id='header-account']/div/ul/li[6]/a")
	public WebElement clickLogin;

	@FindBy(xpath = ".//*[@id='header-account']/div/ul/li[5]/a")
	public WebElement clickOnRegister;

	public MagentoHomePage(PageManager pm) {
		super(pm);
	}

	/**
	 * Open method to launch the browser
	 */
	public void open() {
		//read the url from property file
		Properties PROPERTIES_RESOURCES = SystemUtil.loadPropertiesResources("//testdata_Megento.properties");
		String URL = PROPERTIES_RESOURCES.getProperty("url");
		pageManager.navigate(URL);
	}

	/**
	 * Method to click on the Account link
	 * @throws InterruptedException
	 */
	public void clickOnAccount() throws InterruptedException {

		Thread.sleep(9000);
		pageManager.click(clickOnAccount);

	}

	/**
	 * This method click on signIn button
	 */
	public void clickOnElement() {
		pageManager.click(clickLogin);
	}
	
	/**
	 * Method to Click on REgistration Button
	 */
	public void clickOnRegistration() {
		pageManager.click(clickOnRegister);

	}

}
