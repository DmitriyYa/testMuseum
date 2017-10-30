package kz.jazzsoft.museum.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by dima on 17.11.16.
 */
public class PageKnigaPostupleniSozdanie {
    private static WebElement element = null;

    /**
     * @param driver
     * @return кнопка фильтр № Акта приема
     */
    public static WebElement btn_AktPtijoma(WebDriver driver) {
        element = driver.findElement(By.xpath("html/body/div[4]/div/div/div/div/div/div[1]/div[2]/table/tbody/tr[2]/td/div/div[1]/div/div/div/div/div/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[3]/div/div/img"));
        return element;
    }

    /**
     * @param driver
     * @return кнопка фильтр Наименование предмета
     */
    public static WebElement btn_NaimenovaniePredmeta(WebDriver driver) {
        element = driver.findElement(By.xpath("html/body/div[4]/div/div/div/div/div/div[1]/div[2]/table/tbody/tr[2]/td/div/div[1]/div/div/div/div/div/table/tbody/tr[2]/td[2]/div/table/tbody/tr/td[3]/div/div/img"));
        return element;
    }

    /**
     * @param driver
     * @return кнопка Сохранить
     */
    public static WebElement btn_Save(WebDriver driver) {
        element = driver.findElement(By.xpath("html/body/div[4]/div/div/div/div/div/div[1]/div[2]/div[3]/div"));
        return element;
    }


}
