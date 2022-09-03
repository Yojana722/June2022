package LocatorTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\JUNE2022\\chromedriver.exe");// key - browsername, value -// chrome driver																									// path
		WebDriver driver = new ChromeDriver();

		// 6. maximize()
		driver.manage().window().maximize();

		/*driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[placeholder='Email address or phone number']")).sendKeys("qa@pune.com");
		Thread.sleep(2000);*/
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[aria-label='Phone number, username, or email']")).sendKeys("qa@pune.com");
		
		
		driver.quit();
	}
}
