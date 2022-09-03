package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox1_select {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\JUNE2022\\chromedriver.exe");// key - browsername, value -// chrome driver																									// path
		WebDriver driver = new ChromeDriver();

		// 6. maximize()
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(4000);
		
		//1. step 1:
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		//2. step 2:
		Select s = new Select(month);
		
		//3. step 3:
		//s.selectByIndex(0);
		//s.selectByValue("9");
		s.selectByVisibleText("Dec");
		
		Thread.sleep(2000);
		driver.quit();
		
		
	}
}
