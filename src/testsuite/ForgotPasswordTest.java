package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {
    String baseurl = " https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setup() {
        openBrowser(baseurl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        //click on the ‘Forgot your password’ link
        driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();

        //Verify reset password text
        String expectedMessage = "Reset Password";
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//h6[text()='Reset Password']"));

        String actualMessage = actualTextMessageElement.getText();
        Assert.assertEquals("Not on Reset Password page", expectedMessage, actualMessage);
    }

}
