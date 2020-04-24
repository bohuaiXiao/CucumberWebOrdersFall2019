package com.webOrder.pages;

import com.webOrder.utilities.BrowserUtilities;
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

    public void login(String usernameStr, String passwordStr){
     this.username.sendKeys(usernameStr);
        BrowserUtilities.wait(2);
     this.password.sendKeys(passwordStr, Keys.ENTER);
}
    public void login(){
        String username = ConfigurationReader.getProperty("username1");
        String password = ConfigurationReader.getProperty("password1");
        this.username.sendKeys(username);
        this.password.sendKeys(password, Keys.ENTER);
    }
 @FindBy(tagName = "h1")
 private WebElement login_logo;
    public String getLogin_Logo(){
        return login_logo.getText();
    }


}
