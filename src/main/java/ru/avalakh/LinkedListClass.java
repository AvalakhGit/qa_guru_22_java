package ru.avalakh;

import java.util.LinkedList;

public class LinkedListClass {
    LinkedList<Integer> list = new LinkedList<>();


    public void listAdd(int i) {
        list.add(i);
    }

    public void listAdd(int i, int index) {
        list.add(index, i);
    }

    public void listRemove(Object o) {
        list.remove(o);
    }

    public int listFindIndexOfElement(int i) {
        return list.indexOf(i);
    }

    public int listFindElement(int i) {
        return list.get(i);
    }

    public void showElementsWhileIndex(int i) {
        if (list == null) {
            System.out.println("The List you've created is empty");
        } else {
            int j = 0;
            do {
                System.out.println(listFindElement(j));
                j++;
            }
            while (j != i);
        }
    }
}
