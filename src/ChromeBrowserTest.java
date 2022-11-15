import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {


    public static void main(String[] args) {


        String url = "https://www.saucedemo.com/";
        //Set Chrome drive path
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        //start chrome browser
        WebDriver driver = new ChromeDriver();
//open url
        driver.get(url);

//print the title pf page
        System.out.println("Page Title is: "+ driver.getTitle());
        //Get current url
        System.out.println("Current Url is :"+ driver.getCurrentUrl());
        //Get web elements or page source
        System.out.println("Page source is :"+ driver.getPageSource());

        //Find and enter email in email field element
        WebElement emailField= driver.findElement(By.id("user-name"));
        emailField.sendKeys("ajay123@gmail.com");

//Find and enter password in password field element
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("ajay123");

//close browser
        driver.quit();


    }
}
