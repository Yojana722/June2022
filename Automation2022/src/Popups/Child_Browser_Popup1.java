package Popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser_Popup1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\JUNE2022\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// 6. maximize()
		driver.manage().window().maximize();

		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		
		String idOfMainPage = driver.getWindowHandle();
		System.out.println(idOfMainPage);//CDwindow-C2EE4C759AA428DA60C8F0D1F83EB203
		
		Set<String> ids = driver.getWindowHandles();
		
		ArrayList<String> al = new ArrayList<String>(ids);
		
		System.out.println(al.get(0)); //id of main page - CDwindow-C2EE4C759AA428DA60C8F0D1F83EB203
		System.out.println(al.get(1));//id of child page - CDwindow-B247410DC76275AF522DAB86662641DF
				
		Thread.sleep(2000);
		
		driver.quit();
		

	}
}
