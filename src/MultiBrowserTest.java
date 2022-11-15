import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {

    public static void main(String[] args) {

        String browser = "chrome";
        String baseUrl = "https://www.saucedemo.com/";
        WebDriver driver;

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gheko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();

            if (browser.equalsIgnoreCase("edge")) {
                System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
                driver = new EdgeDriver();
            }
// 1.launch Url
//2. open Url
            driver.get(baseUrl);

//3.print the title of the page
            System.out.println("Title of the age is " + driver.getTitle());

// 4. print the current url
            System.out.println("Current Url is" + driver.getCurrentUrl());
            // 5. print page source
            System.out.println("Page source is " + driver.getPageSource());
//6.Find and enter in email
            WebElement email = driver.findElement(By.id("Email"));
            email.sendKeys("ajay123@gmail.com");
//Find and enter in password field
            WebElement password = driver.findElement(By.name("Password"));
            password.sendKeys("ajay123");


        }
    }


}
