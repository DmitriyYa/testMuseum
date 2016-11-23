package UserAction;

import Helppers.MyWait;
import Helppers.NaimenivaniePredmetaList;
import PageObjects.PageAktPrijomaSozdanie;
import PageObjects.PageCreateViewEdit;
import PageObjects.PageEdit;
import PageObjects.PageMain;
import Helppers.WorkWithPropertyFile;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.util.*;


/**
 * Created by dmitriy on 13.10.16.
 */
public class AktPrijoma {

    //подключаем логи
    public static final Logger log = Logger.getLogger(AktPrijoma.class.getName());


    //подключаем проперти файл
    private static Properties properties = WorkWithPropertyFile.createProperti();
    private static final int vsegoPredIzAktaPri = Integer.parseInt(properties.getProperty("vsegoPredIzAktaPri"));
    private static final String kolPredIzAktaPri = properties.getProperty("kolPredIzAktaPri");


    //    Генерим номер акта прием и протокола решения ФОК
    private static int nomer = new Random().nextInt(10000);

    public static int getNomer() {
        return nomer;
    }

//    public static void setNomer(int nomer) {
//        AktPrijoma.nomer = nomer;
//    }


    public static WebDriver createAktPrijoma(WebDriver driver) {


        log.info("Вошли в систему");


        // в меню ищем Поступление, и нажимаем
        PageMain.menu(driver, "Поступление").click();

        //явное ожидание загрузки страницы
//        (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.className("menuPopupMiddle")));
        MyWait.myWaitClassName(driver, 10, "menuPopupMiddle");

        // ищем в списке Поступление, Акт пиёма и нажимаем
        PageMain.menu(driver, "Акт приёма").click();


        //явное ожидание загрузки страницы
//        (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='unit']/div/div[2]/div/div[1]/img")));
        MyWait.myWaitXPath(driver, 10, ".//*[@id='unit']/div/div[2]/div/div[1]/img");

        log.error("Что-то случилось!");

        //Жмем Акт приема Создать
        PageMain.btn_Create(driver).click();

        //явное ожидание загрузки страницы
//        (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("html/body/div[4]/div/div/div/div/div/div[1]/div[2]/table/tbody/tr[2]/td/div/div[1]/div/div/div/div/div/table/tbody/tr[1]/td[2]/div/input")));
        MyWait.myWaitXPath(driver, 10, "html/body/div[4]/div/div/div/div/div/div[1]/div[2]/table/tbody/tr[2]/td/div/div[1]/div/div/div/div/div/table/tbody/tr[1]/td[2]/div/input");

        //заполняем акт приёма
        PageAktPrijomaSozdanie.txtbx_AktPtijoma(driver).sendKeys(Integer.toString(nomer));

        //создаем текущую Дату
        Date date = new Date();
        SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy");
        String[] s = format1.format(date).split("\\.");

        //заполняем Дата акта приема, текущей датой
        PageAktPrijomaSozdanie.txtbx_DataAktPtijomaDya(driver).sendKeys(s[0]);
        PageAktPrijomaSozdanie.txtbx_DataAktPtijomaMonth(driver).sendKeys(s[1]);
        PageAktPrijomaSozdanie.txtbx_DataAktPtijomaYear(driver).sendKeys(s[2]);

        //вывбираем Вид фонда
        PageAktPrijomaSozdanie.btn_VidFonda(driver).click();
//        явное ожидание
//        (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("html/body/div[5]/div/div/div/div/div/div[2]/div[2]")));
        MyWait.myWaitXPath(driver, 10, "html/body/div[5]/div/div/div/div/div/div[2]/div[2]");
        PageAktPrijomaSozdanie.combox_VidFonda(driver, "основной").click();


        //ФИО Директора
        PageAktPrijomaSozdanie.btn_FIODorectora(driver).click();
//       явное ожидание
//        (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("html/body/div[5]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/table/tbody/tr/td/div/div[3]/div/div/table/tbody/tr[2]/td[1]")));
        MyWait.myWaitXPath(driver, 10, "html/body/div[5]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/table/tbody/tr/td/div/div[3]/div/div/table/tbody/tr[2]/td[1]");
        PageEdit.str_TableElement(driver, "заместитель директора").click();
        PageEdit.btn_Ok(driver).click();

        //№ протокола решения ФОК
        PageAktPrijomaSozdanie.txtbx_NomerProtokolaReshFOK(driver).sendKeys(Integer.toString(nomer));

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
//            (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("html/body/div[5]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/div/table/tbody/tr[2]/td[2]/div/input")));
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
//        (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.className("gwt-MenuItem")));
        MyWait.myWaitClassName(driver, 10, "gwt-MenuItem");
        return driver;

    }


}
