package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By searchField = By.id("DIV__customsear__41");
    private By searchIcon = By.id("A__btnsearchm__59");
    private By wishListIcon = By.id("A__wishlist__52");
    private By gridIcon = By.id("I__tiviewgrid__202");
    private By gridIconV2 = By.id("I__tiviewgrid__203");
    private By viewListIcon = By.id("I__tiviewlist__204");
    private By viewListIconV2 = By.id("I__tiviewlist__205");
    private By filterColumn = By.id("filter_col");
    private By mainMenu = By.id("DIV__mainmenu__15");
    private By blackColorOption = By.cssSelector("#LABEL__containerc__104 span");
    private By filterButton = By.id("filterBtn");
    private By productGrid = By.cssSelector("#product_grid .grid_item");
    private By blackShoeItem = By.id("A____217");
    private By blackShoeItemV2 = By.id("product_1");

    public boolean isSearchFieldDisplayed() {
        return driver.findElement(searchField).isDisplayed();
    }

    public boolean isMainMenuDisplayed() {
        return driver.findElement(mainMenu).isDisplayed();
    }

    public void isCheckboxElementDisplayed() {
        WebElement blackColorCheckBox = driver.findElement(By.cssSelector("#LABEL__containerc__104 span"));
        if (!blackColorCheckBox.isDisplayed()) {
            driver.findElement(By.id("ti-filter")).click();
        } else {
            System.out.println("checkbox element is displayed");
        }
    }

    public void checkBlackColorOption() {
        waitForElementToBeClickable(blackColorOption);
        driver.findElement(blackColorOption).click();
    }

    public void clickFilterButton() {
        waitForElementToBeClickable(filterButton);
        driver.findElement(filterButton).click();
    }

    public boolean product_Grid_Should_Contain_2_Items() {
        List<WebElement> gridItems = driver.findElements(productGrid);
        return gridItems.size() == 2;
    }

    public DetailsPage clickBlackShoeItem1() {
        waitForElementToBeClickable(blackShoeItem);
        driver.findElement(blackShoeItem).click();
        return new DetailsPage(driver);
    }

    public DetailsPage clickBlackShoeItem1V2() {
        waitForElementToBeClickable(blackShoeItemV2);
        driver.findElement(blackShoeItemV2).click();
        return new DetailsPage(driver);
    }

    public void waitForElementToBeClickable(By Locator) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(Locator));
    }

    public boolean isSearchIconDisplayed() {
        return driver.findElement(searchIcon).isDisplayed();
    }

    public boolean isWishListIconDisplayed() {
        return driver.findElement(wishListIcon).isDisplayed();
    }

    public boolean isGridIconDisplayed() {
        return driver.findElement(gridIcon).isDisplayed();
    }

    public boolean isViewListIconDisplayed() {
        return driver.findElement(viewListIcon).isDisplayed();
    }

    public boolean isFilterColumnDisplayed() {
        return driver.findElement(filterColumn).isDisplayed();
    }

    public boolean isGridIconDisplayedV2() {
        return driver.findElement(gridIconV2).isDisplayed();
    }

    public boolean isViewListIconDisplayedV2() {
        return driver.findElement(viewListIconV2).isDisplayed();
    }
}