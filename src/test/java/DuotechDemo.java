import com.github.javafaker.Faker;
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
        //Assert.assertEquals(title, "Welcome to Duotify");

        //Step 3:

        WebElement signUpLink = driver.findElement(By.id("hideLogin"));
        signUpLink.click();

       Faker faker = new Faker();

       String userName = faker.name().username();
       String firstName = faker.name().firstName();
       String lastName = faker.name().lastName();
       String email = faker.internet().emailAddress();
       String password = faker.internet().password();


        driver.findElement(By.name("username")).sendKeys(userName);
        driver.findElement(By.name("firstName")).sendKeys(firstName);
        driver.findElement(By.name("lastName")).sendKeys(lastName);
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("email2")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("password2")).sendKeys(password);

        driver.findElement(By.name("registerButton")).click();

        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "http://duotify.us-east-2.elasticbeanstalk.com/browse.php?");

        String displayedName = driver.findElement(By.name("userLoggedIn")).getText();
        System.out.println(displayedName);
        //System.out.println(displayedFirstName + displayedLastName);


    }
}
