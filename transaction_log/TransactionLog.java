import java.util.ArrayList;
import java.util.Scanner;

public class TransactionLog {
    
    public static double deposit(double amount, double accountBalance, ArrayList <String> transactions)    {
        accountBalance += amount;
        String transfer = ("Deposited: ₦" + amount + "|" + "New Balance: ₦" + accountBalance);
        transactions.add(transfer);
        System.out.println(transfer);
        return accountBalance;
    }



    public static double withdraw(double amount, double accountBalance, ArrayList <String> transactions) {
        if (amount <= accountBalance)   {
            accountBalance -= amount;
            String withdrawal = ("Withdrew: ₦" + amount + "|" + "New Balance: ₦" + accountBalance);
            transactions.add(withdrawal);
            System.out.println(withdrawal);

        } else    {
        String withdrawal = ("Withdrawal failed: insufficient funds");
        transactions.add(withdrawal);
        System.out.println("Withdrawal failed: insufficient funds");
            }

        return accountBalance;
        }



    public static void allTransactions (ArrayList <String> transactions) {
        if (transactions.isEmpty()) {
            System.out.println ("No transactions yet");
            
        } else    {
            System.out.println("Transactions so far");
            int index = 1;
            for (String transaction : transactions) {
                System.out.println(index + ". " + transaction);
                index ++;
                
               
                        }
                    }
       
                }
            


    public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    accountBalance = 0;
    ArrayList<String> transactions = new ArrayList<>();

    System.out,println("WELCOME TO TRANSACTION LOG APP")

    while (true)    {
    System.out.println("\n1. Deposit");
    System.out.println("2. Withdraw");
    System.out.println("3. Show Transactions");
    System.out.println("4, Exit");

    System.out.println("Enter your choice");
    String choice = input.nextLine();
    if (choice.equals("1")) {
                System.out.print("Enter deposit amount: ");
                double amount = scanner.nextDouble();
                scanner.nextLine();
                accountBalance = deposit(amount, accountBalance, transactions);

            } else if (choice.equals("2")) {
                System.out.print("Enter withdrawal amount: ");
                double amount = scanner.nextDouble();
                scanner.nextLine();
                accountBalance = withdraw(amount, accountBalance, transactions);

            } else if (choice.equals("3")) {
                allTransactions(transactions);

            } else if (choice.equals("4")) {
                System.out.println("\nFinal Balance: ₦" + accountBalance);
                allTransactions(transactions);
                System.out.println("Thank you for using Transaction Log App!");
                break;

            } else {
                System.out.println("Invalid choice. Please enter 1–4.");
            }
        }

        scanner.close();
}
}
        
    
