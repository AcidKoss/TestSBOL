package page.appMpSBOL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import page.base.BasePage;

import static common.Config.*;

public class Authorization extends BasePage {
    public Authorization(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    By allow = By.id("com.android.permissioncontroller:id/permission_allow_button");
    By actionMenu = By.xpath("//android.widget.ImageView[@content-desc=\"Ещё\"]");
    By server = By.xpath("//android.widget.TextView[@text='Server']");
    By ift = By.xpath("//android.widget.TextView[@text='ИФТ']");
    By settingsTest = By.xpath("//android.widget.TextView[@text='Настройки для тестирования']");
    By useSslPinning = By.id("ru.sberbankmobile_alpha:id/use_ssl_pinning_toggle");
    By backButton = By.id("ru.sberbankmobile_alpha:id/back_button");
    By login = By.xpath("//android.widget.TextView[@text='Войти по логину СберБанк Онлайн']");
    By loginField = By.id("ru.sberbankmobile_alpha:id/edit_text_view");
    By continueBut = By.id("ru.sberbankmobile_alpha:id/enter_button");
    By keyBoard1 = By.id("ru.sberbankmobile_alpha:id/keyboard_number_1");
    By keyBoard2 = By.id("ru.sberbankmobile_alpha:id/keyboard_number_2");
    By keyBoard3 = By.id("ru.sberbankmobile_alpha:id/keyboard_number_3");
    By usePin = By.id("ru.sberbankmobile_alpha:id/use_pin");




    public Authorization login(){
        click(allow)
                .click(actionMenu)
                .click(server)
                .click(ift)
                .click(actionMenu )
                .click(settingsTest)
                .click(useSslPinning)
                .click(backButton)
                .click(login)
                .input(loginUser_kuz_123,loginField)
                .click(continueBut)
                .passwordInput(2,keyBoard1,keyBoard1,keyBoard2,keyBoard2,keyBoard3)
                .click(usePin);




        return this;
    }





}