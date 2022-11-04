package com.juaracoding.cucumber.pages;


import com.juaracoding.cucumber.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    private WebDriver driver;

    public Login() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='woocommerce-store-notice__dismiss-link']")
    WebElement clickDismiss;

    @FindBy(xpath = "//a[normalize-space()='My Account']")
    WebElement clickMenuMyAccount;

    @FindBy(id = "username")
    WebElement usernameLogin;

    @FindBy(id = "password")
    WebElement passwordLogin;

    @FindBy(xpath = "//*[@id=\"customer_login\"]/div[1]/form/p[2]/span/span")
    WebElement visiblePassword;


    @FindBy(id = "rememberme")
    WebElement checklistRememberme;

    @FindBy(xpath = "//*[@id=\"customer_login\"]/div[1]/form/p[3]/button")
    WebElement btnLogin;

    @FindBy(xpath = "//strong[normalize-space()='ERROR']")
    WebElement txtMessageError;

    @FindBy(xpath = "//*[@id=\"post-8\"]/div/div/div/p[1]/strong[1]")
    WebElement txtMyAccount;


    public void loginPage() {
        clickDismiss.click();
        clickMenuMyAccount.click();
    }

    public void loginForm(String email, String password) {
        this.usernameLogin.sendKeys(email);
        this.passwordLogin.sendKeys(password);
        visiblePassword.click();
        checklistRememberme.click();
    }

    public void clickBtnLogin() {

        btnLogin.click();
    }

    public String getTxtMessageError() {

        return txtMessageError.getText();
    }

    public String getTxtMyAccount() {
        return txtMyAccount.getText();
    }
}