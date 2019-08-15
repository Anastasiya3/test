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

public class ShoppingCartTest {

    WebDriver driver;

    String getRegEmail;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
    }

    @Test
    public void firstTest() throws Exception {
        MainTest mainTest = new MainTest(driver);
        ShoppingCart shoppingCart = new ShoppingCart(driver);

        driver.get("http://www.sharelane.com/cgi-bin/register.py?page=2&zip_code=55555&first_name=a&last_name=&email=a%40mail.ru&password1=12345&password2=12345");
        WebElement regmessage =  driver.findElement(By.xpath("/html/body/center/table/tbody/tr[4]/td/span"));
        Assert.assertEquals("Account is created!", regmessage.getText());

        WebElement regEmail = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b"));
        getRegEmail = regEmail.getText();




        shoppingCart.here();
        mainTest.sendKeysEmail(getRegEmail);
        mainTest.password();
        mainTest.login();

        driver.get("http://www.sharelane.com/cgi-bin/main.py");
        shoppingCart.clickBook();
        shoppingCart.clickAddToCart();
        mainTest.ShoppingCart();

    }

    @After
    public void tearDown() throws Exception{
        driver.quit();
    }

}
