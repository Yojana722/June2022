package AutoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\JUNE2022\\chromedriver.exe");// key - browsername, value -// chrome driver																									// path
		WebDriver driver = new ChromeDriver();
		
		String exp = "realme 6";

		// 6. maximize()
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("realme");
		Thread.sleep(2000);
		
		List<WebElement> allOptions = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		
		for(WebElement option:allOptions) {
			String act = option.getText();
			
			if(act.equals(exp)) {
				option.click();
				break;
			}
		}
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
