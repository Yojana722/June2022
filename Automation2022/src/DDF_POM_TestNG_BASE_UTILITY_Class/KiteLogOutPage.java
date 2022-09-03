package DDF_POM_TestNG_BASE_UTILITY_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogOutPage {

	@FindBy(xpath="//a[contains(text(),'Logout')]") private WebElement logOutBtn;
	
	public KiteLogOutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickKiteLogOutPageLogOutBtn() {
		logOutBtn.click();
	}
}
