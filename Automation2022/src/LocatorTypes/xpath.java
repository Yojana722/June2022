package LocatorTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\JUNE2022\\chromedriver.exe");// key - browsername, value -// chrome driver																									// path
		WebDriver driver = new ChromeDriver();

		// 6. maximize()
		driver.manage().window().maximize();

		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		//xpath by attribute
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("qa@pune.com");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("P@ssw0rd@123");
		
		//xpath by index
		//driver.findElement(By.xpath("(//input[@class='_2hvTZ pexuQ zyHYP'])[2]")).sendKeys("P@ssw0rd@123");
		Thread.sleep(2000);
		
		//xpath by text
		//driver.findElement(By.xpath("//div[text()='Log In']")).click();
		
		//xpath by contains
		driver.findElement(By.xpath("//div[contains(text(),'Log')]")).click();
		Thread.sleep(2000);
		
		driver.quit();
	}
}
