package lv.acodemy.Homework;

public class SecondHomeWork {
    public static void main(String[] args) {
        String[] europeanCountries = {"Latvia", "Poland", "France", "Germany", "Portugal", "Lithuania", "Estonia",
                "Italy", "Greece", "Spain"};
        for (int i = 0; i < europeanCountries.length; i++) {
            System.out.print(europeanCountries[i] + " ");
        }
        for (int i = 0; i < europeanCountries.length; i++) {
            if (europeanCountries[i].equals("Latvia"))
                System.out.println("\nLatvia is my motherland");
        }
        String[] Sentence = {"Sometimes", "it", "pays", "to", "stay", "in", "bed", "on", "Monday,", "rather", "than",
                "spending", "the", "rest", "of", "the", "week", "debugging", "Monday’s", "code."};
        for (int i = 0; i < Sentence.length; i++) {
            System.out.print(Sentence[i] + " ");
        }
        System.out.println();
        double Salary = 1300;
        if (Salary < 0) {
            throw new IllegalStateException("Unexpected value " + Salary);
        } else if (Salary >= 0 && Salary <= 5000) {
            System.out.println("Your salary is low.");
        } else if (Salary > 5000 && Salary <= 10000) {
            System.out.println("Your salary is average.");
        } else {
            System.out.println("Your salary is high.");
        }
        int number = 1;
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
