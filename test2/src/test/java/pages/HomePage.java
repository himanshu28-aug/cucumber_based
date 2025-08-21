package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    // Locator for Dashboard heading
    By dashboardText = By.xpath("//h1[text()='Dashboard']");

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to verify Dashboard
    public boolean isDashboardDisplayed() {
        return driver.findElement(dashboardText).isDisplayed();
    }
}