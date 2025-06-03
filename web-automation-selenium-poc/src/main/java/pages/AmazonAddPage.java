package pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;

public class AmazonAddPage {
	WebDriver driver;
    CommonUtils utils;

    public AmazonAddPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        utils = new CommonUtils(driver);
    }

    // Web Elements
    @FindBy(xpath = "//select[@id='searchDropdownBox']")
    WebElement dropdown;

    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    WebElement searchButton;

    @FindBy(xpath = "//span[text()='All Discounts']")
    WebElement allDiscountLink;

    @FindBy(xpath = "//span[text()='Kindle Unlimited Eligible']")
    WebElement kindleCheckbox;

    @FindBy(xpath = "//span[@id='a-autoid-0-announce']")
    WebElement sortDropdown;

    @FindBy(xpath = "//div//a[text()='Avg. Customer Review']")
    WebElement avgCustomerReview;

    @FindBy(xpath = "//div//img[@data-image-index='1']")
    WebElement firstBook;

    @FindBy(xpath = "//button[@id='add-to-ebooks-cart-button']")
    WebElement addToCartButton;

    @FindBy(xpath = "//span[text()='Added to eBook cart']")
    WebElement addedToCartMessage;

    // Actions using CommonUtils
    public void selectBookCategory(String visibleText) {
        utils.selectDropdownByText(dropdown, visibleText);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void applyDiscountFilter() {
        allDiscountLink.click();
    }

    public void filterByKindleUnlimited() {
        kindleCheckbox.click();
    }

    public void sortByCustomerReview() {
        sortDropdown.click();
        avgCustomerReview.click();
    }

    public void selectFirstBook() {
        firstBook.click();
    }

    public void switchToNewTab() {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

    public void addToCart() {
        utils.scrollToElement(addToCartButton);
        addToCartButton.click();
    }

    public String getCartConfirmationMessage() {
        utils.waitForElementVisible(addedToCartMessage, 10);
        return addedToCartMessage.getText();
    }

}
