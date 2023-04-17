package testsuits;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    String baseURL = "https://opensource-demo.orangehrmlive.com/";
    @Before
    public void setUp() {
        openBrowser(baseURL);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        //Enter “Admin” username
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        //Enter “admin123 password
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        //Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    @After
    public void tearDown(){
        closeBrowser();
    }
}
