package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\JUNE2022\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// 6. maximize()
		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("7");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(2000);
		
		Alert alt = driver.switchTo().alert();
		
		System.out.println(alt.getText());//Do you really want to delete this Customer?
		
		alt.accept();//OK
		
		//alt.dismiss();//Cancel
		
		Alert alt1 = driver.switchTo().alert();
		System.out.println(alt1.getText());//Customer Successfully Delete!
		
		alt1.accept();
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
