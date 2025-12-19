import java.util.Scanner;
public class TwoSmallestNumbers {

    public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    int number = 0;
    int smallest = Integer.MAX_VALUE;
    int secondSmallest = Integer.MAX_VALUE;

    for (int count = 1; count <= 10; count++)   {
        System.out.println("Enter number " + count + ":");
        number = input.nextInt();
    
    if (number < smallest)  {
        secondSmallest = smallest;
        smallest = number;
      }
    else if (number < secondSmallest)   {
            secondSmallest = smallest;
      }
              
            }
        System.out.println("Smallest number is " + smallest);
        System.out.println("Second smallest number is: " + secondSmallest);
        }
    }
