package com.juaracoding;

import com.juaracoding.cucumber.pages.CheckoutProduct;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestCheckoutProduct {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private CheckoutProduct checkoutProduct = new CheckoutProduct();

    public TestCheckoutProduct() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User click button checkout")
    public void user_click_button_checkout() {
        checkoutProduct.clickBtnCheckout();
        extentTest.log(LogStatus.PASS,"User click buton checkout");
    }

    @And("User typing firstname lastname")
    public void user_typing_firstname_lastname() {
        checkoutProduct.name("Andri", "Yansyah");
        extentTest.log(LogStatus.PASS,"User typing firstname lastname");
    }

    @And("User typing company name just optional")
    public void user_typing_company_name_just_optional() {
        checkoutProduct.companyName("PT.KPI");
        extentTest.log(LogStatus.PASS,"User typing company name");
    }

    @And("User choose country")
    public void user_choose_country() {
        checkoutProduct.country("ID");
        extentTest.log(LogStatus.PASS,"User choose country");
    }

    @And("User typing address one")
    public void user_typing_address_one() {
        checkoutProduct.addressOne("Jl.Kp pondok bahar");
        extentTest.log(LogStatus.PASS,"User typing address one");
    }

    @And("User typing address two just optional")
    public void user_typing_address_two_just_optional() {
        checkoutProduct.addressTwo("");
        extentTest.log(LogStatus.PASS,"User typing address two");
    }

    @And("User typing city")
    public void user_typing_city() {
        checkoutProduct.city("Tangerang");
        extentTest.log(LogStatus.PASS,"User typing city");
    }

    @And("User choose province")
    public void user_choose_province() {
        checkoutProduct.province("BT");
        extentTest.log(LogStatus.PASS,"User choose province");
    }

    @And("User typing postcode")
    public void user_typing_postcode() {
        checkoutProduct.postcode("15158");
        extentTest.log(LogStatus.PASS,"User typing postcode");
    }

    @And("User typing phone number")
    public void user_typing_phone_number() {
        checkoutProduct.phoneNumber("8930977899");
        extentTest.log(LogStatus.PASS,"User typing phone number");
    }

    @And("User enter notes just optional")
    public void user_enter_notes_just_optional() {
        checkoutProduct.notes("");
        extentTest.log(LogStatus.PASS,"User enter notes just optional");
    }


    @And("User click button place order")
    public void user_click_button_place_order() {
        checkoutProduct.clickBtnPlaceOrder();
        extentTest.log(LogStatus.PASS,"User click button place order");
   }

    @Then("Showing message Thank you. Your order has been received")
    public void showing_message_thank_you_your_order_has_been_received() {
        Assert.assertEquals(checkoutProduct.getTxtThankyou(),"Thank you. Your order has been received.");
    }
}
