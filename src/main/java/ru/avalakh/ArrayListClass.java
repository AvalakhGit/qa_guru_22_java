package ru.avalakh;
import java.util.ArrayList;

public class ArrayListClass {
        ArrayList<String> array = new ArrayList<>();

        public void arrayAdd(String str) {
            array.add(str);
        }

        public void arrayAdd(String str, int index) {
            array.add(index, str);
        }

        public void arrayRemove(String s) {
            array.remove(s);
        }

        public int arrayFindIndexOfElement(String str) {
            return array.indexOf(str);
        }

        public String arrayFindElement(int i) {
            return array.get(i);
        }

        public void showAllElements() {
            for (String element : array) {
                System.out.println(element);
            }
        }
}
