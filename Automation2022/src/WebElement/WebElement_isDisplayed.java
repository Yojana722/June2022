package WebElement;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_isDisplayed {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\JUNE2022\\chromedriver.exe");// key - browsername, value -// chrome driver																									// path
		WebDriver driver = new ChromeDriver();

		// 6. maximize()
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		//boolean result = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
		//System.out.println(result);//true
		
		//boolean result = driver.findElement(By.xpath("//img[@class='aaaaafb_logo _8ilh img']")).isDisplayed();
		//System.out.println(result);//NoSuchElementException
		boolean result;
		
		try {
			WebElement logo = driver.findElement(By.xpath("//img[@class='aaaaafb_logo _8ilh img']"));
			result=logo.isDisplayed();
			
		}catch(Exception e) {
			result = false;
		}

		System.out.println(result);//false
				
		driver.quit();
		
	}
}
