import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class DuotechDemoAssertions {

    public static void main(String[] args) {

        Assert.assertEquals("hello", "HELLO");


        //Step 1: Navigate to URL
        WebDriver driver = new ChromeDriver();
        driver.get("http://duotify.us-east-2.elasticbeanstalk.com/register.php");


        //Step 2: Verify the the title is "Welcome to Duotify!"
        String title = driver.getTitle();
        System.out.println(title);

    }
}
