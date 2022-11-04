package com.juaracoding.cucumber.pages;


import com.juaracoding.cucumber.drivers.DriverSingleton;
import com.juaracoding.cucumber.utils.Constants;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {
    private WebDriver driver;

    public Search() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"noo-site\"]/header/div[2]/div/div/div/a")
    WebElement clickSearch;

    @FindBy(name = "s")
    WebElement inputSearch;

    @FindBy(xpath = "//a[normalize-space()='white milkmaid hook and eye bodycon midi dress']")
    WebElement txtSearchItem;

    @FindBy(xpath = "//p[@class='woocommerce-info woocommerce-no-products-found']")
    WebElement txtMessageNotFound;

    public void clickSearch() {
        clickSearch.click();
    }

    public void searchItem(String searchItem) {
        this.inputSearch.sendKeys(searchItem);
    }

    public void pressEnter() {
        inputSearch.submit();
    }

    public String getTxtDress() {
        return txtSearchItem.getText();
    }

    public String getTxtMessageNotFound() {
        return txtMessageNotFound.getText();
    }
}
