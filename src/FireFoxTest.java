import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxTest {

    public static void main(String[] args) {

        String url = "https://www.saucedemo.com/";

        //set edge driver path
        System.setProperty("Webdriver.gecko.driver", "drivers/geckodriver.exe");

        //Start FireFox Browser
        WebDriver driver = new FirefoxDriver();

        //open url
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get title of loaded page
        System.out.println("page title is : +driver.getTitle");

        //Get current Url

        System.out.println("Current url is :"+ driver.getCurrentUrl());

        //Get web elements or page source
        System.out.println("page Source is : "+ driver .getPageSource());

        //Find and enter email in eamil field element

        WebElement emailField = driver.findElement(By.name("user-name"));
        emailField.sendKeys("admin");

        //Find and enter Password in Password field element
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");


driver.quit();


    }
}
