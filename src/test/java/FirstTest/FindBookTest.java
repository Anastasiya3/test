package FirstTest;

import mainobjects.MainTest;
import mainobjects.Registration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBookTest {
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

        mainTest.fieldSearch();
        mainTest.Search();
        mainTest.Addtocart();

    }


        @After
        public void tearDown() throws Exception{
            driver.quit();
        }


    }


