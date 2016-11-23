package PageObjects;

import Helppers.SearchTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by dima on 15.11.16.
 */
public class PageMain {
    private static WebElement element = null;
    /**
     * @param driver
     * @return элемент меню
     */
    public static WebElement menu(WebDriver driver, String nameMenu) {

        List<WebElement> webElements = driver.findElements(By.className("gwt-MenuItem"));
        for (WebElement el : webElements) {
            if (el.getText().equals(nameMenu)) {
                element = el;
                break;
            }
        }
        return element;
    }

    /*
    @param driver
    @return акт из списка актов.
     */
    public static WebElement str_Akt(WebDriver driver, String nomerString) {
        WebElement table = driver.findElement(By.xpath("html/body/div[2]/div/div[2]/div/div/div/div[3]/div/div/table/tbody"));
        element = SearchTable.serchTable(table, nomerString);
        return element;
    }

    /**
     * @param driver
     * @return the button Создать
     */
    public static WebElement btn_Create(WebDriver driver) {
        element = driver.findElement(By.xpath("html/body/div[2]/div/div[2]/div/div/div/div[2]/div/div[1]/img"));
        return element;
    }

    /**
     * @param driver
     * @return the button Просмотр
     */
    public static WebElement btn_Review(WebDriver driver) {
        element = driver.findElement(By.xpath("html/body/div[2]/div/div[2]/div/div/div/div[2]/div/div[2]/img"));
        return element;
    }


    /**
     * @param driver
     * @return the button Редактирование
     */
    public static WebElement btn_Edit(WebDriver driver) {
        element = driver.findElement(By.xpath("html/body/div[2]/div/div[2]/div/div/div/div[2]/div/div[3]/img"));
        return element;
    }


    /**
     * @param driver
     * @return the button  Обновить
     */
    public static WebElement btn_Update(WebDriver driver) {
        element = driver.findElement(By.xpath("html/body/div[2]/div/div[2]/div/div/div/div[2]/div/div[5]/img"));
        return element;
    }


}
