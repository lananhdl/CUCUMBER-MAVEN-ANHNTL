package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import commons.AbstractPage;
import interfaces.NewCustomerPageUI;

public class NewCustomerPagePO extends AbstractPage {
	WebDriver driver;

	public NewCustomerPagePO(WebDriver driver_) {
		this.driver = driver_;
	}

	public void inputCustomerName(String customerName) {
		waitForControlVisible(driver, NewCustomerPageUI.CUSTOMER_NAME_TXT);
		sendkeyToElement(driver, NewCustomerPageUI.CUSTOMER_NAME_TXT, customerName);
	}

	public void selectGender() {
		waitForControlVisible(driver, NewCustomerPageUI.GENDER_TXT);
		checkTheCheckbox(driver, NewCustomerPageUI.GENDER_TXT);
	}

	public void inputDob(String dob) {
		/*waitForControlVisible(driver, NewCustomerPageUI.DATE_OF_BIRTH_TXT);
		sendkeyToElement(driver, NewCustomerPageUI.DATE_OF_BIRTH_TXT, dob);*/
		waitForControlVisible(driver, NewCustomerPageUI.DATE_OF_BIRTH_TXT);
		WebElement datatimepicker =driver.findElement(By.xpath(NewCustomerPageUI.DATE_OF_BIRTH_TXT));
		removeAttributeInDOM(driver,datatimepicker ,"type");
		sendkeyToElement(driver, NewCustomerPageUI.DATE_OF_BIRTH_TXT, dob);
	}

	public void inputAddress(String address) {
		waitForControlVisible(driver, NewCustomerPageUI.ADD_TXT);
		sendkeyToElement(driver, NewCustomerPageUI.ADD_TXT, address);
	}

	public void inputCity(String city) {
		waitForControlVisible(driver, NewCustomerPageUI.CTIY_TXT);
		sendkeyToElement(driver, NewCustomerPageUI.CTIY_TXT, city);
	}

	public void inputState(String state) {
		waitForControlVisible(driver, NewCustomerPageUI.STATE_TXT);
		sendkeyToElement(driver, NewCustomerPageUI.STATE_TXT, state);
	}

	public void inputPIN(String pin) {
		waitForControlVisible(driver, NewCustomerPageUI.PIN_TXT);
		sendkeyToElement(driver, NewCustomerPageUI.PIN_TXT, pin);
	}

	public void inputMobile(String mobile) {
		waitForControlVisible(driver, NewCustomerPageUI.MOBILE_TXT);
		sendkeyToElement(driver, NewCustomerPageUI.MOBILE_TXT, mobile);
	}

	public void inputEmail(String email) {
		waitForControlVisible(driver, NewCustomerPageUI.EMAIL_TXT);
		sendkeyToElement(driver, NewCustomerPageUI.EMAIL_TXT, email);
	}

	public void inputPassword(String pass) {
		waitForControlVisible(driver, NewCustomerPageUI.PASSWORD_TXT);
		sendkeyToElement(driver, NewCustomerPageUI.PASSWORD_TXT, pass);
	}

	public void clickToSubmit() {
		waitForControlVisible(driver, NewCustomerPageUI.MOBILE_TXT);
		clickToElement(driver, NewCustomerPageUI.SUBMIT_BTN);
	}

	public String getCustomerID() {
		waitForControlVisible(driver, NewCustomerPageUI.CUSTOMER_ID_TXT);
		return getTextElement(driver, NewCustomerPageUI.CUSTOMER_ID_TXT);
	}
	
	public String getCustomerName() {
		waitForControlVisible(driver, NewCustomerPageUI.NAME_TEXT);
		return getTextElement(driver, NewCustomerPageUI.NAME_TEXT);
	}
	
	public String getCustomerGender() {
		waitForControlVisible(driver, NewCustomerPageUI.GENDER_TEXT);
		return getTextElement(driver, NewCustomerPageUI.GENDER_TEXT);
	}
	
	public String getCustomerAddress() {
		waitForControlVisible(driver, NewCustomerPageUI.ADDRESS_TEXT);
		return getTextElement(driver, NewCustomerPageUI.ADDRESS_TEXT);
	}
	
	public String getCustomerCity() {
		waitForControlVisible(driver, NewCustomerPageUI.CITY_TEXT);
		return getTextElement(driver, NewCustomerPageUI.CITY_TEXT);
	}
	
	public String getCustomerState() {
		waitForControlVisible(driver, NewCustomerPageUI.STATE_TEXT);
		return getTextElement(driver, NewCustomerPageUI.STATE_TEXT);
	}
	
	public String getCustomerPin() {
		waitForControlVisible(driver, NewCustomerPageUI.PIN_TEXT);
		return getTextElement(driver, NewCustomerPageUI.PIN_TEXT);
	}
	
	public String getCustomerMobile() {
		waitForControlVisible(driver, NewCustomerPageUI.MOBILE_TEXT);
		return getTextElement(driver, NewCustomerPageUI.MOBILE_TEXT);
	}
	
	public String getCustomerEmail() {
		waitForControlVisible(driver, NewCustomerPageUI.EMAIL_TEXT);
		return getTextElement(driver, NewCustomerPageUI.EMAIL_TEXT);
	}

}
