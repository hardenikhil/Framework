/**
 * 
 */
/**
 * @author niklesh.bahad
 *
 */
package com.perficient.insite.testcase.signIn;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

//import com.perficient.bing.basepages.BingHomePage;
import com.perficient.insite.basepages.InsiteHomePage;
import com.perficient.insite.basepages.InsiteSignInPage;
import com.perficient.util.TestCaseBase;
import com.perficient.util.TestData;

public class TC01InsiteSignInTest extends TestCaseBase {

	@Test(groups = { "firefox", "IEWin32", "ChromeWin32", "browserPercentageSpecified" })
	public void testSearchWeb() throws Exception {
		// Load the username and password from
		// 'testdata_TC01InsiteSignInTest.properties' file using 'TestData.java'
		// class
		String usr = TestData.get("userName");
		String pwd = TestData.get("password");
		InsiteHomePage insiteHomePage = new InsiteHomePage(pageManager);
		InsiteSignInPage insiteSignInPage = new InsiteSignInPage(pageManager);
		insiteHomePage.open();
		customAssertion.assertTrue(pageManager.getTitle().contains(InsiteHomePage.TITLE));
		insiteHomePage.clickOnElement();
		insiteSignInPage.waitPageLoad();
		customAssertion.assertTrue(pageManager.getTitle().contains(InsiteSignInPage.TITLE));
		insiteSignInPage.signIn(usr, pwd);
	}
}
