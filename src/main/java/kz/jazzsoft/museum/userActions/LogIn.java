package kz.jazzsoft.museum.userActions;

import kz.jazzsoft.museum.pageObjects.PageLogIn;
import kz.jazzsoft.museum.helpers.WorkWithPropertyFile;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Properties;

/**
 * Created by Dmitriy.Yakovlev on 30.09.2016.
 */
public class LogIn {

    //подключаем логи
    private static Logger log = Logger.getLogger(LogIn.class.getName());

    private static Properties properties = WorkWithPropertyFile.createProperti();
    private static final String userName = properties.getProperty("userName");
    private static final String password = properties.getProperty("userPassword");

    /*
    param
    return driver
     */
    //Пазитивный сценарий
    public static WebDriver logIn(WebDriver driver) {

        // идем по адресу музея
        PageLogIn.loadPage(driver);

        // Найти элемент ввода текста по его имени
        WebElement elementLog = PageLogIn.txtbx_UserName(driver);

        //очистип поле ввода
        elementLog.clear();

        // Введите логин
        elementLog.sendKeys(userName);

        // Найти элемент ввода текста по его имени
        WebElement elementPass = PageLogIn.txtbx_Password(driver);

        //Очистим поле ввода
        elementPass.clear();

        //введите пароль
        elementPass.sendKeys(password);

        //ищем элемент по id (кнопку) и нажимаем
        PageLogIn.btn_LogIn(driver).click();

        //неявное ожидание загрузки страницы
        WebElement dynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("gwt-uid-3")));

        log.info("Вошли в систему");
        return driver;

    }

}
