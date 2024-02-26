import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAutomationClass {

    public static void main(String[] args) {
        // Set up ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        
        // Initialize ChromeDriver
        ChromeDriver driver = new ChromeDriver();
        
        // Open Sauce Demo website
        driver.get("https://www.saucedemo.com");
        
        // Find the username field and enter username
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        
        // Find the password field and enter password
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        
        // Find and click the login button
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/form/input[3]")).click();
        
        // Close the browser window
        driver.quit();
    }
}
