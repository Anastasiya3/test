package FirstTest;

import mainobjects.MainTest;
import mainobjects.ShoppingCart;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmptySearchTest {

    WebDriver driver;


    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
    }

    @Test
    public void firstTest() throws Exception {
        MainTest mainTest = new MainTest(driver);

        driver.get("http://www.sharelane.com/cgi-bin/main.py");

        mainTest.Search();
    }

    public void search () {


        WebElement search;
        search = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[4]/td/span"));
        Assert.assertEquals("Assert Equals", search.getText());


    }
    @After
    public void tearDown() throws Exception{
        driver.quit();
    }



}