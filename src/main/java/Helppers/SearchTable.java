package Helppers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by dima on 15.11.16.
 */
public class SearchTable {

    public static WebElement serchTable(WebElement table, String atributTable) {
        WebElement element = null;

        List<WebElement> tr = table.findElements(By.tagName("tr"));

        for (WebElement row : tr) {

            List<WebElement> td = row.findElements(By.tagName("td"));

            for (WebElement cell : td) {

                if (cell.getText().equals(atributTable)) {
                    element = cell;

                    break;
                }

            }

        }
        return element;
    }
}
