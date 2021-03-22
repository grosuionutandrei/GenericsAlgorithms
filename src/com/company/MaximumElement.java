package com.company;

import java.util.List;

public class MaximumElement {
    public static <T> Object isMaxElement(List<T> list){
        Object ob = list.get(0);
        for (T t : list) {
            if (ob.hashCode() < t.hashCode()) {
                ob = t;
            }
        }
        return ob;
    }
}
