package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

String baseUrl = "https://opensource-demo.orangehrmlive.com/";


    @Before
    public void setup(){
        openBrowser(baseUrl);
    }
//1. userShouldLoginSuccessfullyWithValidCredentials




@Test

public void userShouldLoginSuccessfullyWithValidCredentials(){
    //* Enter “Admin” username


    driver.findElement(By.name("username")).sendKeys("Admin");


//* Enter “admin123“ password

    driver.findElement(By.name("password")).sendKeys("admin123");


    //* Click on ‘LOGIN’ button
    WebElement loginButton= driver.findElement(By.xpath("//button[@type='submit']"));
    loginButton.click();

//* Verify the ‘Dashboard’ text is display

    String expectedMessage ="Dashboard";
    WebElement actualTextElement = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']"));
    String actualMessage = actualTextElement.getText();
    Assert.assertEquals("Error Message",expectedMessage,actualMessage);


}




    @After
    public void tearDown(){
         closeBrowser();
    }


}
