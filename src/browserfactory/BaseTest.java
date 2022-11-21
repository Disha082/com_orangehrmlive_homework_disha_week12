package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;

    public void openBrowser(String baseurl){
        //set the property
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver(); //Created Object

        //1)launch Url
        driver.get(baseurl);

        //2)Maximise window
        driver.manage().window().maximize();

        //3)Giving Implict Time to Driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    public void closeBrowser(){
        driver.quit();
    }
}





