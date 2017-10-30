package kz.jazzsoft.museum.pageObjects;

import kz.jazzsoft.museum.helpers.SearchComboBack;
import kz.jazzsoft.museum.helpers.SearchTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by dima on 24.11.16.
 */
public class PageAktPrijomaNaMOH {
    private static WebElement element = null;

    /**
     * @param driver
     * @return Radiobutton Вид акта, стандартная форма
     */
    public static WebElement rbut_VidAktaStForm(WebDriver driver) {
        element = driver.findElement(By.xpath("html/body/div[4]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/div/table/tbody/tr[1]/td[2]/div/span[1]/input"));
        return element;
    }

    /**
     * @param driver
     * @return Radiobutton Вид акта,Изменение группы коллекций
     */
    public static WebElement rbut_VidAktaIzmGrKol(WebDriver driver) {
        element = driver.findElement(By.xpath("html/body/div[4]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/div/table/tbody/tr[1]/td[2]/div/span[2]/input"));
        return element;
    }


    /**
     * @param driver
     * @return текстовое поле № Акта приема на мат.-отв. хранение
     */
    public static WebElement txtbx_AktPtijomaNaMOH(WebDriver driver) {
        element = driver.findElement(By.xpath("html/body/div[4]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/div/table/tbody/tr[2]/td[2]/div/input"));
        return element;
    }


    /**
     * @param driver
     * @return текстовое поле Дата акта приема на мат.-отв. хранение День
     */
    public static WebElement txtbx_DataAktPtijomaNaMOHDya(WebDriver driver) {
        element = driver.findElement(By.xpath("html/body/div[4]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/div/table/tbody/tr[3]/td[2]/div/table/tbody/tr/td[1]/div/input[1]"));
        return element;
    }


    /**
     * @param driver
     * @return текстовое поле Дата акта приема на мат.-отв. хранение Месяц
     */
    public static WebElement txtbx_DataAktPtijomaNaMOHMonth(WebDriver driver) {
        element = driver.findElement(By.xpath("html/body/div[4]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/div/table/tbody/tr[3]/td[2]/div/table/tbody/tr/td[1]/div/input[2]"));
        return element;
    }

    /**
     * @param driver
     * @return текстовое поле Дата акта приема на мат.-отв. хранение Год
     */
    public static WebElement txtbx_DataAktPtijomaNaMOHYear(WebDriver driver) {
        element = driver.findElement(By.xpath("html/body/div[4]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/div/table/tbody/tr[3]/td[2]/div/table/tbody/tr/td[1]/div/input[3]"));
        return element;
    }

    /**
     * @param driver
     * @return кнопка Вид фонда
     */
    public static WebElement btn_VidFonda(WebDriver driver) {
        element = driver.findElement(By.xpath("html/body/div[4]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/div/table/tbody/tr[11]/td[2]/div/table/tbody/tr/td[3]/div/div/img"));
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
     * @return кнопка Группа коллекций
     */
    public static WebElement btn_GruppaKollek(WebDriver driver) {
        element = driver.findElement(By.xpath("html/body/div[4]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/div/table/tbody/tr[15]/td[2]/div/table/tbody/tr/td[3]/div/div/img"));

        return element;
    }

    /**
     * @param driver
     * @return the выбор из комбо бокса Группа коллекций
     */
    public static WebElement combox_GruppaKollek(WebDriver driver, String gruppaKollek) {
        WebElement combo = driver.findElement(By.xpath("html/body/div[5]/div/div/div/div/div"));
        element = SearchComboBack.searchComboBack(combo, gruppaKollek);
        return element;
    }

    /**
     * @param driver
     * @return the текстовое поле 1 экземпляр
     */
    public static WebElement txtbx_ExemplOne(WebDriver driver) {
        element = driver.findElement(By.xpath("html/body/div[4]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/div/table/tbody/tr[20]/td[2]/div/input"));
        return element;
    }

    /**
     * @param driver
     * @return the текстовое поле 1 экземпляр (каз.)
     */
    public static WebElement txtbx_ExemplOneKz(WebDriver driver) {
        element = driver.findElement(By.xpath("html/body/div[4]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/div/table/tbody/tr[21]/td[2]/div/input"));
        return element;
    }

    /**
     * @param driver
     * @return the текстовое поле 2 экземпляр
     */
    public static WebElement txtbx_ExemplTwo(WebDriver driver) {
        element = driver.findElement(By.xpath("html/body/div[4]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/div/table/tbody/tr[22]/td[2]/div/input"));
        return element;
    }

    /**
     * @param driver
     * @return the текстовое поле 2 экземпляр (каз.)
     */
    public static WebElement txtbx_ExemplTwoKz(WebDriver driver) {
        element = driver.findElement(By.xpath("html/body/div[4]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/div/table/tbody/tr[23]/td[2]/div/input"));
        return element;
    }

    /**
     * @param driver
     * @return кнопка Добавить предметы из акта приема
     */
    public static WebElement btn_DobavPredmIzAktPrijoma(WebDriver driver) {
        element = driver.findElement(By.xpath("html/body/div[4]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/div/table/tbody/tr[24]/td/div/div[2]/div/div[1]/img"));
        return element;
    }

/**
     * @param driver
     * @return кнопка Сохранить
     */
    public static WebElement btn_Ok(WebDriver driver) {
        element = driver.findElement(By.xpath("html/body/div[4]/div/div/div/div/div/div[1]/div[2]/div[4]/div"));
        return element;
    }

/**
     * @param driver
     * @return кнопка Отмена
     */
    public static WebElement btn_NotOk(WebDriver driver) {
        element = driver.findElement(By.xpath("html/body/div[4]/div/div/div/div/div/div[1]/div[2]/div[3]/div"));
        return element;
    }


//  внутренний класс окна - Выбор предметов для регистрации акта приема на материльано-ответственное хранение

    public static class ViborPredmetaRegAktaPrijNaMOH {
        private static WebElement element;

        /**
         * @param driver
         * @return Акт приема, элемент таблицы
         */
        public static WebElement str_TableElementAktPri(WebDriver driver, String elementTable) {
            WebElement table = driver.findElement(By.xpath("html/body/div[5]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/table/tbody/tr[1]/td/div/div[3]/div/div/table/tbody"));
            element = SearchTable.searchTableAttribute(table, elementTable);
            return element;
        }

        /**
         * @param driver
         * @return Акт приема, кнопка Просмотр
         */
        public static WebElement btn_ReviewAktPri(WebDriver driver) {
            element = driver.findElement(By.xpath("html/body/div[5]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/table/tbody/tr[1]/td/div/div[2]/div[1]/div[2]/img"));
            return element;
        }

        /**
         * @param driver
         * @return Акт приема, кнопка Фильтр
         */
        public static WebElement btn_FilterNotOkAktPri(WebDriver driver) {
            element = driver.findElement(By.xpath("html/body/div[5]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/table/tbody/tr[1]/td/div/div[2]/div[2]/img"));
            return element;
        }

        /**
         * @param driver
         * @return Акт приема, кнопка Cледующая страница
         */
        public static WebElement btn_NextPageAktPri(WebDriver driver) {
            element = driver.findElement(By.xpath("html/body/div[5]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/table/tbody/tr[1]/td/div/div[2]/table/tbody/tr/td[5]/div/div/img"));
            return element;
        }

        /**
         * @param driver
         * @return Акт приема, кнопка Изменить
         */
        public static WebElement btn_IzmenAktPri(WebDriver driver) {
            element = driver.findElement(By.xpath("html/body/div[5]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/table/tbody/tr[1]/td/div/div[2]/table/tbody/tr/td[8]/div/div"));
            return element;
        }

        /**
         * @param driver
         * @return Предмет из акта приема, элемент таблицы
         */
        public static WebElement str_TableElementPredmIzAktPri(WebDriver driver, int i) {
            WebElement table = driver.findElement(By.xpath("html/body/div[5]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/table/tbody/tr[2]/td/div/div[3]/div/div/table/tbody"));
            element = SearchTable.searchTablePosition(table,i);
            return element;
        }

        /**
         * @param driver
         * @return Акт приема, кнопка Просмотр
         */
        public static WebElement btn_ReviewPredmIzAktPri(WebDriver driver) {
            element = driver.findElement(By.xpath("html/body/div[5]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/table/tbody/tr[2]/td/div/div[2]/div[1]/div[2]/img"));
            return element;
        }

        /**
         * @param driver
         * @return Акт приема, кнопка Добавить
         */
        public static WebElement btn_AddPredmIzAktPri(WebDriver driver) {
            element = driver.findElement(By.xpath("html/body/div[5]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/table/tbody/tr[2]/td/div/div[2]/div[1]/div[6]/img"));
            return element;
        }

        /**
         * @param driver
         * @return Акт приема, кнопка Фильтр
         */
        public static WebElement btn_FilterPredmIzAktPri(WebDriver driver) {
            element = driver.findElement(By.xpath("html/body/div[5]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/table/tbody/tr[2]/td/div/div[2]/div[2]/img"));
            return element;
        }

        /**
         * @param driver
         * @return Предметы из акта приема, кнопка Cледующая страница
         */
        public static WebElement btn_NextPagePredmIzAktPri(WebDriver driver) {
            element = driver.findElement(By.xpath("html/body/div[5]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/table/tbody/tr[2]/td/div/div[2]/table/tbody/tr/td[5]/div/div/img"));
            return element;
        }

        /**
         * @param driver
         * @return Предметы из акта приема, кнопка Изменить
         */
        public static WebElement btn_IzmenPredmIzAktPri(WebDriver driver) {
            element = driver.findElement(By.xpath("html/body/div[5]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/table/tbody/tr[2]/td/div/div[2]/table/tbody/tr/td[8]/div/div"));
            return element;
        }


        /**
         * @param driver
         * @return ВЫбранный предмет из Предметы из акта приема, элемент таблицы
         */
        public static WebElement str_TableElementSelectPredmIzAktPri(WebDriver driver, int i) {
            WebElement table = driver.findElement(By.xpath("html/body/div[5]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/table/tbody/tr[3]/td/div/div[3]/div/div/table/tbody"));
            element = SearchTable.searchTablePosition(table,i);
            return element;
        }

        /**
         * @param driver
         * @return ВЫбранный предмет из акта приема, кнопка Удалить
         */
        public static WebElement btn_DeletSelectPredmIzAktPri(WebDriver driver) {
            element = driver.findElement(By.xpath("html/body/div[5]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/table/tbody/tr[3]/td/div/div[2]/div/div[4]/img"));
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
        public static WebElement btn_SaveZapNaStr(WebDriver driver) {
            element = driver.findElement(By.xpath("html/body/div[6]/div/div/div/div/div/div[1]/div[2]/div[4]/div"));
            return element;
        }
/**
         * @param driver
         * @return кнопка Сохранить страницу
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

    }

}
