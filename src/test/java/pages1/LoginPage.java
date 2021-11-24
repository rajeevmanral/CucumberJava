package pages1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By txt_username= By.xpath("//input[@id='name']");
    private By txt_password=By.xpath("//input[@id='password']");
    private By btn_login=By.xpath("//button[@id='login']");
    private By btn_logout=By.xpath("//button[@id='logout']");

    public LoginPage (WebDriver driver){
        this.driver=driver;
    }
    public void enterUsername (String username){
        driver.findElement(txt_username).sendKeys(username);
    }
    public void enterPassword (String password){
        driver.findElement(txt_password).sendKeys(password);
    }
    public void clickLogin(){
        driver.findElement(btn_login).click();
    }
    public boolean checkLogOutIsDisplayed(){
        return driver.findElement(btn_logout).isDisplayed();
    }
    public void loginValues (String username, String password) {
        driver.findElement(txt_username).sendKeys(username);
        driver.findElement(txt_password).sendKeys(password);
        driver.findElement(btn_login).click();
    }
}

