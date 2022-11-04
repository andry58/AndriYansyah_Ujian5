package com.juaracoding;

import com.juaracoding.cucumber.pages.Search;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestSearch {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private Search search= new Search();

    public TestSearch() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User click button search for product not found")
    public void user_click_button_search_for_product_not_found() {
        search.clickSearch();
        extentTest.log(LogStatus.PASS, "User click button search for product not found");
    }

    @And("User typing helm product search")
    public void user_typing_helm_product_search() {
        search.searchItem("helm");
        extentTest.log(LogStatus.PASS, "User typing helm product in search");
    }

    @And("User press enter for product not found")
    public void user_press_enter_for_product_not_found() {
        search.pressEnter();
        extentTest.log(LogStatus.PASS, "User press enter for product not found");
    }

    @Then("Showing message no product were found")
    public void showing_message_no_product_were_found() {
        Assert.assertTrue(search.getTxtMessageNotFound().contains("No products were found"));
        extentTest.log(LogStatus.PASS,"Showing message no product were found");
    }


    @When("User click button search")
    public void user_click_button_search() {
        search.clickSearch();
        extentTest.log(LogStatus.PASS, "User click button search");
    }

    @And("User typing dress product search")
    public void user_typing_dress_product_search() {
        search.searchItem("dress");
        extentTest.log(LogStatus.PASS, "User typing dress product in search");
    }

    @And("User press enter")
    public void user_press_enter() {
        search.pressEnter();
        extentTest.log(LogStatus.PASS, "User press enter");
    }

    @Then("Showing dress product")
    public void showing_dress_product() {
        Assert.assertTrue(search.getTxtDress().contains("DRESS"));
        extentTest.log(LogStatus.PASS,"Showing dress product");
    }
}
