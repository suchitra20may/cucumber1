package stepDefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginTest {
	public static WebDriver driver;

	PageObjects po;

	@Given("^Navigate to Home page$")
	public void Navigate() {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		po = new PageObjects(driver);
	}

	@When("^user enters username and password$")
	public void enters() {
		po.signin.click();
		po.username.sendKeys("lalitha");
		po.password.sendKeys("Password123");
		po.logins.click();

	}

	@Then("^user logged in successfully$")
	public void loggedin() {
		System.out.println("User login successfully");
		
	}

	@When("^Larry searches below products in the search box:$")
	public void search(DataTable dt) {
		// System.out.println("U");
		List<String> product = dt.asList(String.class);
		for (String s : product) {
			driver.findElement(By.name("products")).sendKeys(s);
			driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
		}
	}

	@Then("^product should be added in the cart if available$")
	public void product_should_be_added_in_the_cart_if_available() {
		System.out.print("fkdfdkjfefe");
		driver.findElement(By.linkText("SignOut")).click();
	}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void entersunamepwd(String uname, String pwd) {
		po.signin.click();
		po.username.sendKeys(uname);
		po.password.sendKeys(pwd);
		po.logins.click();
		
	}
}