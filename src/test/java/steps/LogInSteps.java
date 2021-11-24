//package steps;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.Assert;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import pages1.LoginPage;
//
//public class LogInSteps {
//    WebDriver driver= null;
//    LoginPage login;
//
//    @Given("browser is open")
//    public void browserIsOpen() {
//        WebDriverManager.chromedriver().setup();
//        driver=new ChromeDriver();
//        driver.manage().window().maximize();
//    }
//
//    @And("user is on login page")
//    public void userIsOnLoginPage() {
//        driver.navigate().to("https://example.testproject.io/web/");
//    }
//
//
//    @When("user enters {string} and {string}")
//    public void userEntersAnd(String username, String password) {
//        login=new LoginPage(driver);
//        login.enterUsername(username);
//        login.enterPassword(password);
//    }
//
//    @And("user clicks on login")
//    public void userClicksOnLogin() {
//        login.clickLogin();
//    }
//
//    @Then("user is navigated to the home page")
//    public void userIsNavigatedToTheHomePage() {
//        Assert.assertTrue(login.checkLogOutIsDisplayed());
//        driver.close();
//    }
//}
