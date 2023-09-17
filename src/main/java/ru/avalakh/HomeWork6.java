package ru.avalakh;

public class HomeWork6 {
    public static void main(String[] args) throws InterruptedException {
        byte aMaxByte = Byte.MAX_VALUE;
        byte aMinByte = Byte.MIN_VALUE;
        byte aByte = 120;
        float aMaxFloat = Float.MAX_VALUE;
        float aMinFloat = Float.MIN_VALUE;
        double aMaxDouble = Double.MAX_VALUE;
        double aMinDouble = Double.MIN_VALUE;
        int aMaxInt = Integer.MAX_VALUE;
        int aMinInt = Integer.MIN_VALUE;
        long aMaxLong = Long.MAX_VALUE;
        long aMinLong = Long.MIN_VALUE;
        short aMaxShort = Short.MAX_VALUE;
        short aMinShort = Short.MAX_VALUE;
        boolean aTrue = true;
        boolean aFalse = false;
        char aMaxCharacter = Character.MAX_VALUE;
        char aMinCharacter = Character.MIN_VALUE;
        String word = "Just String";

        //Расчеты
        System.out.println("------Расчеты-----------------");
        System.out.println("maxInteger + minInteger = " + (aMaxInt + aMinInt));
        System.out.println("maxInteger - minByte = " + (aMaxInt - aMinByte));
        System.out.println("maxInteger * minFloat = " + (aMaxInt * aMinFloat));
        System.out.println("maxLong / minInt = " + (aMaxLong / aMinInt));
        System.out.println("maxInteger % minInteger = " + (aMaxInt % aMinInt));
        System.out.println("maxInt - minDouble =" + (aMaxInt + aMinDouble));
        System.out.println("minInt - maxDouble =" + (aMinInt - aMaxDouble));
        System.out.println("Text: " + (word + " - just read it!"));
        System.out.println("String + Char: " + word + aMaxCharacter);
        System.out.println("String - Char: " + word + aMinCharacter);

        //Переполнение
        System.out.println("------Переполнение-----------------");
        System.out.println("Overflow: " + (byte) (aMaxByte + 10));
        System.out.println("Overflow: " + (byte) (aMinByte - 10));
        System.out.println("Overflow: MaxInt + MaxDouble= "+ aMaxInt+aMaxDouble);

        System.out.println(" Увеличиваем byte:");
        System.out.println(" aByte= "+aByte);

        for (int i=0; i<=150;i++){
            aByte++;
            if (aByte==aMaxByte){
                System.out.println("aByte равен aMaxByte: " + aByte +" = "+aMaxByte + " , при i="+i);
            }
            if (aByte==aMinByte){
                System.out.println("aByte равен aMinByte: " + aByte +" = "+aMinByte+ " , при i="+i);
            }
            if(i%10==0){
                System.out.println(i+" : aByte now = "+aByte);
            }
            Thread.sleep(100);
        }

        //Логические выражения
        System.out.println("------Логические выражения-----------------");
        System.out.println("maxLong < maxInt = " + (aMaxLong < aMaxInt));
        System.out.println("True || False = " + (aTrue || aFalse));
        System.out.println("maxLong < maxInt && maxDouble < maxFloat = " + (aMaxLong < aMaxInt && aMaxDouble < aMaxFloat));


    }
}
