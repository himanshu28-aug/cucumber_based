package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest{

    WebDriver driver;

    @Given("I open the browser")
    public void i_open_the_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @When("I navigate to the login page")
    public void i_navigate_to_the_login_page() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("I enter username {string} and password {string}")
    public void i_enter_username_and_password(String username, String password) {
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @When("I click on login button")
    public void i_click_on_login_button() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("I should see the homepage")
    public void i_should_see_the_homepage() {
        boolean result = driver.findElement(By.className("app_logo")).isDisplayed();
        if (result) {
            System.out.println("✅ Login Successful - Homepage visible");
        } else {
            System.out.println("❌ Login Failed");
        }
        driver.quit();
    }
}