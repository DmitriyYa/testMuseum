package TestCase;

import Helppers.WorkWithPropertyFile;
import org.apache.log4j.Logger;

import java.util.Properties;

/**
 * Created by dima on 28.10.16.
 */
public class TestDvijenie {
    //подключаем проперти файл
    public static Properties properties = WorkWithPropertyFile.createProperti();
    public static final String userName = properties.getProperty("userName");
    public static final String password = properties.getProperty("userPassword");
    public static final String hostName = properties.getProperty("hostName");
    //подключаем логи
    public static final Logger log = Logger.getLogger(TestInventar.class.getName());


//    public static void main(String[] args) {
//        //создаем драйвер
//        WebDriver driver = RabotaSWevDriverom.getDriver();

//        driver.get(hostName);
//
//        // Найти элемент ввода текста по его имени
//        WebElement elementLog = driver.findElement(By.name("j_username"));
//
//        //очистип поле ввода
//        elementLog.clear();
//
//        // Введите логин
//        elementLog.sendKeys(userName);
//
//        // Найти элемент ввода текста по его имени
//        WebElement elementPass = driver.findElement(By.name("j_password"));
//
//        //Очистим поле ввода
//        elementPass.clear();
//
//        //введите пароль
//        elementPass.sendKeys(password);
//
//        //нажимаем Войти
//        driver.findElement(By.id("submitlink")).click();
//
//        //явное ожидание загрузки страницы
//        (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.className("gwt-MenuItem")));
//
//        // в меню ищем Движение, и нажимаем
//        List<WebElement> webElements = driver.findElements(By.className("gwt-MenuItem"));
//        for (WebElement we : webElements) {
//            if (we.getText().equals("Движение")) {
//                we.click();
//                break;
//            }
//        }
//
//        //явное ожидание загрузки страницы
//        (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.className("menuPopupMiddle")));
//
//        // ищем в списке Поступление, Инвентарная книга музейных экспонатов и нажимаем
//        List<WebElement> webElements1 = driver.findElements(By.className("gwt-MenuItem"));
//
//        for (WebElement we : webElements1) {
//            if (we.getText().equals("Внутримузейная передача")) {
//                we.click();
//                break;
//            }
//        }
//
//
//
//    }

}
