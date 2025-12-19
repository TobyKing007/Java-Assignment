// initiaize variables
// ask user to input amount of items sold
// use for loop to collect the value of the items sold
// add values together and intialise 
// calculate the total earnings by multiplying commission rate by total sales and adding it to wages



import java.util.Scanner;
public class SalesCommissionCalculator {

    public static void main (String[] args) {


    Scanner input = new Scanner(System.in);

    double wages = 200.0;
    double commissionRate = 0.09;
    double totalSales = 0.0;

    System.out.println ("Enter amount of items sold");
    int itemsSold = input.nextInt();

    for (int counter = 1; counter <= itemsSold; counter++) {
        System.out.println("Enter value of items");
        double itemValue = input.nextDouble();

        totalSales += itemValue;
            }

        double earnings = commissionRate * totalSales + wages;
            System.out.println ("The total earnings is: " + earnings);

        }

}

