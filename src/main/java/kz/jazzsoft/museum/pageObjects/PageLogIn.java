package kz.jazzsoft.museum.pageObjects;

import kz.jazzsoft.museum.helpers.WorkWithPropertyFile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Properties;

/**
 * Created by dima on 15.11.16.
 */
public class PageLogIn {
    private static WebElement element = null;

    //подключаем проперти файл
    private static Properties properties = WorkWithPropertyFile.loadProperties();

    /**
     * @param driver
     * @return let driver load the login page
     * @throws InterruptedException
     */
    public static WebDriver loadPage(WebDriver driver) {
        final String hostName = properties.getProperty("hostName");
        driver.get(hostName);
        return driver;
    }


    /**
     * @param driver
     * @return the textbox username of login
     */
    public static WebElement txtbx_UserName(WebDriver driver) {
        element = driver.findElement(By.name("j_username"));
        return element;
    }

    /**
     * @param driver
     * @return the textbox password of login
     */
    public static WebElement txtbx_Password(WebDriver driver) {
        element = driver.findElement(By.name("j_password"));
        return element;
    }

    /**
     * @param driver
     * @return the button Вход
     */
    public static WebElement btn_LogIn(WebDriver driver) {
        element = driver.findElement(By.id("submitlink"));
        return element;
    }

    /**
     * @param driver
     * @return the button Казакша
     */
    public static WebElement btn_LogInKaz(WebDriver driver) {
        element = driver.findElement(By.id("locallink"));
        return element;
    }
}
