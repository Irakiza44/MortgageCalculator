import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte month_in_year = 12;
        final byte percent = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principle: ");
        int principe =scanner.nextInt();

        System.out.print("Annual Interest: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest/percent/month_in_year;

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayment = years * month_in_year;
        double mortgage = principe * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayment))/(Math.pow(1 + monthlyInterest, numberOfPayment-1));
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}