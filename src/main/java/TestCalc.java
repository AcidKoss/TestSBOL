import com.google.common.annotations.VisibleForTesting;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileCommand;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import page.appMpSBOL.Authorization;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static common.Config.implicitWaitTimeout;
import static common.CreatDriver.openApp;

public class TestCalc {

    static AppiumDriver<MobileElement> driver;

    public static void main(String[] args) {
        try {
            openCalculator();
        } catch (Exception exp) {
            System.out.println(exp.getCause());
        }


    }

    public static void openCalculator() throws Exception {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Redmi Note 7");
        cap.setCapability("udid", "102ce941");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "10");
        cap.setCapability("appPackage", "ru.sberbankmobile_alpha");
        cap.setCapability("appActivity", "ru.sberbankmobile.SplashActivity");
        //cap.setCapability("appActivity","ru.sberbankmobile.PreloginActivity");
        cap.setCapability("automationName", "UiAutomator1");


        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(url, cap);
        MobileElement allow = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button"));

        MobileElement actionMenu = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Ещё\"]"));
        MobileElement server = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[5]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView"));
        MobileElement ift = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]"));
        MobileElement login = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Войти по логину СберБанк Онлайн, кнопка\"]/android.view.ViewGroup"));
        MobileElement loginField = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button"));
        MobileElement continueBut = driver.findElement(By.id("ru.sberbankmobile_alpha:id/enter_button"));

        driver.manage().timeouts().implicitlyWait(implicitWaitTimeout, TimeUnit.SECONDS);
        allow.click();
        actionMenu.click();
        server.click();
        ift.click();
        login.click();
        loginField.setValue("kuz_123");
        continueBut.click();


    }
}