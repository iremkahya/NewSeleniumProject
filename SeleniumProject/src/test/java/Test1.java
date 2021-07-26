import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Test1 {
    @Test

    public void Opening(){
        System.setProperty("webdriver.chrome.driver","C:/WebDriver/bin/chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");

        driver.close();

    }

}
