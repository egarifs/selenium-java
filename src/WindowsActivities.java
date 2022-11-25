import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsActivities {
    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver", "/Users/mac/chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com/");
        driver.navigate().to("https://linkedin.com/in/egarifs");
        driver.navigate().back();
        driver.navigate().forward();
        
    }
}
