package com.webOrder.step_definitions;

import com.webOrder.pages.LoginPage;
import com.webOrder.utilities.BrowserUtilities;
import com.webOrder.utilities.ConfigurationReader;
import com.webOrder.utilities.Driver;
import io.cucumber.java.en.*;

/**
 * @author:
 * @create:
 * @date:
 */
public class login_definitions {
    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("user is on the login page");
        String URL = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(URL);

    }

    @When("user enter {string} and {string}")
    public void user_enter_and(String string, String string2) {
        System.out.println("user enter data");
        loginPage.login(string,string2);
    }

    @Then("verify the page login text is a Web Orders")
    public void verify_the_page_login_text_is_a_Web_Orders() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
