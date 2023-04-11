package ultimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class UltimateQaMultiBrowserTest {

    static String browser="Firefox";
    static WebDriver driver;

    public static void main(String[] args) {

        //  1. Set up the browser
        if(browser.equalsIgnoreCase("Chrome")){
            driver=new ChromeDriver();
        }else if(browser.equalsIgnoreCase("Firefox")){
            driver=new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver=new EdgeDriver();
        }else{
            System.out.println("Wrong browser name");
        }

        //  2. Open Url
        driver.get("https://courses.ultimateqa.com/users/sign_in");
        // Maximise the browser
        driver.manage().window().maximize();
        // We give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //  3. Print the title of the page
        System.out.println(driver.getTitle());

        //  4. Print the currant Url
        System.out.println(driver.getCurrentUrl());

        //  5. Print the page source
        System.out.println(driver.getPageSource());

        //  6. Enter the email to email field after finding the element
        driver.findElement(By.id("user[email]")).sendKeys("hprime123@gmail.com");

        //  7. Enter the password to password field after finding the element
        driver.findElement(By.name("user[password]")).sendKeys("1234534");

        //  8. Close the browser
        driver.close();
    }

}
