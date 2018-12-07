package com.gabz.projetcuisine.util;

import java.util.List;

public class ListUtil {

    public static int getFirstEmtpyElement(List<? extends Object> list) {

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) == null) return i;
        }
        return -1;
    }
}
