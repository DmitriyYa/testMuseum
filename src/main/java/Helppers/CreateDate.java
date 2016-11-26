package Helppers;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by dima on 25.11.16.
 */
public class CreateDate {

    public static String[] createDate(){
        //создаем текущую Дату
        Date date = new Date();
        SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy");
        String[] s = format1.format(date).split("\\.");
        return s;
    }
}
