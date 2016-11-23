package UserAction;

import PageObjects.PageLogIn;
import Helppers.WorkWithPropertyFile;
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
        return driver;
    }

//    //    Негативный сценарий (не введено имя пользователя)
//    public static void negativScenariyNetUser() {
//        //        настраиваем chrome
//        System.setProperty("webdriver.chrome.driver", "/home/dmitriy/JD/chromedriver");
//        WebDriver driver = new ChromeDriver();
//
//        // идем по адресу музея
//        driver.get(hostName);
//        // В качестве альтернативы то же самое можно сделать, как это
//        // Driver.navigate () к ("http://www.google.com").
//
//        // Найти элемент ввода текста по его имени
//        WebElement elementLog = driver.findElement(By.name("j_username"));
//        //        Очистим поле ввода
//        elementLog.clear();
//        // Введите логин
//        elementLog.sendKeys("");
//
//        // Найти элемент ввода текста по его имени
//        WebElement elementPass = driver.findElement(By.name("j_password"));
//        //        Очистим поле ввода
//        elementPass.clear();
////        введите пароль
//        elementPass.sendKeys(password);
////        ищем элемент по id (кнопку) и нажимаем
//        driver.findElement(By.id("submitlink")).click();
////        ищем элемент error
//        System.out.println(driver.findElement(By.id("error")).getText());
//
//
////       закрываем окно браузера
//        driver.close();
//    }
//
//
//    //    Негативный сценарий (не введен пароль)
//    public static void negativScenariyNetPass() {
//
//
//        //        настраиваем chrome
//        System.setProperty("webdriver.chrome.driver", "/home/dmitriy/JD/chromedriver");
//        WebDriver driver = new ChromeDriver();
//
//        // идем по адресу музея
//        driver.get(hostName);
//        // В качестве альтернативы то же самое можно сделать, как это
//        // Driver.navigate () к ("http://www.google.com").
//
//        // Найти элемент ввода текста по его имени
//        WebElement elementLog = driver.findElement(By.name("j_username"));
//        //        Очистим поле ввода
//        elementLog.clear();
//        // Введите логин
//        elementLog.sendKeys(userName);
//
//        // Найти элемент ввода текста по его имени
//        WebElement elementPass = driver.findElement(By.name("j_password"));
//        //        Очистим поле ввода
//        elementPass.clear();
////        введите пароль
//        elementPass.sendKeys("");
//
////        ищем элемент по id (кнопку) и нажимаем
//        driver.findElement(By.id("submitlink")).click();
////         ищем элемент error
//        System.out.println(driver.findElement(By.id("error")).getText());
//
//
////       закрываем окно браузера
//        driver.quit();
//    }
//
//    //    Негативный сценарий (пользователь уже залогинен)
//    public static void negativScenariyUserLogIn() {
//
//
//        //        настраиваем chrome
//        System.setProperty("webdriver.chrome.driver", "/home/dmitriy/JD/chromedriver");
//        WebDriver driver = new ChromeDriver();
//
//        // идем по адресу музея
//        driver.get(hostName);
//        // В качестве альтернативы то же самое можно сделать, как это
//        // Driver.navigate () к ("http://www.google.com").
//
//        // Найти элемент ввода текста по его имени
//        WebElement elementLog = driver.findElement(By.name("j_username"));
//        //        Очистим поле ввода
//        elementLog.clear();
//        // Введите логин
//        elementLog.sendKeys(userName);
//
//        // Найти элемент ввода текста по его имени
//        WebElement elementPass = driver.findElement(By.name("j_password"));
//        //        Очистим поле ввода
//        elementPass.clear();
////        введите пароль
//        elementPass.sendKeys(password);
//
////        ищем элемент по id (кнопку) и нажимаем
//        driver.findElement(By.id("submitlink")).click();
//
//        //неявное ожидание загрузки страницы
//        WebElement dynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("gwt-uid-3")));
////       закрываем окно браузера
//        driver.quit();
//
//        WebDriver webDriver = new ChromeDriver();
//        // идем по адресу музея
//        webDriver.get(hostName);
//        // В качестве альтернативы то же самое можно сделать, как это
//        // Driver.navigate () к ("http://www.google.com").
//
//        // Найти элемент ввода текста по его имени
//        WebElement webElemenLog = webDriver.findElement(By.name("j_username"));
//        //        Очистим поле ввода
//        webElemenLog.clear();
//        // Введите логин
//        webElemenLog.sendKeys(userName);
//
//        // Найти элемент ввода текста по его имени
//        WebElement webElementPass = webDriver.findElement(By.name("j_password"));
//        //        Очистим поле ввода
//        webElementPass.clear();
////        введите пароль
//        webElementPass.sendKeys(password);
//
////        ищем элемент по id (кнопку) и нажимаем
//        webDriver.findElement(By.id("submitlink")).click();
//        System.out.println(webDriver.findElement(By.id("error")).getText());
//        webDriver.quit();
//    }


}
