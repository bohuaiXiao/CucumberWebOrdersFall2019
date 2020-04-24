package com.webOrder.pages.orers_pages;

import com.webOrder.pages.AbstractBasePage;
import com.webOrder.utilities.BrowserUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

/**
 * @author:
 * @create:
 * @date:
 */
public class Orders extends AbstractBasePage {
// enter product info
    @FindBy(css = "#ctl00_MainContent_fmwOrder_ddlProduct")
    private WebElement productInput;
    public void enterProductInfo(String productString){
      BrowserUtilities.waitForPageToLoad(20);
        wait.until(ExpectedConditions.elementToBeClickable(productInput)).click();
        Select select = new Select(productInput);
        select.selectByValue(productString);
    }
    // enter Quantity info
    @FindBy(css = "input[id=\"ctl00_MainContent_fmwOrder_txtQuantity\"]")
    private WebElement quantityInput;
    public void enterQuantityInfo(String quantityString){
        BrowserUtilities.wait(3);
        wait.until(ExpectedConditions.visibilityOf(quantityInput)).sendKeys(quantityString);

    }
    //enter Price per unit
    @FindBy(css = "#ctl00_MainContent_fmwOrder_txtUnitPrice")
    private WebElement pricePerUnit;
    public void enterPrice_per_unit(String price_per_unit){
        wait.until(ExpectedConditions.visibilityOf(pricePerUnit)).sendKeys(price_per_unit);
    }
    //enter discount
    @FindBy(id = "ctl00_MainContent_fmwOrder_txtDiscount")
    private WebElement discounts;
    public void enter_discount(String discount){
        wait.until(ExpectedConditions.visibilityOf(discounts)).sendKeys(discount);
    }
    // click on calculate button
    @FindBy(css = "input[value=\"Calculate\"]")
    private WebElement calculate_button;
    public void clickOnCalculate(){
        wait.until(ExpectedConditions.elementToBeClickable(calculate_button)).click();
    }
    @FindBy(id = "ctl00_MainContent_fmwOrder_txtTotal")
    private WebElement total;
    public String getTotal(){
        return total.getAttribute("value");
    }
    @FindBy(id = "ctl00_MainContent_fmwOrder_txtName")
    private WebElement customerName;
    public void enterCustomer_name(String customer_Name){
        wait.until(ExpectedConditions.visibilityOf(customerName)).sendKeys(customer_Name);
    }
    @FindBy(id ="ctl00_MainContent_fmwOrder_TextBox2")
    private WebElement street;
    public void enterStreet(String the_street){
        wait.until(ExpectedConditions.visibilityOf(street)).sendKeys(the_street);
    }
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox3")
    private WebElement city;
    public void enterCity(String the_city){
        wait.until(ExpectedConditions.visibilityOf(city)).sendKeys(the_city);
    }
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox4")
    private WebElement state;
    public void enterState(String the_state){
        wait.until(ExpectedConditions.visibilityOf(state)).sendKeys(the_state);
    }

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox5")
    private WebElement zip;
    public void enterZip(String zip_code){
        wait.until(ExpectedConditions.visibilityOf(zip)).sendKeys(zip_code);
    }


    public void chooseCard(String card_options){
        String xpath = "//label[text()='"+card_options+"']/../input";
        WebElement checkBox = driver.findElement(By.xpath(xpath));
        wait.until(ExpectedConditions.elementToBeClickable(checkBox)).click();
    }

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox6")
    private WebElement card_Number;
    public void enterCard_NUmber(String card_number){
        wait.until(ExpectedConditions.visibilityOf(card_Number)).sendKeys(card_number);
    }
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox1")
    private WebElement expire_day;
    public void enterExpire_day(String expire_Day){
        wait.until(ExpectedConditions.visibilityOf(expire_day)).sendKeys(expire_Day);
    }
    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    private WebElement process_button;
    public void click_on_process_button(){
        wait.until(ExpectedConditions.elementToBeClickable(process_button)).click();
    }
}
