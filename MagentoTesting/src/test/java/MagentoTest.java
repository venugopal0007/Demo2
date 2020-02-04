

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import com.my.MagentoObject.Home;
//import com.my.MagentoObject.Login;
//import com.my.MagentoObject.Welcome;

public class MagentoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.magento.com");
		Welcome w=new Welcome(driver);
		w.clickOnMyAccount();
		Login l=new Login(driver);
		l.typeEmail("crvenugopalvenugopal@gmail.com");
		l.typePassword("Venu@1234");
		l.clickOnLogin();
		Home h=new Home(driver);
		h.clickOnLogout();
		driver.quit();
	}

}
