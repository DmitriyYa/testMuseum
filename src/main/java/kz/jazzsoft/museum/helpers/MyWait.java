package kz.jazzsoft.museum.helpers;

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
    public static void myWaitXPath(WebDriver driver, int waitSeconds, String stringElement) {
        (new WebDriverWait(driver, waitSeconds)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(stringElement)));
    }

    /*
     //явное ожидание загрузки страницы по ClassName
     */
    public static void myWaitClassName(WebDriver driver, int waitSeconds, String stringElement) {
        (new WebDriverWait(driver, waitSeconds)).until(ExpectedConditions.presenceOfElementLocated(By.className(stringElement)));
    }

    /*
     //явное ожидание загрузки страницы по name
     */
    public static void myWaitName(WebDriver driver, int waitSeconds, String stringElement) {
        (new WebDriverWait(driver, waitSeconds)).until(ExpectedConditions.presenceOfElementLocated(By.name(stringElement)));
    }

    /*
     //явное ожидание загрузки страницы по id
     */
    public static void myWaitId(WebDriver driver, int waitSeconds, String stringElement) {
        (new WebDriverWait(driver, waitSeconds)).until(ExpectedConditions.presenceOfElementLocated(By.id(stringElement)));
    }

}
