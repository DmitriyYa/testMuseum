package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by dima on 17.11.16.
 */
public class PageCreateViewEdit {
    private static WebElement element=null;

    /**
     * @param driver
     * @return  кнопка Сохранить
     */
    public static WebElement btn_Save(WebDriver driver) {
        element = driver.findElement(By.xpath("html/body/div[4]/div/div/div/div/div/div[1]/div[2]/div[3]/div"));
        return element;
    }

    /**
     * @param driver
     * @return  кнопка Отмена
     */
    public static WebElement btn_NotOk(WebDriver driver) {
        element = driver.findElement(By.xpath("html/body/div[4]/div/div/div/div/div/div[1]/div[2]/div[2]/div"));
        return element;
    }

    /**
     * @param driver
     * @return  кнопка Справка
     */
    public static WebElement btn_Question(WebDriver driver) {
        element = driver.findElement(By.xpath("html/body/div[4]/div/div/div/div/div/div[1]/div[2]/div[1]/div"));
        return element;
    }
}
