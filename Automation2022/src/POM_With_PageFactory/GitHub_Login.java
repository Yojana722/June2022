package POM_With_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHub_Login {

	@FindBy(xpath="//input[@name='login']") private WebElement UN;
	@FindBy(xpath="//input[@id='password']") private WebElement PWD;
	@FindBy(xpath="//input[@name='commit']") private WebElement LoginBtn;
	
	public GitHub_Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setGitHubLoginUsername() {
		UN.sendKeys("yojanagaikwad101@gmail.com");
	}
	
	public void setGitHubLoginPassword() {
		PWD.sendKeys("Anubhav@2004");
	}
	
	public void clickGitHubLoginButton() {
		LoginBtn.click();
	}
}
