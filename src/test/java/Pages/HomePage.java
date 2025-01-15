package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    // Locators using @FindBy
    @FindBy(id = "q") // Search input field
    WebElement searchBox;

    @FindBy(xpath = "//*[@id=\"topActionHeader\"]/div/div[2]/div/div[2]/div/form/div/div[2]/a") // Search button
    WebElement searchButton;

    // Constructor to initialize elements
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Method to searchFor
    public void searchFor(String keyword) {
        searchBox.sendKeys(keyword);
        searchButton.click();
    }
}
