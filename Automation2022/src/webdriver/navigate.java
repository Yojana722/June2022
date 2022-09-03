package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\JUNE2022\\chromedriver.exe");// key - browsername, value -// chrome driver																									// path
		WebDriver driver = new ChromeDriver();

		// 6. maximize()
		driver.manage().window().maximize();

		// 8. navigate()
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);

		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);

		driver.navigate().back();// amazon

		driver.navigate().forward();// facebook

		driver.navigate().back();// amazon

		driver.navigate().refresh();

		Thread.sleep(2000);

		//8. setSize()
		Dimension d = new Dimension(200, 400);// width-200, height-400
		driver.manage().window().setSize(d);
		
		//9. setPosition()
		Point p = new Point(400, 200);//x-400, y-200
		driver.manage().window().setPosition(p);
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
