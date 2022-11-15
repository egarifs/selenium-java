import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selintroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		System.setProperty("Webdriver.chrome.driver", "/Users/mac/chromedriver/chromedriver");
		
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://shopee.co.id");
		
		
		//firefox launch
//		System.setProperty("webdriver.gecko.driver", "/Users/mac/geckodriver/geckodriver");
//		WebDriver driver = new FirefoxDriver();
		
		//firefox launch
		System.setProperty("webdriver.edge.driver", "/Users/mac/edgedriver/msedgedriver");
		WebDriver driver2 = new EdgeDriver(); 
		
		driver2.get("https://rahulshettyacademy.com");
		System.out.println(driver2.getTitle ());
		System.out.println(driver2.getCurrentUrl());
		driver2.close();
		driver2.quit();
//		
				 
		 
		
		
		
 
	}

}
