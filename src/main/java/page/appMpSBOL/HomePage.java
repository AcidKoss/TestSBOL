package page.appMpSBOL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import page.base.BasePage;

public class HomePage extends BasePage {

    public HomePage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    By homeButton = By.xpath("//android.widget.FrameLayout[@content-desc='Главный, вкладка, 1 из 5']");


    public HomePage checkPage (){
        String e = driver.findElement(homeButton).getAttribute("content-desc");
        System.out.println(e);
        Assertions.assertEquals(e,"Главный, вкладка, 1 из 5");
        return this;
    }
    public HomePage checkPage1 (){
        String e = driver.findElement(homeButton).getAttribute("content-desc");
        System.out.println(e);
        Assertions.assertEquals(e,"Главный, вкладка, 1 из 4");
        return this;
    }

}
