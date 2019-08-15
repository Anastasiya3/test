package FirstTest;

import mainobjects.MainTest;
import mainobjects.Registration;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyFirstTest {

    private WebDriver driver;

    @Before
    public void setUp() throws Exception

    {
        System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void myFirstTest() throws Exception {
        MainTest mainTest = new MainTest(driver);
        Registration registration = new Registration(driver);

        driver.manage().window().maximize();
        driver.get("http://www.sharelane.com/cgi-bin/main.py");

        mainTest.SignUp();
        registration.fieldZip();
        registration.continuee();
        registration.firstname();
        registration.email();
        registration.password();
        registration.confirmpassword();
        registration.register();

    }
    public void signUp () {


        WebElement signUp;
        signUp = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[4]/td/span"));
        Assert.assertEquals("Assert Equals", signUp.getText());

    }


    @After
    public void tearDown() throws Exception{
        driver.quit();
    }

}
