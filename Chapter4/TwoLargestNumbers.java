import java.util.Scanner;
public class TwoLargestNumbers  {

    public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    int number = 0;
    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    for (int count = 1; count <= 10; count++)   {
        System.out.println("Enter number " + count + ":");
        number = input.nextInt();
    
    if (number > largest)   {
       secondLargest = largest;
       largest = number; 
    }
    else if (number > secondLargest)    {
        secondLargest = number;
     }
            }
        
        System.out.println("Largest number is " + largest);
        System.out.println("Second largest number is: " + secondLargest);
    }
}

