package lv.acodemy.Homework;

import java.sql.SQLOutput;
import java.util.Arrays;

public class VariablesDataTypes1 {
    public static void main(String[] args) {
        byte myCurrentAge = 29;
        byte workYears = 6;
        byte mortgageYears = 20;
        short monthlySalary = 1300;
        short currentYear = 2023;
        short BirthYear = 1993;
        short cursePrice = 600;
        int flatsPrice = 73000;
        int downPayment = 10000;
        int dateOfBirth = 28071993;
        long populationOfEurope = 746400000;
        long mileageInKm = 180000;
        char letter = 'Q';
        char letter2 = 'A';
        float iosVersion = 16.3f;
        float endCurseDate = 11.04f;
        double currencyEuroPound = 0.88;
        double mortgageAnnualPercentage = 1.9;//%
        boolean IsApproved = true;
        boolean IsDenial = false;
        boolean lastIosVersion = true;
        if (iosVersion == 16.3f) {
            System.out.println(lastIosVersion);
            System.out.print("\n\n");
        }
        String name = "Oleg";
        String surname = "Bogdanov";
        String fullName = (name + " " + surname);

        System.out.printf("Hello, I'm %s and I'm %d years old.\n", fullName, myCurrentAge);
        System.out.printf("I work in a company " + workYears + " years, and my salary is " + monthlySalary + " euro.\n");
        System.out.printf("I went on %c%c curses for %d euro and will receive a certificate on %.2f date.\n\n", letter, letter2, cursePrice, endCurseDate);


        int age = currentYear - BirthYear;
        System.out.println(age + mortgageYears);
        double mortgageAmount = flatsPrice - downPayment;
        double mortgageMonthlyPercentage = mortgageAnnualPercentage / 12 / 100;
        double mortgageMonths = mortgageYears * 12;
        double totalPercentage = Math.pow((1 + mortgageMonthlyPercentage), mortgageMonths);
        double monthlyPayment = (mortgageAmount * mortgageMonthlyPercentage * totalPercentage) / (totalPercentage - 1);
        System.out.println(monthlyPayment);
        if (age+mortgageYears < 65 & monthlySalary-monthlyPayment > 900) {
            System.out.println(IsApproved);
        }
        if (age+mortgageYears > 65 | monthlySalary-monthlyPayment < 900) {
                System.out.println(IsDenial);
            }

    }
}
