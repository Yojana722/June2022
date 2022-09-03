package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\JUNE2022\\chromedriver.exe");//key - browser name, value - chrome driver path
		WebDriver driver = new ChromeDriver();
		
		//6. maximize()
		driver.manage().window().maximize();
		
		//1. get() - used to open url
		//driver.get("https://www.amazn.org/");//WebDriverException
		driver.get("https://www.amazon.in/");		
		
		//4. getTitle()
		String actTitle = driver.getTitle();//Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in
		System.out.println(actTitle);
		
		//5. getCurrentUrl()
		String url = driver.getCurrentUrl();
		System.out.println(url);//https://www.amazon.in/
		
		Thread.sleep(2000);
		
		//7. minimize()
		driver.manage().window().minimize();
		
		Thread.sleep(2000);
		
		//2. close() - used to close single tab of browser
		//driver.close();
		
		//3. quit() - used to close multiple tabs of single browser
		driver.quit();
	}
}
