package POM_With_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHub_SignIn {

	@FindBy(xpath="//a[contains(text(),'Sign in')]") private WebElement SignIn; //variable declaration
	
	public GitHub_SignIn(WebDriver driver) {//initialization
		PageFactory.initElements(driver, this);//driver.findElements(By.xpath("//a[contains(text(),'Sign in')]"));
	}
	
	public void clickGitHubSignInButton() {//Usage
		SignIn.click();
	}
}
