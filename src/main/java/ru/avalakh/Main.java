package ru.avalakh;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Human max = new Human(
                "Max",
                44,
                true
        );

        List<String> lectures=new ArrayList<>();
        lectures.add("git");
        lectures.add("java");
        lectures.add("files");
        lectures.add("junit");

        int hours=12;
        String hello="Hello!";

        max.printSomeValues(
                hours,
                hello,
                lectures
        );
        System.out.println("After int: "+ hours);
        System.out.println("After String: "+hello);
        System.out.println("List after: " + lectures);
        //передача по значению - предполагает что создается "копия" данных, и с копией можно делать что угодно.
        //передача по ссылке - передает "адрес/ссылку" на данные (удалив или изменив эти данные - они изменятся и там где они "лежат"

        // в Java отсутсвтует передача по ссылке. Все передается по значению, НО
        // для всех объектных/ссылочных типах данных мы передаем ссылку на место в памяти где эти типы данных в памяти лежат
        // т.е. этим саммым "значением" - является ссылка.

        //immutable(неизменяемый) объект ЛУЧШЕ чем mutable (изменяемый);
        System.out.println("----------------------------");
        max=max.incrimentAge();
        System.out.println(max);

        //массивы
        //String[] lecturesArray = new String[4];
        System.out.println("-----------------------------------");
        String[] lecturesArray = new String[] {"git","java","files","junit"};
        lecturesArray[0]="git";
        lecturesArray[1]="java";
        lecturesArray[2]="files";
        lecturesArray[3]="junit";

        int[] intArray0=new int[] {1,2,3};
        int[] intArray1=new int[] {1,2,3};

        int[][] biArray=new int[][] {
                intArray0,
                intArray1
        };
        // и т.д. трехмерный массив - это массив двумерных массивов
//
//        for(int i=0;i<lecturesArray.length;i++){
//            System.out.println(lecturesArray[i]);
//        }
        System.out.println("---------------------------");
        for (String lectureName:lecturesArray){
            if (lectureName.startsWith("j")) {
                System.out.println(lectureName);
                break; //- выход из цикла
                //continue; - выход из итерации
                //return; - выход из метода
            }

        }
        System.out.println("---------------------------");
        List[] arraysLists = new List[] {};
//        int index=0;
//        while (index<lecturesArray.length){
//            System.out.println(lecturesArray[index]);
//            index++;
//        }
//        //первая операция обязательно должна быть выполнена.
//        do {
//
//        } while ();

        Set<String> lecturesSet = Set.of( //new HashSet<>()
                "git",  "java","files","junit"
        ); //Set не позволяет хранить одинаковые объекты

        //почитать про equals и HashCode

        Map<String,Human> humans = new HashMap<>();
        humans.put("123",max);
        humans.put("133",max);
        humans.put("143",max);
        humans.put("153",max);

        //Map позволяет иметь константное время доступа к данным по ключу
        for (Map.Entry<String,Human> entry : humans.entrySet()){
            entry.getKey(); //ключ
            entry.getValue(); //Значение
        }


    }
}
