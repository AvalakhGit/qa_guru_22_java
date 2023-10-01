package ru.avalakh;

import java.util.List;

public class Human {
    private  final String name;
    private final int age;
   private final boolean isCute;

    public Human(String name, int age, boolean isCute) {
        this.name = name;
        this.age = age;
        this.isCute = isCute;
    }

    //статические методы "существуют" как бы вне объекта.
    //они не привязаны к объекту

    void printSomeValues(int i, String str, List<String> list){
        i=100;
        list.add("selenide");
        System.out.println("int: "+i+ ", string: "+ str.toUpperCase()+ ", list: "+ list);
    }

    public Human incrimentAge (){
        return new Human(this.name,(this.age+1),true);
    }

    public String getName(){
        return name;
    }
    public int getAg(){
        return age;
    }
    public boolean getCute(){
        return isCute;
    }

    @Override //переопределение. Вызвали Alt+Insert
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isCute=" + isCute +
                '}';
    }

}
