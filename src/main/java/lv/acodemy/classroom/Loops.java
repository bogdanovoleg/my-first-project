package lv.acodemy.classroom;

import java.util.Arrays;

public class Loops {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        /*

        for(int i = 0; i < 10; i++) {
        // define counter
        // condition
        // increment
        }
         */

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }
        System.out.print("\n");

        // numbers[0] = 1
        // numbers[1] = 2

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.print("\n\n");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
        System.out.print("\n");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.print("\n\n");
        for (int number : numbers) {
            System.out.println(number);
        }

        String[] names = {"Oleg", "Anna", "Igor", "Nikita", "Veronika", "Viktorija", "Andrej", "Max", "Karina", "Ira" };

        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("Max")) {
            } else {
                System.out.print(names[i] + " ");
            }
        }
        System.out.print("\n");
        for (int i = 0; i < names.length; i++) {
            if (!names[i].equals("Max")) {
                System.out.print(names[i] + " ");
            }
        }
        System.out.printf("\n");

        for (String name : names) {
            System.out.printf(name + " ");
        }

        // do, do while

        /*
        do {
        //code to be executed
        } (while is true)
         */
        System.out.println();
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
        System.out.println();
        int x = 0;
        while (x <= 10) {
            System.out.println(x);
            x++;
        }
        System.out.println("\nHello World!\n");

        int[] arrayOfNum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] emptyArray = new int[arrayOfNum.length];

        for (int j = 0; j < arrayOfNum.length; j++) {
            emptyArray[j] = arrayOfNum[j];}

            System.out.print(Arrays.toString(emptyArray) + " ");


        emptyArray = arrayOfNum;
        System.out.println(Arrays.toString(emptyArray));


    }
}
