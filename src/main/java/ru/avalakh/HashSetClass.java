package ru.avalakh;

import java.util.*;

public class HashSetClass {
    HashSet<String> set = new HashSet<>();

    public void setAdd(String str) {
        set.add(str);
    }

    public void setDelete(String str) {
        set.remove(str);
    }

    public boolean setContains(String str) {
        return set.contains(str);
    }

    public void showAllElements() {
        Iterator i = iterator(set);
        while (i.hasNext())
            System.out.println(i.next());
    }

    private Iterator<String> iterator(HashSet set) {
        Iterator<String> i = set.iterator();
        return i;
    }
}
