package Lesson1DZ;

public class Aplication {

    public static void main(String[] args) {

        // Мінімальне та максимальне значення примітивів.
        System.out.println("Мінімальне та максимальне значення примітивів");
        System.out.println("");
        System.out.println("Byte min - " + Byte.MIN_VALUE);
        System.out.println("Byte max - " + Byte.MAX_VALUE);
        System.out.println("");
        System.out.println("Short min - " + Short.MIN_VALUE);
        System.out.println("Short max - " + Short.MAX_VALUE);
        System.out.println("");
        System.out.println("Integer min - " + Integer.MIN_VALUE);
        System.out.println("Integer max - " + Integer.MAX_VALUE);
        System.out.println("");
        System.out.println("Long min - " + Long.MIN_VALUE);
        System.out.println("Long max - " + Long.MAX_VALUE);
        System.out.println("");
        System.out.println("Double min - " + Double.MIN_VALUE);
        System.out.println("Double max - " + Double.MAX_VALUE);
        System.out.println("");
        System.out.println("Float min - " + Float.MIN_VALUE);
        System.out.println("Float max - " + Float.MAX_VALUE);
        System.out.println("");
        System.out.println("Char min - u0000 або 0");
        System.out.println("Char max - uffff або 65б535");
        System.out.println("");
        System.out.println("Boolean min - false");
        System.out.println("Boolean max - true");
        System.out.println("------");
        System.out.println("Знаходження мінімального та максимального числа в масиві");
        System.out.println("");

        // Знаходження мінімального та максимального числа в масиві
        int [] array = {5, 17, 21, 2065, -56, 333, -19, 88, 0, -1};
        int min = 0;
        int max = 0;
        for (int i=0; i<array.length; i++){
            if (min > array[i]){
                min = array[i];
            }
            if (max < array[i]){
                max = array[i];
            }
        }
        System.out.println("Мінімальне число в масиві - " + min);
        System.out.println("Максимальне число в масиві - " + max);



    }
}
