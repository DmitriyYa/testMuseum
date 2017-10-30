package kz.jazzsoft.museum.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by dima on 15.11.16.
 */
public class SearchTable {

    public static WebElement searchTableAttribute(WebElement table, String attributeTable) {
        WebElement element = null;

        List<WebElement> tr = table.findElements(By.tagName("tr"));

        for (WebElement row : tr) {

            List<WebElement> td = row.findElements(By.tagName("td"));

            for (WebElement cell : td) {

                if (cell.getText().equals(attributeTable)) {
                    element = cell;

                    break;
                }

            }

        }
        return element;
    }

    public static WebElement searchTablePosition(WebElement table, int i) {
        WebElement element = null;

        List<WebElement> tr = table.findElements(By.tagName("tr"));

        for (int j=0;j<tr.size();j++){
            if(j==i){
                element=tr.get(j);
                break;
            }

        }
        return element;
    }
}
