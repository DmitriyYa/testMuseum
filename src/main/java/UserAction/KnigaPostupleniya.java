package UserAction;

import Helppers.MyWait;
import Helppers.NaimenivaniePredmetaList;
import Helppers.Nomer;
import Helppers.WorkWithPropertyFile;
import PageObjects.PageEdit;
import PageObjects.PageKnigaPostupleniSozdanie;
import PageObjects.PageMain;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Properties;

/**
 * Created by dima on 01.11.16.
 */
public class KnigaPostupleniya {

    //подключаем логи
    private static final Logger log = Logger.getLogger(AktPrijoma.class.getName());

    //подключаем проперти файл
    private static Properties properties = WorkWithPropertyFile.createProperti();
    private static int vsegoPredIzAktaPri = Integer.parseInt(properties.getProperty("vsegoPredIzAktaPri"));

    public static WebDriver createKnigaPostupleniya(WebDriver driver) {

// Ищем в меню Поступление
        PageMain.menu(driver, "Поступление").click();


        // ищем в списке Поступление, Книга поступлений и нажимаем
        PageMain.menu(driver, "Книга поступлений").click();

        //явное ожидание загрузки страницы
        MyWait.myWaitXPath(driver, 10, ".//*[@id='unit']/div/div[2]/div/div[1]/img");

//   создаем столько записей в книге послуплений, сколько создали актов послуплений
        for (int i = 0; i < vsegoPredIzAktaPri; i++) {

            //Жмем Книга поступлений Создать
            PageMain.btn_Create(driver).click();

            //Явное ожидание
//        (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("html/body/div[4]/div/div/div/div/div/div[1]/div[2]/table/tbody/tr[2]/td/div/div[1]/div/div/div/div/div/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[3]/div/div/img")));
            MyWait.myWaitXPath(driver, 10, "html/body/div[4]/div/div/div/div/div/div[1]/div[2]/table/tbody/tr[2]/td/div/div[1]/div/div/div/div/div/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[3]/div/div/img");

            //нажимаем фильтр Акт приема
            PageKnigaPostupleniSozdanie.btn_AktPtijoma(driver).click();

            //Явное ожидание
//        (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("html/body/div[5]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/table/tbody/tr/td/div/div[3]/div/div/table/tbody/tr[2]/td[1]")));
            MyWait.myWaitXPath(driver, 10, "html/body/div[5]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/table/tbody/tr/td/div/div[3]/div/div/table/tbody/tr[2]/td[1]");

//        Жмем Изменить
            PageEdit.btn_Izmen(driver).click();

            //Явное ожидание
//        (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("html/body/div[6]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/table/tbody/tr/td[2]/div/input")));
            MyWait.myWaitXPath(driver, 10, "html/body/div[6]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/table/tbody/tr/td[2]/div/input");

//        очистить
            PageEdit.txt_ZapNaStr(driver).clear();

//вводим кол-во записей на странице
            PageEdit.txt_ZapNaStr(driver).sendKeys("50");

//жмем Сохранить кол-во записей
            PageEdit.btn_Save(driver).click();

            //Явное ожидание
//        (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("html/body/div[5]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/table/tbody/tr/td/div/div[3]/div/div/table/tbody")));
            MyWait.myWaitXPath(driver, 20, "html/body/div[5]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/table/tbody/tr/td/div/div[3]/div/div/table/tbody");

//        Ищем элемент в таблице и нажимаем
            PageEdit.str_TableElement(driver, Integer.toString(Nomer.getNomer())).click();


//Жмем ВЫбрать
            PageEdit.btn_Ok(driver).click();


            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //Явное ожидание
//        (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("html/body/div[4]/div/div/div/div/div/div[1]/div[2]/table/tbody/tr[2]/td/div/div[1]/div/div/div/div/div/table/tbody/tr[11]/td/div/div[3]/div")));
            MyWait.myWaitXPath(driver, 10, "html/body/div[4]/div/div/div/div/div/div[1]/div[2]/table/tbody/tr[2]/td/div/div[1]/div/div/div/div/div/table/tbody/tr[11]/td/div/div[3]/div");

            //Выбираем Наименование предмета
            PageKnigaPostupleniSozdanie.btn_NaimenovaniePredmeta(driver).click();

            //Явное ожидание
//        (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("html/body/div[5]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/table/tbody/tr/td/div/div[3]/div/div/table/tbody/tr[2]/td[1]")));
            MyWait.myWaitXPath(driver, 10, "html/body/div[5]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/table/tbody/tr/td/div/div[3]/div/div/table/tbody/tr[2]/td[1]");

//проверяем наличие предметов в списке
            if (NaimenivaniePredmetaList.getNaimenovaniePredmetaList().size() > 0) {
                //Выбираем наименование предмета из списка
                PageEdit.str_TableElement(driver, NaimenivaniePredmetaList.getNaimenovaniePredmetaList().get(i)).click();

                //нажимаем Выбрать
                PageEdit.btn_Ok(driver).click();

                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //Сохранить
                PageKnigaPostupleniSozdanie.btn_Save(driver).click();

                //явное ожидание загрузки страницы
                MyWait.myWaitXPath(driver, 10, "html/body/div[2]/div/div[2]/div/div/div/div[3]/div/div/table/tbody/tr[2]/td[1]");
            } else {
                PageEdit.btn_NotOk(driver).click();
            }

        }
        return driver;
    }
}
