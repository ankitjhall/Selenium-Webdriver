import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create Driver object for Chrome Browser
		
		// We will strictly implement methods of web driver
		
		/* Class name = X
				
				X driver = new X(); */
		
		// invoke .exe file first
		System.setProperty("webdriver.chrome.driver", "//Users//ankitjhall//Downloads//chromedriver");
		
		// JAVA accept double slash for paths
		
		WebDriver driver = new ChromeDriver();
		
		// these two steps are responsible for invoking the browser
		
		driver.get("http://google.com");
		
		System.out.println(driver.getTitle());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
