import java.util.Scanner;
public class FindSmallestNumber {

    public static void main (String[] args) {

    Scanner input = new Scanner(System.in);
    int number = 0;
    int smallest = Integer.MAX_VALUE;

    for (int counter = 1; counter <= 10; counter++) {
        System.out.println ("Enter integer " + counter + ":");
        number = input.nextInt();

    if (number < smallest)  {
        smallest = number;
                }
            }
        System.out.println ("The smallest number is " + smallest);
        }
}
