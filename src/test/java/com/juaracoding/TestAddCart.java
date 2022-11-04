package com.juaracoding;

import com.juaracoding.cucumber.pages.AddCart;
import com.juaracoding.cucumber.pages.Search;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestAddCart {
    private static WebDriver driver;
    private static ExtentTest extentTest;

    private AddCart addCart = new AddCart();

    private Search search = new Search();

    public TestAddCart() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User click product dress item")
    public void user_click_product_dress_item() {
        addCart.clickDressItem();
        extentTest.log(LogStatus.PASS,"User click product dress item");
    }

    @And("User choose product dress color")
    public void user_choose_product_dress_color() {
        addCart.chooseColor("black");
        extentTest.log(LogStatus.PASS,"User choose product dress color");
    }

    @And("User choose product dress size")
    public void user_choose_product_dress_size() {
        addCart.chooseSize("large");
        extentTest.log(LogStatus.PASS, "User choose product dress size");
    }

    @And("User click button add cart on dress product")
    public void user_click_button_add_cart_on_dress_product() {
        addCart.clickBtnAddCart();
        extentTest.log(LogStatus.PASS,"User click button add cart on dress product");
    }

    @And("User click icon cart for dress view")
    public void user_click_icon_cart_for_dress_view() {
        addCart.clickIconCart();
        extentTest.log(LogStatus.PASS, "User click icon cart for dress view");
    }

    @Then("Showing dress product after add cart")
    public void showing_dress_product_after_add_cart() {
        Assert.assertTrue(addCart.getTxtDressProductItem().contains("DRESS"));
        extentTest.log(LogStatus.PASS,"Showing dress product after add cart");
    }

    @When("User click product tshirt item")
    public void user_click_product_tshirt_item() {
        search.clickSearch();
        search.searchItem("t shirt");
        search.pressEnter();
        addCart.clickTShirtItem();
        extentTest.log(LogStatus.PASS,"User click product tshirt item");
    }

    @And("User choose product tshirt color")
    public void user_choose_product_tshirt_color() {
        addCart.chooseColor("pink");
        extentTest.log(LogStatus.PASS,"User choose product tshirt color");
    }

    @And("User choose product tshirt size")
    public void user_choose_product_tshirt_size() {
        addCart.chooseSize("37");
        extentTest.log(LogStatus.PASS, "User choose product tshirt size");
    }

    @And("User click button add cart on tshirt product")
    public void user_click_button_add_cart_on_tshirt_product() {
        addCart.clickBtnAddCart();
        extentTest.log(LogStatus.PASS,"User click button add cart on tshirt product");
    }

    @And("User click icon cart for tshirt view")
    public void user_click_icon_cart_for_tshirt_view() {
        addCart.clickIconCart();
        extentTest.log(LogStatus.PASS, "User click icon cart for tshirt view");
    }

    @Then("Showing tshirt product after add cart")
    public void showing_tshirt_product_after_add_cart() {
        Assert.assertTrue(addCart.getTxtTShirtProductItem().contains("T SHIRT"));
        extentTest.log(LogStatus.PASS,"Showing dress product after add cart");
    }
}
