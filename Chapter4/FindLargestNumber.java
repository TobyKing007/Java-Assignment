import java.util.Scanner;
public class FindLargestNumber {

    public static void main (String[] args) {
    
    Scanner input = new Scanner(System.in);
    int number = 0;
    int largest = Integer.MIN_VALUE;
    
    for (int counter = 1; counter <= 10; counter++) {
        System.out.println ("Enter digit " + counter + ":");
        number = input.nextInt();
                   
    if  (number > largest)  {
        largest = number;
 
            }
          }  
        System.out.println ("The largest number is " + largest);
        }
}
