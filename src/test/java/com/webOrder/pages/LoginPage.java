package com.webOrder.pages;

import com.webOrder.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author:
 * @create:
 * @date:
 */
public class LoginPage extends AbstractBasePage {


@FindBy(css = "input[name=\"ctl00$MainContent$username\"]")
private WebElement username;
@FindBy(css = "input[name=\"ctl00$MainContent$password\"]")
private WebElement password;

    public void login(String username, String password){
     this.username.sendKeys(username);
     this.password.sendKeys(password, Keys.ENTER);
}
    public void login(){
        String username = ConfigurationReader.getProperty("username1");
        String password = ConfigurationReader.getProperty("password1");
        this.username.sendKeys(username);
        this.password.sendKeys(password, Keys.ENTER);
    }


}
