package kz.jazzsoft.museum.userActions;

import kz.jazzsoft.museum.pageObjects.PageAktPrijomaNaMOH;
import kz.jazzsoft.museum.pageObjects.PageMain;
import kz.jazzsoft.museum.helpers.CreateDate;
import kz.jazzsoft.museum.helpers.MyWait;
import kz.jazzsoft.museum.helpers.Nomer;
import kz.jazzsoft.museum.helpers.WorkWithPropertyFile;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

/**
 * Created by dima on 25.11.16.
 */
public class AktPrijomaNaMOH {

    //подключаем логи
    private static Logger log = Logger.getLogger(AktPrijomaNaMOH.class.getName());

    //подключаем проперти файл
    private static Properties properties = WorkWithPropertyFile.loadProperties();
    private static final int vsegoPredIzAktaPri = Integer.parseInt(properties.getProperty("vsegoPredIzAktaPri"));


    public static WebDriver createAktPrijomaNaMOH(WebDriver driver) {

        // Ищем в меню Инвентаризация
        PageMain.menu(driver, "Инвентаризация").click();


        // ищем в списке Инвентаризация, Акт приема на материально-ответственное хранение
        PageMain.menu(driver, "Акт приема на материально-ответственное хранение").click();

        //явное ожидание загрузки страницы
        MyWait.myWaitXPath(driver, 10, "html/body/div[2]/div/div[2]/div/div/div/div[2]/div/div[1]/img");

// жмем Создать Акт приема на материально-ответственное хранение
        PageMain.btn_Create(driver).click();

        //явное ожидание загрузки страницы
        MyWait.myWaitXPath(driver, 10, "html/body/div[4]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/div/table/tbody/tr[2]/td[2]/div/input");

//Вводим номер Акта приема на материально-ответственное хранение
        PageAktPrijomaNaMOH.txtbx_AktPtijomaNaMOH(driver).sendKeys(Integer.toString(Nomer.getNomer()));

//        Создаем текущую дату
        String[] date = CreateDate.createDate();

        //заполняем Дата акта приема, текущей датой

        PageAktPrijomaNaMOH.txtbx_DataAktPtijomaNaMOHDya(driver).sendKeys(date[0]);
        PageAktPrijomaNaMOH.txtbx_DataAktPtijomaNaMOHMonth(driver).sendKeys(date[1]);
        PageAktPrijomaNaMOH.txtbx_DataAktPtijomaNaMOHYear(driver).sendKeys(date[2]);

//        выбираем Вид фонда
        PageAktPrijomaNaMOH.btn_VidFonda(driver).click();
        MyWait.myWaitXPath(driver, 20, "html/body/div[5]/div/div/div/div/div/div[1]");
        PageAktPrijomaNaMOH.combox_VidFonda(driver, "основной").click();

//        Выбираем Группу коллекций
        PageAktPrijomaNaMOH.btn_GruppaKollek(driver).click();
        MyWait.myWaitXPath(driver, 10, "html/body/div[5]/div/div/div/div/div/div[1]/div[2]");
        PageAktPrijomaNaMOH.combox_GruppaKollek(driver, "Предметы материальной культуры").click();

        //1 экземпляр
        PageAktPrijomaNaMOH.txtbx_ExemplOne(driver).sendKeys("1");

        //1 экземпляр (каз.)
        PageAktPrijomaNaMOH.txtbx_ExemplOneKz(driver).sendKeys("1");

        //2 экземпляр
        PageAktPrijomaNaMOH.txtbx_ExemplTwo(driver).sendKeys("2");

        //2 экземпляр (каз.)
        PageAktPrijomaNaMOH.txtbx_ExemplTwoKz(driver).sendKeys("2");

//        Жмем кнопку Добавиль предмет из акт приема
        PageAktPrijomaNaMOH.btn_DobavPredmIzAktPrijoma(driver).click();

//Ждем появления кнопки Изменить
        MyWait.myWaitXPath(driver, 10, "html/body/div[5]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/table/tbody/tr[1]/td/div/div[2]/table/tbody/tr/td[8]/div/div");

//        Ищем акт приема в таблице.
       MyWait.myWaitXPath(driver, 10, "html/body/div[5]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/table/tbody/tr[1]/td/div/div[3]/div/div/table/tbody/tr[20]/td[1]");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        PageAktPrijomaNaMOH.ViborPredmetaRegAktaPrijNaMOH.str_TableElementAktPri(driver, Integer.toString(Nomer.getNomer())).click();

//        Изменяем отображаемый список эелементов в предмет из акта приема
        MyWait.myWaitXPath(driver,10,"html/body/div[5]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/table/tbody/tr[2]/td/div/div[3]/div/div/table/tbody/tr[2]/td[1]");
        PageAktPrijomaNaMOH.ViborPredmetaRegAktaPrijNaMOH.btn_IzmenPredmIzAktPri(driver).click();
        PageAktPrijomaNaMOH.ViborPredmetaRegAktaPrijNaMOH.txt_ZapNaStr(driver).clear();
        PageAktPrijomaNaMOH.ViborPredmetaRegAktaPrijNaMOH.txt_ZapNaStr(driver).sendKeys(Integer.toString(vsegoPredIzAktaPri));
        PageAktPrijomaNaMOH.ViborPredmetaRegAktaPrijNaMOH.btn_SaveZapNaStr(driver).click();
        MyWait.myWaitXPath(driver, 10, "html/body/div[5]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/table/tbody/tr[2]/td/div/div[3]/div/div/table/tbody/tr[2]");

//Выбираем все предметы из Акта приема
        for (int i = 1; i < vsegoPredIzAktaPri+1; i++) {
            PageAktPrijomaNaMOH.ViborPredmetaRegAktaPrijNaMOH.str_TableElementPredmIzAktPri(driver, i).click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            PageAktPrijomaNaMOH.ViborPredmetaRegAktaPrijNaMOH.btn_AddPredmIzAktPri(driver).click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

//сохраняем выбор предметов
        PageAktPrijomaNaMOH.ViborPredmetaRegAktaPrijNaMOH.btn_Ok(driver).click();

//        ждем закрытия окна
        MyWait.myWaitXPath(driver, 10, "html/body/div[4]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/div/table/tbody/tr[24]/td/div/div[3]/div/div/table/tbody/tr[2]/td[1]");

//        сохраняем Акт приема на материально-ответственное хранение
        PageAktPrijomaNaMOH.btn_Ok(driver).click();

        log.info("Акт приема на материально-ответственное хранение создан");
        return driver;

    }
}
