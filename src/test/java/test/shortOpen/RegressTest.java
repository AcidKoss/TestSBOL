package test.shortOpen;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import test.base.BaseTest;

import static common.Config.*;

public class RegressTest extends BaseTest {

    @Test
    @DisplayName("Проверка главного экрана №1")
    public void check(){


        HomePage.checkPage();

    }

    @Test
    @DisplayName("Проверка главного экрана №2")
    public void check1(){


        HomePage.checkPage1();

    }

}
