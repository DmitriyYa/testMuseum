package kz.jazzsoft.museum.userActions;

import kz.jazzsoft.museum.pageObjects.PageAktPrijomaSozdanie;
import kz.jazzsoft.museum.pageObjects.PageCreateViewEdit;
import kz.jazzsoft.museum.pageObjects.PageEdit;
import kz.jazzsoft.museum.pageObjects.PageMain;
import kz.jazzsoft.museum.helpers.*;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.util.*;


/**
 * Created by dmitriy on 13.10.16.
 */
public class AktPrijoma {

    //подключаем логи
    public static Logger log = Logger.getLogger(AktPrijoma.class.getName());


    //подключаем проперти файл
    private static Properties properties = WorkWithPropertyFile.createProperti();
    private static final int vsegoPredIzAktaPri = Integer.parseInt(properties.getProperty("vsegoPredIzAktaPri"));
    private static final String kolPredIzAktaPri = properties.getProperty("kolPredIzAktaPri");


    public static WebDriver createAktPrijoma(WebDriver driver) {

        // в меню ищем Поступление, и нажимаем
        PageMain.menu(driver, "Поступление").click();

        //явное ожидание загрузки страницы
        MyWait.myWaitClassName(driver, 10, "menuPopupMiddle");

        // ищем в списке Поступление, Акт пиёма и нажимаем
        PageMain.menu(driver, "Акт приёма").click();


        //явное ожидание загрузки страницы
        MyWait.myWaitXPath(driver, 10, ".//*[@id='unit']/div/div[2]/div/div[1]/img");

        //Жмем Акт приема Создать
        PageMain.btn_Create(driver).click();

        //явное ожидание загрузки страницы
        MyWait.myWaitXPath(driver, 10, "html/body/div[4]/div/div/div/div/div/div[1]/div[2]/table/tbody/tr[2]/td/div/div[1]/div/div/div/div/div/table/tbody/tr[1]/td[2]/div/input");

        //заполняем акт приёма
        PageAktPrijomaSozdanie.txtbx_AktPtijoma(driver).sendKeys(Integer.toString(Nomer.getNomer()));

//        //создаем текущую Дату
        String[] s = CreateDate.createDate();

        //заполняем Дата акта приема, текущей датой
        PageAktPrijomaSozdanie.txtbx_DataAktPtijomaDya(driver).sendKeys(s[0]);
        PageAktPrijomaSozdanie.txtbx_DataAktPtijomaMonth(driver).sendKeys(s[1]);
        PageAktPrijomaSozdanie.txtbx_DataAktPtijomaYear(driver).sendKeys(s[2]);

        //вывбираем Вид фонда
        PageAktPrijomaSozdanie.btn_VidFonda(driver).click();

//        явное ожидание
        MyWait.myWaitXPath(driver, 10, "html/body/div[5]/div/div/div/div/div/div[2]/div[2]");
        PageAktPrijomaSozdanie.combox_VidFonda(driver, "основной").click();


        //ФИО Директора
        PageAktPrijomaSozdanie.btn_FIODorectora(driver).click();

//       явное ожидание
        MyWait.myWaitXPath(driver, 10, "html/body/div[5]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/table/tbody/tr/td/div/div[3]/div/div/table/tbody/tr[2]/td[1]");
        PageEdit.str_TableElement(driver, "заместитель директора").click();
        PageEdit.btn_Ok(driver).click();

        //№ протокола решения ФОК
        PageAktPrijomaSozdanie.txtbx_NomerProtokolaReshFOK(driver).sendKeys(Integer.toString(Nomer.getNomer()));

        //Дата протокола решения
        PageAktPrijomaSozdanie.txtbx_DataProtokolaReshDya(driver).sendKeys(s[0]);
        PageAktPrijomaSozdanie.txtbx_DataProtokolaReshMonth(driver).sendKeys(s[1]);
        PageAktPrijomaSozdanie.txtbx_DataProtokolaReshYear(driver).sendKeys(s[2]);

        //1 экземпляр
        PageAktPrijomaSozdanie.txtbx_ExemplOne(driver).sendKeys("1");

        //1 экземпляр (каз.)
        PageAktPrijomaSozdanie.txtbx_ExemplOneKz(driver).sendKeys("1");

        //2 экземпляр
        PageAktPrijomaSozdanie.txtbx_ExemplTwo(driver).sendKeys("2");

        //2 экземпляр (каз.)
        PageAktPrijomaSozdanie.txtbx_ExemplTwoKz(driver).sendKeys("2");

        //Предмет из акта приема
        PageAktPrijomaSozdanie.btn_PredmetIzAktePriema(driver).click();

        for (int i = 1; i <= vsegoPredIzAktaPri; i++) {
            //Создание
            PageAktPrijomaSozdanie.btn_PredmetIzAktePriemaSozdanie(driver).click();

            //явное ожидание загрузки страницы
            MyWait.myWaitXPath(driver, 10, "html/body/div[5]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/div/table/tbody/tr[2]/td[2]/div/input");
            String naimenovaniePredmeta = "Наименование предмета" + i;
            NaimenivaniePredmetaList.setNaimenovaniePredmetaList(naimenovaniePredmeta);

            //Наименование предмета
            PageAktPrijomaSozdanie.txt_PredmetIzAktePriemaSozdanieNaimenovaniePredm(driver).sendKeys(naimenovaniePredmeta);

            //Наименование предмета каз
            PageAktPrijomaSozdanie.txt_PredmetIzAktePriemaSozdanieNaimenovaniePredmKz(driver).sendKeys("Наименование предмета (каз.)" + i);

            //Количество
            PageAktPrijomaSozdanie.txt_PredmetIzAktePriemaSozdanieKolichestvo(driver).sendKeys(kolPredIzAktaPri);

            //Сохранить
            PageAktPrijomaSozdanie.btn_PredmetIzAktePriemaSozdanieSohranit(driver).click();
        }

        //Сохранить
        PageCreateViewEdit.btn_Save(driver).click();

        //явное ожидание загрузки страницы
        MyWait.myWaitClassName(driver, 10, "gwt-MenuItem");

        log.info("Акт приема создан");
        return driver;

    }


}
