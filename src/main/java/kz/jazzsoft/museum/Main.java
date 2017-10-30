package kz.jazzsoft.museum;

import kz.jazzsoft.museum.userActions.AktPrijoma;
import kz.jazzsoft.museum.userActions.AktPrijomaNaMOH;
import kz.jazzsoft.museum.userActions.KnigaPostupleniya;
import kz.jazzsoft.museum.userActions.LogIn;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by dima on 16.11.16.
 */
public class Main {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/dima/1/chromedriver");
//        System.setProperty("webdriver.chrome.driver", "c:\\TestMuseum\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        LogIn.logIn(driver);
        AktPrijoma.createAktPrijoma(driver);
        KnigaPostupleniya.createKnigaPostupleniya(driver);
        AktPrijomaNaMOH.createAktPrijomaNaMOH(driver);

    }

}
