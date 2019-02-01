package com.perficient.insite.basepages;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.perficient.util.PageManager;
import com.perficient.util.PageObject;
import com.perficient.util.SystemUtil;

/**
 * Insite Home Page
 */
public class InsiteHomePage extends PageObject {
	public static String TITLE = "Home";

	@FindBy(xpath = "//a[@href='/MyAccount']")
	public WebElement waitForMyAccount;

	@FindBy(xpath = "//span[contains(.,'Sign In')]")
	public WebElement clickSignIn;

	public InsiteHomePage(PageManager pm) {
		super(pm);
	}

	/*
	 * open Insite home page
	 */
	public void open() {
		/*
		 * read the url from property file
		 */
		Properties PROPERTIES_RESOURCES = SystemUtil.loadPropertiesResources("/testdata_insite.properties");
		String URL = PROPERTIES_RESOURCES.getProperty("insite.url");
		pageManager.navigate(URL);
	}

	/*
	 * This method wait for 'MyAccount' tab to be present on Insite home page
	 */
	public void waitPageLoad() throws InterruptedException {

		if (pageManager.getBrowserFlag().equals("chrome")) {
			Thread.sleep(9000);
		}
		pageManager.until(waitForMyAccount);

	}

	/*
	 * This method click on signIn button
	 */
	public void clickOnElement() {
		pageManager.click(clickSignIn);
	}

}
