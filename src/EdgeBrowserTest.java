import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowserTest {

    public static void main(String[] args) {

        String url="https://www.saucedemo.com/";

        //set Edge driver path
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");

        //set Edge browser
        WebDriver driver = new EdgeDriver();

        //open url
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get title of loaded page
        System.out.println("Page Title is :"+ driver.getTitle());

        //Get current url
        System.out.println("Current Url is :"+ driver.getCurrentUrl());

        //Get web element or page source
        System.out.println("Page source is :"+ driver.getPageSource());

        //Find and enter email in email field

        WebElement emailField = driver.findElement(By.name("user-name"));
        emailField.sendKeys("Admin");

        //find and enter password in password field element
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");

        //Closer browser
        driver.quit();












    }
}
