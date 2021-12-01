package seleniumFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
	
	public static void main(String[] args) {
		
		
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path: "+ projectPath);
		
		//webdriver.gecko.driver-->Keyvalue of the path | Open the Firefox
		System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://mvnrepository.com/artifact/junit/junit/4.13.2");
		driver.quit();
	
	}

}
