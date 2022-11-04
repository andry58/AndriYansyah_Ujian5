package com.juaracoding.cucumber.pages;

import com.juaracoding.cucumber.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckoutProduct {
    private WebDriver driver;

    public CheckoutProduct() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='checkout-button button alt wc-forward']")
    WebElement btnCheckout;

    @FindBy(id = "billing_first_name")
    WebElement firstname;

    @FindBy(id = "billing_last_name")
    WebElement lastname;

    @FindBy(id = "billing_company")
    WebElement companyName;

    @FindBy(id = "billing_country")
    WebElement country;

    @FindBy(id = "billing_address_1")
    WebElement addressOne;

    @FindBy(id = "billing_address_2")
    WebElement addressTwo;

    @FindBy(id = "billing_city")
    WebElement city;

    //ID JI

    @FindBy(id = "billing_state")
    WebElement province;

    @FindBy(id = "billing_postcode")
    WebElement postCode;

    @FindBy(id = "billing_phone")
    WebElement phone;

    @FindBy(id = "order_comments")
    WebElement notes;

    @FindBy(id = "terms")
    WebElement checkboxReadAgree;

    @FindBy(xpath = "//*[@id=\"place_order\"]")
    WebElement btnPlaceOrder;

    @FindBy(xpath = "//p[@class='woocommerce-thankyou-order-received']")
    WebElement txtThankYou;

    public void clickBtnCheckout() {
        btnCheckout.click();
    }

    public void name(String firstname, String lastname) {
        this.firstname.sendKeys(firstname);
        this.lastname.sendKeys(lastname);
    }

    public void companyName(String optionalCompanyName) {

        this.companyName.sendKeys(optionalCompanyName);
    }

    public void country(String country) {
        Select selectCountry = new Select(this.country);
        selectCountry.selectByValue(country);
    }

    public void addressOne(String streetAddress) {

        this.addressOne.sendKeys(streetAddress);
    }

    public void addressTwo(String optionalStreeAddress) {

        this.addressTwo.sendKeys(optionalStreeAddress);
    }

    public void city(String city) {

        this.city.sendKeys(city);
    }

    public void province(String province) {
        Select selectProvince = new Select(this.province);
        selectProvince.selectByValue(province);
    }

    public void postcode(String postcode) {
        this.postCode.sendKeys(postcode);
    }

    public void phoneNumber(String phoneNumber){

        this.phone.sendKeys(phoneNumber);
    }

    public void notes(String note) {

        this.notes.sendKeys(note);
    }

   // public void clickCheckboxReadAgree() {

   // }

    public void clickBtnPlaceOrder() {
        checkboxReadAgree.click();
        btnPlaceOrder.click();
    }

    public String getTxtThankyou() {
        return txtThankYou.getText();
    }
}
