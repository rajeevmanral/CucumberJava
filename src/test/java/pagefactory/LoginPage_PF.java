package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
    WebDriver driver;

    @FindBy(xpath="//input[@id='name']")
    WebElement txt_username;

    @FindBy(xpath="//input[@id='password']")
    WebElement txt_password;

    @FindBy(xpath="//button[@id='login']")
    WebElement btn_login;

public LoginPage_PF(WebDriver driver){
    this.driver=driver;
    PageFactory.initElements(driver, this);
}
public void enterUsername (String username) {txt_username.sendKeys(username);}
public void enterPassword (String password) {txt_password.sendKeys(password);}
public void clickLogin() {btn_login.click();}
}
