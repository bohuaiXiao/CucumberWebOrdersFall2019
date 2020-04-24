package com.webOrder.step_definitions;

import com.webOrder.pages.LoginPage;
import com.webOrder.pages.orers_pages.Orders;
import com.webOrder.pages.view_all_orders.View_allOrders;
import com.webOrder.utilities.BrowserUtilities;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

/**
 * @author:
 * @create:
 * @date:
 */
public class add_order_definitions {
    Orders orders = new Orders();
    View_allOrders view_allOrders = new View_allOrders();
    @Given("user navigates to {string} page")
    public void user_navigates_to_page(String string) {
        System.out.println("user navigates --> "+string);
        orders.navigateTo(string);
    }

    @When("user enters product information:")
    public void user_enters_product_information(List<Map<String,String>> dataTable) {
        System.out.println("Enter product info");
        Map<String, String> s = dataTable.get(0);
        orders.enterProductInfo(s.get("Product"));
        orders.enterQuantityInfo(s.get("Quantity"));
        orders.enterPrice_per_unit(s.get("Price per unit"));
        orders.enter_discount(s.get("Discount"));

    }

    @When("user click on calculate button")
    public void user_click_on_calculate_button() {
        System.out.println("\"user click on calculate button\"");
        orders.clickOnCalculate();
    }

    @Then("user should verify that total {int} is displayed")
    public void user_should_verify_that_total_is_displayed(Integer int1) {
        String total = orders.getTotal();
        Integer total_price = Integer.valueOf(total);
        Assert.assertEquals(int1,total_price);
        BrowserUtilities.wait(1);
    }

    @When("user enters address information:")
    public void user_enters_address_information(List<Map<String,String>> dataTable) {
        System.out.println("user enters address information:");
        Map<String, String> s = dataTable.get(0);
        orders.enterCustomer_name(s.get("Customer name"));
        orders.enterStreet(s.get("Street"));
        orders.enterCity(s.get("City"));
        orders.enterState(s.get("State"));
        orders.enterZip(s.get("Zip"));
        BrowserUtilities.wait(2);
    }

    @When("user enter payment information:")
    public void user_enter_payment_information(List<Map<String,String>> dataTable) {
        System.out.println("user enter payment information:");
        Map<String, String> s = dataTable.get(0);
        orders.chooseCard(s.get("Card"));
        orders.enterCard_NUmber(s.get("Card Nr:"));
        orders.enterExpire_day(s.get("Expire date(mm/yy)"));
        BrowserUtilities.wait(3);
    }

    @When("user click on process button")
    public void user_click_on_process_button() {
        System.out.println("user click on process button");
        orders.click_on_process_button();
        BrowserUtilities.wait(2);
    }
    @Then("user verifies that order is displayed")
    public void user_verifies_that_order_is_displayed(List<Map<String,String>> dataTable) {
        String nameOfOrder = view_allOrders.getNameOfOrder();
        String productInfo = view_allOrders.getProductInfo();
        Map<String, String> s  = dataTable.get(0);
        String name = s.get("Name");
        String product = s.get("Product");
        Assert.assertEquals(name,nameOfOrder);
        Assert.assertEquals(product,productInfo);


    }

}
