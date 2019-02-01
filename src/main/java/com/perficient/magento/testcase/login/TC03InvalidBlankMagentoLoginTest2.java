package com.perficient.magento.testcase.login;
/**
 * @author pooja.manna
 * Testcase for blank credential for login
 */

import org.testng.annotations.Test;

import com.perficient.megento.basepages.MagentoHomePage;
import com.perficient.megento.basepages.MagentoUserLoginPage;
import com.perficient.util.TestCaseBase;
import com.perficient.util.TestData;


public class TC03InvalidBlankMagentoLoginTest2 extends TestCaseBase {

	@Test(groups = { "firefox", "IEWin32", "ChromeWin32", "browserPercentageSpecified" })
	public void testSearch() throws Exception {
		// Load the username and password from
		// 'testdata_TC03InvalidBlankMagentoLogin.properties' file using 'TestData.java'
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
		customAssertion.assertEquals(MagentoUserLoginPage.TITLE,pageManager.getTitle(),"Invald User Name" );
		
	}
}
