package Helppers;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dima on 17.11.16.
 */
public class NaimenivaniePredmetaList {
    public static List<String> getNaimenovaniePredmetaList() {
        return naimenovaniePredmetaList;
    }

    public static void setNaimenovaniePredmetaList(String naimenovaniePredmeta) {
        naimenovaniePredmetaList.add(naimenovaniePredmeta);
    }

    private static List<String> naimenovaniePredmetaList = new ArrayList<String>();

}
