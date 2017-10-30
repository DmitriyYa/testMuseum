package kz.jazzsoft.museum.pageObjects;

import kz.jazzsoft.museum.helpers.SearchTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by dima on 17.11.16.
 */
public class PageEdit {
    private static WebElement element = null;

    /**
     * @param driver
     * @return элемент таблицы
     */
    public static WebElement str_TableElement(WebDriver driver, String elementTable) {
        WebElement table = driver.findElement(By.xpath("html/body/div[5]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/table/tbody/tr/td/div/div[3]/div/div/table/tbody"));
        element = SearchTable.searchTableAttribute(table, elementTable);
        return element;
    }

    /**
     * @param driver
     * @return кнопка Выбрать
     */
    public static WebElement btn_Ok(WebDriver driver) {
        element = driver.findElement(By.xpath("html/body/div[5]/div/div/div/div/div/div[1]/div[2]/div[4]/div"));
        return element;
    }

    /**
     * @param driver
     * @return кнопка Отмена
     */
    public static WebElement btn_NotOk(WebDriver driver) {
        element = driver.findElement(By.xpath("html/body/div[5]/div/div/div/div/div/div[1]/div[2]/div[3]/div"));
        return element;
    }

    /**
     * @param driver
     * @return кнопка Cледующая страница
     */
    public static WebElement btn_NextPage(WebDriver driver) {
        element = driver.findElement(By.xpath("html/body/div[5]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/table/tbody/tr/td/div/div[2]/table/tbody/tr/td[5]/div/div/img"));
        return element;
    }

    /**
     * @param driver
     * @return кнопка Изменить
     */
    public static WebElement btn_Izmen(WebDriver driver) {
        element = driver.findElement(By.xpath("html/body/div[5]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/table/tbody/tr/td/div/div[2]/table/tbody/tr/td[8]/div/div"));
        return element;
    }

    /**
     * @param driver
     * @return поле Записей на странице
     */
    public static WebElement txt_ZapNaStr(WebDriver driver) {
        element = driver.findElement(By.xpath("html/body/div[6]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/table/tbody/tr/td[2]/div/input"));
        return element;
    }

/**
     * @param driver
     * @return кнопка Сохранить кол-во записей
     */
    public static WebElement btn_Save(WebDriver driver) {
        element = driver.findElement(By.xpath("html/body/div[6]/div/div/div/div/div/div[1]/div[2]/div[4]/div"));
        return element;
    }


}
