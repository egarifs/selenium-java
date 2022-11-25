import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {
    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver", "/Users/mac/chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).click();
        
        //
        driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).click();
    }
}
