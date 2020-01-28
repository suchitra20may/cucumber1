package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {
	WebDriver c;

	public PageObjects(WebDriver c) {
		PageFactory.initElements(c, this);
	}

	@FindBy(xpath = "//a[@href='login.htm']")
	public WebElement signin;

	@FindBy(name = "userName")
	public WebElement username;

	@FindBy(name = "password")
	public WebElement password;

	@FindBy(name = "Login")
	public WebElement logins;

}
