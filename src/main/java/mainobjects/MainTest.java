package mainobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainTest {
        private WebDriver driver;

        public MainTest (WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver,  this);
        }

        public void clickshoppingCart(){
            shoppingCart.click();
        }

        public void fieldSearch(){
            fieldSearch.sendKeys("Great Expectations");
        }
        public void Search(){
            Search.click();
        }
        public void SignUp(){
            SignUp.click();
        }
        public void email(){
            email.sendKeys("zvyagin.nastya3@gmail.com");
        }
        public void password(){
            password.sendKeys("1111");
        }
        public void login(){
            login.click();
        }
    public void sendKeysEmail(String getRegEmail) {
        email.sendKeys(getRegEmail);
    }

        public void Addtocart(){Addtocart.click();}
        public void ShoppingCart(){ShoppingCart.click();}
        public void Logout(){Logout.click();}


        @FindBy(xpath ="/html/body/center/table/tbody/tr[1]/td/table/tbody/tr/td[3]/a")
        private WebElement shoppingCart;

        @FindBy(xpath ="/html/body/center/table/tbody/tr[2]/td/form/input[1]")
        private WebElement fieldSearch;

        @FindBy(xpath ="/html/body/center/table/tbody/tr[2]/td/form/input[2]")
        private WebElement Search;

        @FindBy(xpath ="/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[4]/a")
        private WebElement SignUp;

        @FindBy(xpath ="/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[1]/p/input")
        private WebElement email;

        @FindBy(xpath ="/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[2]/p/input")
        private WebElement password;

        @FindBy(xpath ="/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[3]/input")
        private WebElement login;

    @FindBy(xpath ="/html/body/center/table/tbody/tr[5]/td/table[2]/tbody/tr/td[2]/p[2]/a/img")
    private WebElement Addtocart;

    @FindBy(xpath ="/html/body/center/table/tbody/tr[1]/td/table/tbody/tr/td[3]/a")
    private WebElement ShoppingCart;

    @FindBy(xpath ="/html/body/center/table/tbody/tr[3]/td/a")
    private WebElement Logout;

    @FindBy(xpath ="/html/body/center/table/tbody/tr[1]/td/table/tbody/tr/td[1]/a/img")
    private WebElement logo;


    }





