package Screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class example1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\JUNE2022\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// 6. maximize()
		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(6000);

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		String random = RandomString.make(4);
		
		File dest = new File("E:\\Yojana\\new\\JUNE2022\\Screenshots\\w3schools"+random+".png");

		FileHandler.copy(src, dest);
		
		Thread.sleep(2000);

		driver.quit();
	}
}
