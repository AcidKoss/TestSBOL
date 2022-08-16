package page.base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static common.Config.implicitWaitTimeout;

public class BasePage {
    protected AppiumDriver<MobileElement> driver;

    public BasePage (AppiumDriver<MobileElement> driver){
        driver.manage().timeouts().implicitlyWait(implicitWaitTimeout, TimeUnit.SECONDS);
        this.driver = driver;
    }

    public BasePage click(By element){
        WebElement e = driver.findElement(element);
        e.click();
        return this;
    }

    public BasePage input(String text, By element){
         WebElement e = driver.findElement(element);
        e.clear();
        e.sendKeys(text);
        return this;
    }

    public BasePage passwordInput (int inputQuantity, By key1 , By key2, By key3, By key4, By key5) {
        for(int i = 1; i <= inputQuantity; i++) {
            click(key1).click(key2).click(key3).click(key4).click(key5);
        }
        return this;
    }

}
