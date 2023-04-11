package ultimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**Project-5 - Project Name: com-utimateqa
 * BaseUrl = https://courses.ultimateqa.com/users/sign_in
 */

public class UltimateQaBrowserTest {
    public static void main(String[] args) {

        //  1. Set up Chrome Browser
        WebDriver driver=new ChromeDriver();

        //  2. Open Url
        driver.get("https://courses.ultimateqa.com/users/sign_in");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //  3. Print the title of the page
        System.out.println(driver.getTitle());

        //  4. Print the currant Url
        System.out.println(driver.getCurrentUrl());

        //  5. Print the page source
        System.out.println(driver.getPageSource());

        //  6. Enter email to email field after finding the elements
        driver.findElement(By.id("user[email]")).sendKeys("hprime123@gmail.com");

        //  7. Enter password to password field after finding the elements
        driver.findElement(By.name("user[password]")).sendKeys("1234523");

        //  8. Close the Browser
        driver.close();
    }
}
