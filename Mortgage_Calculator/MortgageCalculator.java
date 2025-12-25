import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter loan amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter loan duration (years): ");
        int duration = input.nextInt();

        double monthlyRate = annualInterestRate / 100 / 12;
        int numberOfMonths = duration * 12;

        double monthlyPayment = principal *
                (monthlyRate * Math.pow(1 + monthlyRate, numberOfMonths)) /
                (Math.pow(1 + monthlyRate, numberOfMonths) - 1);

        System.out.println("The monthly mortgage is: " + monthlyPayment);
    }
}

