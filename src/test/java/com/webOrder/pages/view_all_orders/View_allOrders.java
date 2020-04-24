package com.webOrder.pages.view_all_orders;

import com.webOrder.pages.AbstractBasePage;
import com.webOrder.utilities.BrowserUtilities;
import org.openqa.selenium.By;

/**
 * @author:
 * @create:
 * @date:
 */
public class View_allOrders extends AbstractBasePage {
    public String getNameOfOrder(){
        BrowserUtilities.waitForPageToLoad(20);
        return driver.findElement(By.xpath("//tbody/tr[2]/td[2]")).getText();
    }

    public String getProductInfo(){
        BrowserUtilities.waitForPageToLoad(20);
        return driver.findElement(By.xpath("//tbody/tr[2]/td[3]")).getText();
    }

}
