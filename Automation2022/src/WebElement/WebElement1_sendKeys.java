package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement1_sendKeys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\JUNE2022\\chromedriver.exe");// key - browsername, value -// chrome driver																									// path
		WebDriver driver = new ChromeDriver();

		// 6. maximize()
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		//1. sendKeys
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("qa@pune.com");
		Thread.sleep(2000);
		
		//2. clear
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).clear();
		Thread.sleep(2000);
		
		//4. getText
		String text = driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).getText();
		System.out.println(text);//Forgotten password?

		//3. click
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
		
		driver.quit();
		
	}
}
