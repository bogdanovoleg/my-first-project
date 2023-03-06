package lv.acodemy.classroom;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        //первое число имее индекс 0
        System.out.println(numbers[4]);

        int apples = numbers[6];
        System.out.println("I have " + apples + "apples");
        System.out.println("Numbers array contains of: " + numbers.length + " numbers");

        numbers[0] = 90;
        numbers[9] = 50;
        System.out.println(Arrays.toString(numbers));

        int[] euribor = new int[10];
        euribor[0] = 3;
        euribor[1] = 5;

        System.out.println(Arrays.toString(euribor));

        String[] names = {"john", "Andrew", "Mike", "Anna", "Marija"};
        System.out.println(names.length);
        System.out.println("My name is: " + names[2]);

        names[3] = "Mark";
        System.out.println(Arrays.toString(names));
    }
}
