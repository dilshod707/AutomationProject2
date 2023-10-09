import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class DuotechDemo {

    public static void main(String[] args) {

        //Step 1: Navigate to URL
        WebDriver driver = new ChromeDriver();
        driver.get("http://duotify.us-east-2.elasticbeanstalk.com/register.php");


        //Step 2: Verify the the title is "Welcome to Duotify!"
        String title = driver.getTitle();
        System.out.println(title);


//        if(title.equals("Welcome to Duotify!")){
//            System.out.println("Title test passed");
//        } else {
//            System.out.println("Title test failed");
//        }
        Assert.assertEquals(title, "Welcome to Duotify");
        WebElement signUpLink = driver.findElement(By.linkText("Signup here."));
        signUpLink.click();

    }
}
