package mainobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration {

    private WebDriver driver;

    public Registration(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,  this);
    }

    public void fieldZip(){
        fieldZip.sendKeys("55555");
    }

    public void continuee(){
        continuee.click();
    }

    public void firstname(){
        firstname.sendKeys("Nastya");
    }
    public void password(){
        password.sendKeys("1111");
    }

    public void email(){
        continuee.sendKeys("zvyagin.nastya3@gmail.com");
    }


    public void confirmpassword(){
        continuee.sendKeys("1111");
    }

    public void register(){
        continuee.click();
    }




    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input")
    private WebElement fieldZip;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input")
    private WebElement continuee;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/input")
    private WebElement firstname;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[4]/td[2]/input")
    private WebElement password;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input")
    private WebElement email;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[5]/td[2]/input")
    private WebElement confirmpassword;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[6]/td[2]/input")
    private WebElement register;


}

