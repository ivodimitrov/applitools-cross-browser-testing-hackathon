package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DetailsPage {
    private WebDriver driver;

    public DetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    private By itemModelDescription = By.id("SMALL____84");
    private By size = By.xpath("//div[@class='nice-select wide']//span");
    private By itemPrice = By.id("new_price");

    public boolean itemModelDescriptionIsDisplayed() {
        return driver.findElement(itemModelDescription).isDisplayed();
    }

    public boolean sizeSmallIsDisplayed() {
        return driver.findElement(size).getText().contentEquals("Small (S)");
    }

    public boolean itemPriceValue() {
        return driver.findElement(itemPrice).getText().contentEquals("$33.00");
    }
}