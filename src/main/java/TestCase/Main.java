package TestCase;

import Helppers.WorkWithPropertyFile;
import UserAction.AktPrijoma;
import UserAction.KnigaPostupleniya;
import UserAction.LogIn;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Properties;

/**
 * Created by dima on 16.11.16.
 */
public class Main {


    public static void main(String[] args) {

////подключаем проперти файл
//        Properties configTest = WorkWithPropertyFile.createProperti(args[0]);
//        String pathBrowser = configTest.getProperty("pathBrowser");


        String pathBrowser = args[0];

        System.setProperty("webdriver.chrome.driver", pathBrowser);
        WebDriver driver = new ChromeDriver();
        LogIn.logIn(driver);
        AktPrijoma.createAktPrijoma(driver);
        KnigaPostupleniya.createKnigaPostupleniya(driver);

    }

}
