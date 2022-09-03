package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox5_getAllSelectedOptions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\JUNE2022\\chromedriver.exe");// key - browsername, value -// chrome driver																									// path
		WebDriver driver = new ChromeDriver();

		// 6. maximize()
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(4000);
		
		WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
		
		Select s = new Select(year);
		
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		
		for(WebElement option:allSelectedOptions) {
			System.out.println(option.getText());//2022
		}
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
