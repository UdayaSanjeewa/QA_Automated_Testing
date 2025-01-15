package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ProductPage {
    WebDriver driver;

    // Locators
    @FindBy(xpath = "//*[@id=\"module_add_to_cart\"]/div/button[2]")  // Add to Cart button
    WebElement addToCartButton;


    @FindBy(xpath = "//*[@id=\"module_add_to_cart\"]/div/button[1]") // Proceed to Buy It Now
    WebElement buyItNow;

    @FindBy(id = "wrong element") // Proceed to Buy It Now
    WebElement wrongElement;

    @FindBy(xpath = "//*[@id=\"module_seller_info\"]/div/div[1]/div[1]/div[2]/a") // Proceed to Buy It Now
    WebElement SellerInfo;

    // Constructor to initialize elements
    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Methods Used in Products Page
    public void buyItNow() {
        buyItNow.click();
    }

    public void setAddToCartButton() {addToCartButton.click(); }

    public void wrongElementTest() {
        wrongElement.click();
    }

    public void SellerInfo() {SellerInfo.click();
    }
}
