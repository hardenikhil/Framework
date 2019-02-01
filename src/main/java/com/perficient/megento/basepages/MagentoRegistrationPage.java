package com.perficient.megento.basepages;

/**
 * @author pooja.manna
 * Registration base page
 */
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.perficient.util.PageManager;
import com.perficient.util.PageObject;

public class MagentoRegistrationPage extends PageObject {
	public static String TITLE = "My Account";
	
	//To pass the locator value into the webElement
	@FindBy(xpath = ".//*[@id='form-validate']/div[2]/button")
	public WebElement registerButton;

	@FindBy(id = "firstname")
	public WebElement firstname;

	@FindBy(id = "lastname")
	public WebElement lastname;

	@FindBy(id = "email_address")
	public WebElement email;

	@FindBy(id = "password")
	public WebElement password;

	@FindBy(id = "confirmation")
	public WebElement conformpassword;

	public MagentoRegistrationPage(PageManager pm) {
		super(pm);
	}

	public boolean titleContains(String title) {

		return pageManager.getTitle().contains(title);
	}

	/**
	 * Method for registration in registration page
	 * @param firstName
	 * @param lastName
	 * @param mail
	 * @param pass
	 * @param conformPass
	 * @throws InterruptedException
	 */
	public void registration(String firstName, String lastName, String mail, String pass, String conformPass)
			throws InterruptedException {
		pageManager.sendKeys(firstname, firstName);
		pageManager.sendKeys(lastname, lastName);
		pageManager.sendKeys(email, mail);
		pageManager.sendKeys(password, pass);
		pageManager.sendKeys(conformpassword, conformPass);
		pageManager.click(registerButton);
		Thread.sleep(3000);

	}

	/**
	 * Method to wait until the Registration page is load
	 * @return
	 * @throws InterruptedException
	 */
	public MagentoRegistrationPage waitPageLoad() throws InterruptedException {
		pageManager.until(registerButton);
		return this;
	}

}
