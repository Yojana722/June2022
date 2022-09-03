package POM_With_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitHubTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\JUNE2022\\chromedriver.exe");// key - browsername, value -// chrome driver																									// path
		WebDriver driver = new ChromeDriver();

		// 6. maximize()
		driver.manage().window().maximize();

		driver.get("https://github.com/");
		Thread.sleep(2000);
		
		GitHub_SignIn signIn = new GitHub_SignIn(driver);
		signIn.clickGitHubSignInButton();
		
		Thread.sleep(2000);
		
		GitHub_Login login = new GitHub_Login(driver);
		login.setGitHubLoginUsername();
		login.setGitHubLoginPassword();
		login.clickGitHubLoginButton();
		
		GitHub_HomePage home = new GitHub_HomePage(driver);
		home.clickGitHubHomePageBtn();
		
		Thread.sleep(2000);
		
		home.clickGitHubHomePageSignOutBtn();
		
		Thread.sleep(2000);
		
		driver.close();
	}
}
