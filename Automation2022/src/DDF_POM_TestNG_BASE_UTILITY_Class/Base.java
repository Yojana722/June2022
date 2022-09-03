package DDF_POM_TestNG_BASE_UTILITY_Class;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {

	static WebDriver driver;
	public static void browserOpen() throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\JUNE2022\\workspace\\Automation2022\\browsers\\chromedriver.exe");// key - browsername, value -// chrome driver																									// path
		
		ChromeOptions option = new ChromeOptions();//notifications
		option.addArguments("--disable-notifications");
		
		driver = new ChromeDriver(option);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get(Utility.getPropertyFileData("url"));
	}
}
