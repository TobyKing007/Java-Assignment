import java.util.ArrayList;
import java.util.Scanner;

    public class CheckoutApp   {
    public static void main (String[] args) {

    Scanner input = new Scanner(System.in);

    ArrayList<String> items = new ArrayList<>();
    ArrayList<Integer> quantity = new ArrayList<>();
    ArrayList <Double> price = new ArrayList<>();
  
    String condition;

    do   {

    System.out.println ("Enter item bought ");
    String itemBought = input.nextLine().toLowerCase();
    
    System.out.println("Enter quantity ");
    int itemQuantity = input.nextInt();

    System.out.println ("Enter price per unit ");
    double itemPrice = input.nextDouble();

    input.nextLine();

    items.add(itemBought);
    quantity.add(itemQuantity);
    price.add(itemPrice);

    System.out.println ("Add more items? (yes/no) ");
    condition = input.nextLine().toLowerCase();
    }

    while (condition.equals("yes"));


    System.out.println ("Enter customer name");
    String customerName = input.nextLine();

    System.out.println ("Enter cashier name");
    String cashierName = input.nextLine();

    System.out.println ("Enter discount");
    double discount = input.nextDouble();
    input.nextLine();

    double subTotal = 0;
    double vatRate = 7.5 / 100;
  

    for (int counter = 0; counter < items.size(); counter++) {
        double totalPerItem = quantity.get(counter) * price.get(counter);
        subTotal += totalPerItem;
    }

       double discountAmount = (discount / 100) * subTotal;
       double discountedPrice = subTotal - discountAmount;

       double vat = subTotal * vatRate; 
       double totalPrice = vat + subTotal - discountAmount;

       System.out.println ("SEMICOLON STORES");
       System.out.println ("MAIN BRANCH");
       System.out.println ("LOCATION: HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
       System.out.println ("TEL: 08183215687");
       System.out.println ("DATE: 18-DEC-25 8:48:11 AM");
       System.out.println ("Cashier: " + cashierName);
       System.out.println ("Customer Name: " + customerName);
       System.out.println ("=======================================================================================");
       System.out.println("Item\tQty\tPrice\tTotal");
       System.out.println ("---------------------------------------------------------------------------------------");

        for (int counter = 0; counter < items.size(); counter++) {
        double totalPerItem = quantity.get(counter) * price.get(counter);
        System.out.printf ( "%s\t%d\t%.2f\t%.2f%n", items.get(counter),quantity.get(counter),price.get(counter),totalPerItem);
        }

        System.out.println ("---------------------------------------------------------------------------------------");
        System.out.println ("\t\t" + "Subtotal:" + "\t" + subTotal);
        System.out.println ("\t\t" + "Discount" + "\t" + discountAmount);
        System.out.println ("\t\t" + "VAT @ 17.50%" + "\t" + vat);
            
        System.out.println ("=======================================================================================");

        System.out.println ("\t\t" + "Bill Total" + "\t" + totalPrice);

        System.out.println ("=======================================================================================");
        System.out.println ("THIS IS NOT A RECEIPT, KINGLY PAY " + totalPrice);
        System.out.println ("=======================================================================================");
        
        System.out.println ("How much did the customer give to you? ");
        double totalPay = input.nextDouble();

        if (totalPay > totalPrice)  {
            double change = totalPay - totalPrice;
            System.out.println ("Customer change is: " + change);
        }
        else if (totalPay < totalPrice) {
                double change = totalPrice - totalPay;
                System.out.println("Insuffient fund. Pay extra " + change);          
        }

        System.out.println("Thanks for your patronage");
            }
        }
    
