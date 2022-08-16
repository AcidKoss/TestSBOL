package common;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

import static common.Config.*;

/**
 * создание драйвера в классе openApp, установка Capability
 * с помощью Свитча выбор какой драйвер будет запускаться
 */


public class CreatDriver {

    static AppiumDriver<MobileElement> driver;

    public static AppiumDriver openApp() throws Exception {

        DesiredCapabilities cap = new DesiredCapabilities();
        URL url = new URL(serverPort127);

        switch (PLATFORM_MOBILE){
            case "android":
                cap.setCapability("deviceName", "Redmi Note 7");
                cap.setCapability("udid", "102ce941");
                cap.setCapability("platformName", "Android");
                cap.setCapability("platformVersion", "10");
                cap.setCapability("appPackage", "ru.sberbankmobile_alpha");
                cap.setCapability("appActivity", "ru.sberbankmobile.SplashActivity");
                cap.setCapability("automationName", "UiAutomator2");
                driver = new AndroidDriver<MobileElement>(url, cap);
                break;
            case "ios":
                System.out.println("под айфон еще нет настройки");
                break;
            default:
                Assertions.fail("не верная платформа " + PLATFORM_MOBILE);
        }

        return driver;

    }
}
