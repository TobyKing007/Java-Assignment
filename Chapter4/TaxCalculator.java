import java.util.Scanner;
public class TaxCalculator {

      public static void main (String[] args) {
      Scanner input = new Scanner(System.in);

      double lowerTaxRate = 0.15;
      double higherTaxRate = 0.20;
      double taxLimit = 30000;

      for (int counter = 1; counter <= 3; counter++){
      System.out.println ("Enter details for citizen " + counter);
      System.out.println ("Enter citizen name");
      String name = input.next();

      System.out.println ("Enter citizen earnings");
      double earnings = input.nextDouble();

      if (earnings <= taxLimit) {
        System.out.println ("Total tax is: " + lowerTaxRate * earnings);
                }
       else {
        System.out.println ("Total tax is: " + higherTaxRate * earnings);
                }        
            }
        }
}
