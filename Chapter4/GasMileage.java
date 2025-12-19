import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

        System.out.println ("Enter number of trips: ");
        int numberOfTrips = input.nextInt();
        int counter = 1;
        double sumOfMilesPerGallon = 0;

        while (counter <= numberOfTrips) {

       System.out.println("Enter Miles Driven");
       int miles = input.nextInt();

       System.out.println ("Enter gallons used");
       int gallons = input.nextInt();

       double milesPerGallon = (double) miles / gallons;
        System.out.println ("Miles per gallon is: " + milesPerGallon);

        double sumOfMilesPerGallon += milesPerGallon;
         System.out.println ("The sum of the miles per gallon is: " + sumOfMilesPerGallon);
        counter++;
        }
        double averageMilesPerGallon = sumOfMilesPerGallon / numberOfTrips;
        System.out.println ("The average miles per gallon is: " + averageMilesPerGallon);
    }
}

