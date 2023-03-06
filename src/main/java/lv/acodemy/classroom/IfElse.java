package lv.acodemy.classroom;

public class IfElse {
    public static void main(String[] args) {

        //IF
        /*
        if(condition) {
        code to be executed
        }
         */
        boolean x = 5 > 2;
        System.out.println(x);

        if (x) {
            System.out.println("Yes, 5 is more than 2");
        }

        int number = 21;
        if (number % 2 == 0) {
            System.out.println("Number: " + number + " is even number");
        } else {
            System.out.println("Number: " + number + " is NOT even number");
        }

        int age = 18;
        if (age < 18) {
            System.out.println("You are not allowed to buy here!");
        } else {
            System.out.println("Welcome to our shop!");

            boolean isSummer = false;
            if (isSummer) {
                System.out.println("Summer months: June, July, August");
            }

            //if-else-if
        /*
        if(condition) {
        code to be executed
        } else if(condition) {
        code to be executed
        } else {
        code to be executed
        }
         */

            int ageL = 0;
            if (ageL <= 17) {
                System.out.println("You are not allowed to buy here!");
            } else if (age <= 0) {
                System.out.println("Who are you?");
            } else {
                System.out.println("Welcome to our shop!");
            }


            // if John = Hello John!
            //if Zina = You are not welcome!
            // All others = Text

            String name = "Max";
            if (name.equals("John")) {
                System.out.println("Hello John!");
            } else if (name.equals("Zina")) {
                System.out.println("You are not welcome!");
            } else {
                System.out.println("Very interesting name!");
            }

            // switch case;
            // || OR
            // && AND

            int currentMonths = 12;
            if (currentMonths == 12 || currentMonths == 1 || currentMonths == 2) {
                System.out.println("This is Winter");
            } else if (currentMonths == 3 || currentMonths == 4 || currentMonths == 5) {
                System.out.println("This is Spring");
            } else if (currentMonths == 6 || currentMonths == 7 || currentMonths == 8) {
                System.out.println("This is Summer");
            } else if (currentMonths == 9 || currentMonths == 10 || currentMonths == 11) {
                System.out.println("This is Autumn");
            } else {
                throw new IllegalStateException("Unexpected value" + currentMonths);
            }

            String student1 = "John";
            String student2 = "Max";
            if(student1.equals("John") && student2.equals("Max")) {
                System.out.println("They will work together");
            }

            var myName = "Oleg";
            var myAge = 10;
            System.out.println(myAge);
        }
    }
}
