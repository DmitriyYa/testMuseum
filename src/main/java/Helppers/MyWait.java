package Helppers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by dima on 21.11.16.
 */
public class MyWait {

    /*
     //явное ожидание загрузки страницы по XPath
     */
    public static void myWaitXPath(WebDriver driver, int watSeconds, String stringEllement) {
        (new WebDriverWait(driver, watSeconds)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(stringEllement)));
    }

    /*
     //явное ожидание загрузки страницы по ClassName
     */
    public static void myWaitClassName(WebDriver driver, int watSeconds, String stringEllement) {
        (new WebDriverWait(driver, watSeconds)).until(ExpectedConditions.presenceOfElementLocated(By.className(stringEllement)));
    }

    /*
     //явное ожидание загрузки страницы по name
     */
    public static void myWaitName(WebDriver driver, int watSeconds, String stringEllement) {
        (new WebDriverWait(driver, watSeconds)).until(ExpectedConditions.presenceOfElementLocated(By.name(stringEllement)));
    }

    /*
     //явное ожидание загрузки страницы по id
     */
    public static void myWaitId(WebDriver driver, int watSeconds, String stringEllement) {
        (new WebDriverWait(driver, watSeconds)).until(ExpectedConditions.presenceOfElementLocated(By.id(stringEllement)));
    }

}
