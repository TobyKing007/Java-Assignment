// collect the following details from the customer as integers
// 1. account number
// 2. balance at the beginning of the month
// 3. total of all items charged by the customer this month
// 4. total of all credits applied to the customer's account this month
// 5. allowed credit limit
// calculate the customer's new balance by adding the balance at the beginning of the month to the total items  charged 
// subtract the total credit applied, from the sum and print the new balance
// if the new balance exceeds the credit limit, print "credit limit exceeded"
import java.util.Scanner;
public class CustomerAccount {

    public static void main (String[] args) {

    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter account number: ");
    int accountNumber = input.nextInt();

    System.out.println("Enter old account balance: ");
    int accountBalance = input.nextInt();

    System.out.println ("Enter total items charged: ");
    int totalItemsCharged = input.nextInt();

    System.out.print("Enter total credits applied: ");
    int totalCreditApplied = input.nextInt();

    System.out.println ("Enter Credit Limit: ");
    int creditLimit = input.nextInt();

    int currentBalance = accountBalance + totalItemsCharged - totalCreditApplied;
    System.out.println ("Your current account balance is: " + currentBalance);

    if (currentBalance <= creditLimit){
    System.out.println ("Credit within limit");
                }

    else {

System.out.println ("Credit limit exceeded");
            
            }
        }
    }


