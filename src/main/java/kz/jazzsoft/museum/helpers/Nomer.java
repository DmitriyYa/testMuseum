package kz.jazzsoft.museum.helpers;


import java.util.Random;

/**
 * Created by dima on 26.11.16.
 */
public class Nomer {

        //    Генерим номер
    private static int nomer = new Random().nextInt(10000);

    public static int getNomer() {
        return nomer;
    }


}
