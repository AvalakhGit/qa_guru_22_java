package ru.avalakh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapClass {
    HashMap<String, Integer> map = new HashMap<>();

    public void mapAdd(String str, int i) {
        map.put(str, i);
    }

    public void mapDelete(String str) {
        map.remove(str);
    }

    public int mapFind(String str) {
        return map.get(str);
    }

    public void showSeparateElements(Object o) {
        if (o instanceof String) {
            Set<String> keys = map.keySet();
            System.out.println(keys);
        } else if (o instanceof Integer) {
            ArrayList<Integer> values = new ArrayList<>(map.values());
            System.out.println(values);
        } else System.out.println("wrong format");
    }
}