package ru.avalakh;
public class Main {
    public static void main(String[] args){
        ArrayListClass array =  new ArrayListClass();
        HashSetClass set = new HashSetClass();
        HashMapClass map =new HashMapClass();
        LinkedListClass list = new LinkedListClass();

        array.arrayAdd("First");
        array.arrayAdd("Second");
        array.arrayAdd("Third");
        array.arrayAdd("Forth");
        System.out.println(array.arrayFindElement(2));
        array.arrayRemove("Third");
        System.out.println(array.arrayFindIndexOfElement("Forth"));
        array.showAllElements();
        array.arrayAdd("NewElement",2);
        array.showAllElements();

        set.setAdd("First");
        set.setAdd("Second");
        set.setAdd("Third");
        set.setAdd("Forth");
        System.out.println(set.setContains("First"));
        set.setDelete("First");
        System.out.println("-----------------------");
        System.out.println(set.setContains("First"));
        set.showAllElements();

        map.mapAdd("First",0);
        map.mapAdd("Second",1);
        map.mapAdd("Third",2);
        map.mapAdd("Forth",3);
        System.out.println(map.mapFind("Third"));
        map.mapDelete("Third");
        map.showSeparateElements("s");
        map.showSeparateElements(9);

        list.listAdd(1);
        list.listAdd(5);
        list.listAdd(2,1);
        list.listAdd(3,1);
        list.listRemove(1);
        System.out.println(list.listFindIndexOfElement(1));
        list.showElementsWhileIndex(3);
    }
}
