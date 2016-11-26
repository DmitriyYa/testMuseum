package PageObjects;

import Helppers.SearchComboBack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by dima on 15.11.16.
 */
public class PageAktPrijomaSozdanie {
    private static WebElement element = null;

    /**
     * @param driver
     * @return the текстовое поле № Акта приема
     */
    public static WebElement txtbx_AktPtijoma(WebDriver driver) {
        element = driver.findElement(By.xpath("html/body/div[4]/div/div/div/div/div/div[1]/div[2]/table/tbody/tr[2]/td/div/div[1]/div/div/div/div/div/table/tbody/tr[1]/td[2]/div/input"));
        return element;
    }

    /**
     * @param driver
     * @return the текстовое поле Дата акта приема День
     */
    public static WebElement txtbx_DataAktPtijomaDya(WebDriver driver) {
        element = driver.findElement(By.xpath("html/body/div[4]/div/div/div/div/div/div[1]/div[2]/table/tbody/tr[2]/td/div/div[1]/div/div/div/div/div/table/tbody/tr[2]/td[2]/div/table/tbody/tr/td[1]/div/input[1]"));
        return element;
    }


    /**
     * @param driver
     * @return the текстовое поле Дата акта приема Месяц
     */
    public static WebElement txtbx_DataAktPtijomaMonth(WebDriver driver) {
        element = driver.findElement(By.xpath("html/body/div[4]/div/div/div/div/div/div[1]/div[2]/table/tbody/tr[2]/td/div/div[1]/div/div/div/div/div/table/tbody/tr[2]/td[2]/div/table/tbody/tr/td[1]/div/input[2]"));
        return element;
    }


    /**
     * @param driver
     * @return  текстовое поле Дата акта приема Год
     */
    public static WebElement txtbx_DataAktPtijomaYear(WebDriver driver) {
        element = driver.findElement(By.xpath("html/body/div[4]/div/div/div/div/div/div[1]/div[2]/table/tbody/tr[2]/td/div/div[1]/div/div/div/div/div/table/tbody/tr[2]/td[2]/div/table/tbody/tr/td[1]/div/input[3]"));
        return element;
    }

    /**
     * @param driver
     * @return  кнопка Вид фонда
     */
    public static WebElement btn_VidFonda(WebDriver driver) {
        element = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/div[1]/div[2]/table/tbody/tr[2]/td/div/div[1]/div/div/div/div/div/table/tbody/tr[3]/td[2]/div/table/tbody/tr/td[3]/div/div/img"));
        return element;
    }


    /**
     * @param driver
     * @return the выбор из комбо бокса Вид фонда
     */
    public static WebElement combox_VidFonda(WebDriver driver, String vidFonda) {
        WebElement combo = driver.findElement(By.xpath("html/body/div[5]/div/div/div/div/div"));
        element = SearchComboBack.searchComboBack(combo, vidFonda);
        return element;
    }

    /**
     * @param driver
     * @return the кнопка фильтра выбора из таблицы ФИО Директора
     */
    public static WebElement btn_FIODorectora(WebDriver driver) {
        element = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/div[1]/div[2]/table/tbody/tr[2]/td/div/div[1]/div/div/div/div/div/table/tbody/tr[4]/td[2]/div/table/tbody/tr/td[3]/div/div/img"));
        return element;
    }



    /**
     * @param driver
     * @return the текстовое поле № протокола решения ФОК
     */
    public static WebElement txtbx_NomerProtokolaReshFOK(WebDriver driver) {
        element = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/div[1]/div[2]/table/tbody/tr[2]/td/div/div[1]/div/div/div/div/div/table/tbody/tr[8]/td[2]/div/input"));
        return element;
    }

    /**
     * @param driver
     * @return the текстовое поле Дата протокола решения День
     */
    public static WebElement txtbx_DataProtokolaReshDya(WebDriver driver) {
        element = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/div[1]/div[2]/table/tbody/tr[2]/td/div/div[1]/div/div/div/div/div/table/tbody/tr[9]/td[2]/div/table/tbody/tr/td[1]/div/input[1]"));
        return element;
    }


    /**
     * @param driver
     * @return the текстовое поле Дата протокола решения Месяц
     */
    public static WebElement txtbx_DataProtokolaReshMonth(WebDriver driver) {
        element = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/div[1]/div[2]/table/tbody/tr[2]/td/div/div[1]/div/div/div/div/div/table/tbody/tr[9]/td[2]/div/table/tbody/tr/td[1]/div/input[2]"));
        return element;
    }


    /**
     * @param driver
     * @return the текстовое поле Дата протокола решения Год
     */
    public static WebElement txtbx_DataProtokolaReshYear(WebDriver driver) {
        element = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/div[1]/div[2]/table/tbody/tr[2]/td/div/div[1]/div/div/div/div/div/table/tbody/tr[9]/td[2]/div/table/tbody/tr/td[1]/div/input[3]"));
        return element;
    }


    /**
     * @param driver
     * @return the текстовое поле 1 экземпляр
     */
    public static WebElement txtbx_ExemplOne(WebDriver driver) {
        element = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/div[1]/div[2]/table/tbody/tr[2]/td/div/div[1]/div/div/div/div/div/table/tbody/tr[21]/td[2]/div/input"));
        return element;
    }

    /**
     * @param driver
     * @return the текстовое поле 1 экземпляр (каз.)
     */
    public static WebElement txtbx_ExemplOneKz(WebDriver driver) {
        element = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/div[1]/div[2]/table/tbody/tr[2]/td/div/div[1]/div/div/div/div/div/table/tbody/tr[22]/td[2]/div/input"));
        return element;
    }

    /**
     * @param driver
     * @return the текстовое поле 2 экземпляр
     */
    public static WebElement txtbx_ExemplTwo(WebDriver driver) {
        element = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/div[1]/div[2]/table/tbody/tr[2]/td/div/div[1]/div/div/div/div/div/table/tbody/tr[23]/td[2]/div/input"));
        return element;
    }

    /**
     * @param driver
     * @return the текстовое поле 2 экземпляр (каз.)
     */
    public static WebElement txtbx_ExemplTwoKz(WebDriver driver) {
        element = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/div[1]/div[2]/table/tbody/tr[2]/td/div/div[1]/div/div/div/div/div/table/tbody/tr[24]/td[2]/div/input"));
        return element;
    }

    /**
     * @param driver
     * @return the кнопка Предмет из акта приема
     */
    public static WebElement btn_PredmetIzAktePriema(WebDriver driver) {
        element = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/div[1]/div[2]/table/tbody/tr[1]/td/table/tbody/tr/td[3]/div/div/div"));
        return element;
    }

    /**
     * @param driver
     * @return  Предмет из акта приема кнопка Создание
     */
    public static WebElement btn_PredmetIzAktePriemaSozdanie(WebDriver driver) {
        element = driver.findElement(By.xpath("html/body/div[4]/div/div/div/div/div/div[1]/div[2]/table/tbody/tr[2]/td/div/div[2]/div/div/div/div/div/table/tbody/tr[1]/td/div/div[2]/div/div[1]/img"));
        return element;
    }

/**
     * @param driver
     * @return  Предмет из акта приема окно Создание Наименование предмета
     */
    public static WebElement txt_PredmetIzAktePriemaSozdanieNaimenovaniePredm(WebDriver driver) {
        element = driver.findElement(By.xpath("html/body/div[5]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/div/table/tbody/tr[2]/td[2]/div/input"));
        return element;
    }

/**
     * @param driver
     * @return  Предмет из акта приема окно Создание Наименование предмета Каз
     */
    public static WebElement txt_PredmetIzAktePriemaSozdanieNaimenovaniePredmKz(WebDriver driver) {
        element = driver.findElement(By.xpath("html/body/div[5]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/div/table/tbody/tr[3]/td[2]/div/input"));
        return element;
    }

/**
     * @param driver
     * @return  Предмет из акта приема окно Создание Количество
     */
    public static WebElement txt_PredmetIzAktePriemaSozdanieKolichestvo(WebDriver driver) {
        element = driver.findElement(By.xpath("html/body/div[5]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/div/table/tbody/tr[6]/td[2]/div/input"));
        return element;
    }


/**
     * @param driver
     * @return  Предмет из акта приема окно Создание кнопка Сохранить
     */
    public static WebElement btn_PredmetIzAktePriemaSozdanieSohranit(WebDriver driver) {
        element = driver.findElement(By.xpath("html/body/div[5]/div/div/div/div/div/div[1]/div[2]/div[4]/div"));
        return element;
    }

///**
//     * @param driver
//     * @return  Акт приема окно Создание кнопка Сохранить
//     */
//    public static WebElement btn_AktPriemaSozdanieSohranit(WebDriver driver) {
//        element = driver.findElement(By.xpath("html/body/div[4]/div/div/div/div/div/div[1]/div[2]/div[3]/div"));
//        return element;
//    }


}
