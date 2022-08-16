package test.base;

import common.CreatDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import page.appMpSBOL.Authorization;
import page.appMpSBOL.HomePage;
import page.base.BasePage;

public class BaseTest {

    protected AppiumDriver<MobileElement> driver;

    {
        try {
            driver = CreatDriver.openApp();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected BasePage basePage = new BasePage(driver);
    protected Authorization authorization = new Authorization(driver);
    protected HomePage HomePage = new HomePage(driver);

    @BeforeEach
    public void openApp(){
        authorization.login();
    }
    @AfterEach
    public void closeApp(){
        driver.quit();
    }

}
