package UserAction;

import Helppers.CreateDate;
import Helppers.MyWait;
import Helppers.SearchComboBack;
import Helppers.WorkWithPropertyFile;
import PageObjects.PageAktPrijomaNaMOH;
import PageObjects.PageAktPrijomaSozdanie;
import PageObjects.PageMain;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.util.Properties;
import java.util.Random;

/**
 * Created by dima on 25.11.16.
 */
public class AktPrijomaNaMOH {

    //подключаем логи
    private static final Logger log = Logger.getLogger(AktPrijoma.class.getName());

    //подключаем проперти файл
    private static Properties properties = WorkWithPropertyFile.createProperti();
    private static final int vsegoPredIzAktaPri = Integer.parseInt(properties.getProperty("vsegoPredIzAktaPri"));

    //    Генерим номер Акта приема на материально-ответственное хранение
    private static int nomer = new Random().nextInt(10000);

    public static int getNomer() {
        return nomer;
    }


    public static WebDriver createAktPrijomaNaMOH(WebDriver driver)     {

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
        PageAktPrijomaNaMOH.txtbx_AktPtijomaNaMOH(driver).sendKeys(Integer.toString(nomer));

//        Создаем текущую дату
        String[] date = CreateDate.createDate();

        //заполняем Дата акта приема, текущей датой

        PageAktPrijomaNaMOH.txtbx_DataAktPtijomaNaMOHDya(driver).sendKeys(date[0]);
        PageAktPrijomaNaMOH.txtbx_DataAktPtijomaNaMOHMonth(driver).sendKeys(date[1]);
        PageAktPrijomaNaMOH.txtbx_DataAktPtijomaNaMOHYear(driver).sendKeys(date[2]);

//        выбираем Вид фонда
        PageAktPrijomaNaMOH.btn_VidFonda(driver).click();
        MyWait.myWaitXPath(driver, 10, "html/body/div[5]/div/div/div/div/div/div[1]");
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
        int nomerAktePrijoma = AktPrijoma.getNomer();
        PageAktPrijomaNaMOH.ViborPredmetaRegAktaPrijNaMOH.btn_IzmenAktPri(driver).click();
        PageAktPrijomaNaMOH.ViborPredmetaRegAktaPrijNaMOH.txt_ZapNaStr(driver).clear();
        PageAktPrijomaNaMOH.ViborPredmetaRegAktaPrijNaMOH.txt_ZapNaStr(driver).sendKeys("50");
        PageAktPrijomaNaMOH.ViborPredmetaRegAktaPrijNaMOH.btn_SaveZapNaStr(driver).click();
        MyWait.myWaitXPath(driver, 10, "html/body/div[5]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/table/tbody/tr[1]/td/div/div[3]/div/div/table/tbody/tr[20]/td[1]");
        PageAktPrijomaNaMOH.ViborPredmetaRegAktaPrijNaMOH.str_TableElementAktPri(driver, Integer.toString(nomerAktePrijoma)).click();

//        Изменяем отображаемый список эелементов в предмет из акта приема
        PageAktPrijomaNaMOH.ViborPredmetaRegAktaPrijNaMOH.btn_IzmenPredmIzAktPri(driver).click();
        PageAktPrijomaNaMOH.ViborPredmetaRegAktaPrijNaMOH.txt_ZapNaStr(driver).clear();
        PageAktPrijomaNaMOH.ViborPredmetaRegAktaPrijNaMOH.txt_ZapNaStr(driver).sendKeys(Integer.toString(vsegoPredIzAktaPri));
        PageAktPrijomaNaMOH.ViborPredmetaRegAktaPrijNaMOH.btn_SaveZapNaStr(driver).click();

//Выбираем все предметы из Акта приема
        for (int i = 0; i < vsegoPredIzAktaPri; i++) {
        PageAktPrijomaNaMOH.ViborPredmetaRegAktaPrijNaMOH.str_TableElementPredmIzAktPri(driver,i).click();
            PageAktPrijomaNaMOH.ViborPredmetaRegAktaPrijNaMOH.btn_AddPredmIzAktPri(driver).click();
        }

//сохраняем выбор предметов
        PageAktPrijomaNaMOH.ViborPredmetaRegAktaPrijNaMOH.btn_Ok(driver).click();

//        ждем закрытия окна
        MyWait.myWaitXPath(driver,10,"html/body/div[4]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/div/table/tbody/tr[24]/td/div/div[3]/div/div/table/tbody/tr[2]/td[1]");

//        сохраняем Акт приема на материально-ответственное хранение
        PageAktPrijomaNaMOH.btn_Ok(driver).click();

        return driver;

    }
}