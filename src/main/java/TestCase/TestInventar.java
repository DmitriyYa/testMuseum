package TestCase;

import Helppers.WorkWithPropertyFile;
import Helppers.WorkWithScreenshots;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.File;
import java.util.List;
import java.util.Properties;

/**
 * Created by dmitriy on 18.10.16.
 */
public class TestInventar {
    public static Properties properties= WorkWithPropertyFile.createProperti();
    public static final String userName = properties.getProperty("userName");
    public static final String password = properties.getProperty("userPassword");
    public static final String hostName = properties.getProperty("hostName");

    //подключаем логи
    public static final Logger log =Logger.getLogger(TestInventar.class.getName());


    public static void pozitivScenariy() {


        //        настраиваем chrome
        System.setProperty("webdriver.chrome.driver", "/Users/dima/1/chromedriver");
        WebDriver driver = new ChromeDriver();

        // идем по адресу музея
        driver.get(hostName);
        // В качестве альтернативы то же самое можно сделать, как это
        // Driver.navigate () к ("http://www.google.com").

        // Найти элемент ввода текста по его имени
        WebElement elementLog = driver.findElement(By.name("j_username"));
//        очистип поле ввода
        elementLog.clear();
        // Введите логин
        elementLog.sendKeys(userName);

        // Найти элемент ввода текста по его имени
        WebElement elementPass = driver.findElement(By.name("j_password"));
//        Очистим поле ввода
        elementPass.clear();
//        введите пароль
        elementPass.sendKeys(password);

//        нажимаем Войти
        driver.findElement(By.id("submitlink")).click();
//явное ожидание загрузки страницы
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.className("gwt-MenuItem")));

// в меню ищем Инвентаризация, и нажимаем
        List<WebElement> webElements = driver.findElements(By.className("gwt-MenuItem"));
        for (WebElement we : webElements) {
            if (we.getText().equals("Инвентаризация")) {
                we.click();
                break;
            }
        }
//явное ожидание загрузки страницы
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.className("menuPopupMiddle")));

// ищем в списке Поступление, Инвентарная книга музейных экспонатов и нажимаем
        List<WebElement> webElements1 = driver.findElements(By.className("gwt-MenuItem"));

        for (WebElement we : webElements1) {
            if (we.getText().equals("Инвентарная книга музейных экспонатов")) {
                we.click();
                break;
            }
        }


//явное ожидание загрузки страницы
        (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("html/body/div[2]/div/div[2]/div/div/div/div[3]/div/div/table/tbody/tr[2]/td[1]")));
        driver.findElement(By.xpath("html/body/div[2]/div/div[2]/div/div/div/div[3]/div/div/table/tbody/tr[2]/td[1]")).click();
        driver.findElement(By.xpath("html/body/div[2]/div/div[2]/div/div/div/div[2]/div/div[3]/img")).click();
//явное ожидание загрузки страницы Инвентарная книга музейных экспонатов : Редактирование
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("html/body/div[4]/div/div/div/div/div/div[1]/div[2]/table/tbody/tr[1]/td/table/tbody/tr/td[4]/div/div/div")));
//        переключаемся на вкладку Фотография
        driver.findElement(By.xpath("html/body/div[4]/div/div/div/div/div/div[1]/div[2]/table/tbody/tr[1]/td/table/tbody/tr/td[4]/div/div/div")).click();
        //явное ожидание загрузки страницы Инвентарная книга музейных экспонатов : Редактирование
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("html/body/div[4]/div/div/div/div/div/div[1]/div[2]/table/tbody/tr[2]/td/div/div[3]/div/div/div/div/table/tbody/tr/td[2]/div/form/table/tbody/tr[2]/td[1]/div/div")));

        driver.findElement(By.className("gwt-FileUpload")).sendKeys("/media/dmitriy/9C080D88080D629E/inout/image001.png");
//загрузить
//        driver.findElement(By.xpath("html/body/div[4]/div/div/div/div/div/div[1]/div[2]/table/tbody/tr[2]/td/div/div[3]/div/div/div/div/table/tbody/tr/td[2]/div/form/table/tbody/tr[2]/td[1]/div/div")).click();
////        сделать скрин экрана
//
//        screenShot(driver);

////        сохранить
//        driver.findElement(By.xpath("html/body/div[4]/div/div/div/div/div/div[1]/div[2]/div[3]/div")).click();


//    }
//Делаем скриншот
        File file= WorkWithScreenshots.screenShot(driver);
//        Записываем в лог
        log.info("Информация. Скриншот: " + WorkWithScreenshots.getPathScreenShot(file));
//        сохранить
        driver.findElement(By.xpath("html/body/div[4]/div/div/div/div/div/div[1]/div[2]/div[3]/div")).click();

    }

////медот возвращает название скриншота
//    public static String screenShotGetName(File screenshot){
//        String nameScreenShot=screenshot.getName();
//        return nameScreenShot;
//    }
}
