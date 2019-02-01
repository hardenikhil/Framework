package com.perficient.magento.testcase.login;
/**
 * @author pooja.manna
 * Testcase for valid username & Password for login
 */

import org.testng.annotations.Test;

import com.perficient.megento.basepages.MagentoHomePage;
import com.perficient.megento.basepages.MagentoUserLoginPage;
import com.perficient.util.TestCaseBase;
import com.perficient.util.TestData;


public class TC01MagentoLoginTest extends TestCaseBase {

	@Test(groups = { "firefox", "IEWin32", "ChromeWin32", "browserPercentageSpecified" })
	public void test01ValidCredential() throws Exception {
		// Load the username and password from
		// 'testdata_TC01MagaentoLoginTest.properties' file using 'TestData.java'
		// class
		
		MagentoHomePage magentoHomePage = new MagentoHomePage(pageManager);
		MagentoUserLoginPage magentoUserLogin = new MagentoUserLoginPage(pageManager);
		magentoHomePage.open();
		customAssertion.assertTrue(pageManager.getTitle().contains(MagentoHomePage.TITLE));
		magentoHomePage.clickOnAccount();
		magentoHomePage.clickOnElement();
		String usr = TestData.get("username");
		String pwd = TestData.get("password");

		magentoUserLogin.LoginIn(usr, pwd);
		customAssertion.assertTrue(pageManager.getTitle().contains(MagentoUserLoginPage.TITLE));
	}
}
