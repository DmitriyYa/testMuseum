package kz.jazzsoft.museum.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by dima on 15.11.16.
 */
public class SearchComboBack {
    private static WebElement element = null;

    public static WebElement searchComboBack( WebElement comboBack, String valueComboBack) {


        List<WebElement> allRows = comboBack.findElements(By.className("comboValue"));

        for (WebElement row : allRows) {

            if (row.getText().equals(valueComboBack)) {
                element = row;
                break;
            }

        }
        return element;
    }
}
