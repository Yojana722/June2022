package ActionsClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions3_doubleClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\JUNE2022\\chromedriver.exe");// key - browsername, value -// chrome driver																									// path
		WebDriver driver = new ChromeDriver();

		// 6. maximize()
		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		
		WebElement doubleClick = driver.findElement(By.xpath("//button[contains(text(),'Double-Click ')]"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(doubleClick).perform();
		
		//alert popup
		Alert alert = driver.switchTo().alert();
		
		//1. getText
		System.out.println(alert.getText());//You double clicked me.. Thank You..
		
		//2. accept
		alert.accept();//OK button
		
		//3. dismiss
		//alert.dismiss();//cancel button
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}
}
