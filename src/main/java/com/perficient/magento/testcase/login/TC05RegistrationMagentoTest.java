package com.perficient.magento.testcase.login;
/**
 * @author pooja.manna
 * Testcase for Registration
 */

import org.testng.annotations.Test;

import com.perficient.megento.basepages.MagentoHomePage;
import com.perficient.megento.basepages.MagentoRegistrationPage;
import com.perficient.util.TestCaseBase;
import com.perficient.util.TestData;


public class TC05RegistrationMagentoTest extends TestCaseBase {

	@Test(groups = { "firefox", "IEWin32", "ChromeWin32", "browserPercentageSpecified" })
	public void testSearch() throws Exception {
		
		// 'testdata_TC05RegistrationMagentoTest.properties' file using 'TestData.java'class
		MagentoHomePage magentoHomePage = new MagentoHomePage(pageManager);
		MagentoRegistrationPage magentoReg = new MagentoRegistrationPage(pageManager);
		magentoHomePage.open();
		customAssertion.assertTrue(pageManager.getTitle().contains(MagentoHomePage.TITLE));
		magentoHomePage.clickOnAccount();
		magentoHomePage.clickOnRegistration();
		String firstname = TestData.get("firstname");
		String lastname = TestData.get("lastname");
		String email = TestData.get("email");
		String pass = TestData.get("password");
		String confPass = TestData.get("conformpass");
		magentoReg.registration(firstname,lastname,email,pass,confPass);
		customAssertion.assertEquals(MagentoRegistrationPage.TITLE,pageManager.getTitle());
		
	}
}
