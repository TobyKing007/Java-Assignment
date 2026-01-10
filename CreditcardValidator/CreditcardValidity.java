import  java.util.Scanner;
    public class CreditcardValidity {
    
    public static void main (String[] args)    {
    Scanner input= new Scanner (System.in);


    System.out.println("Hello, Kindly Enter Card details to verify");
    String creditCard = input.nextLine();
    
    int creditCardLength = creditCard.length();

    if (creditCard.startsWith("4") && (creditCardLength >= 13 && creditCardLength <= 16)) {
        System.out.println("Credit Card Type: Visa Cards");
        System.out.println ("Credit Card Number: " + creditCard);
        System.out.println ("Credit Card Digit Length: " + creditCardLength);
        System.out.println ("Credit Card Validity Status: valid");
            }
    else if (creditCard.startsWith("5") && (creditCardLength >= 13 && creditCardLength <= 16))    {
            System.out.println("Credit Card Type: Mastercard");
            System.out.println ("Credit Card Number: " + creditCard);
            System.out.println ("Credit Card Digit Length: " + creditCardLength);
            System.out.println ("Credit Card Validity Status: valid");
            }
    else if (creditCard.startsWith("37") && (creditCardLength >= 13 && creditCardLength <= 15))   {
            System.out.println("Credit Card Type: American Express Cards");
            System.out.println ("Credit Card Number: " + creditCard);
            System.out.println ("Credit Card Digit Length: " + creditCardLength);
            System.out.println ("Credit Card Validity Status: valid");
            }
    else if (creditCard.startsWith("6") && (creditCardLength >= 13 && creditCardLength <= 16))    {
            System.out.println ("Credit Card Type: Discover Cards");
            System.out.println ("Credit Card Number: " + creditCard);
            System.out.println ("Credit Card Digit Length: " + creditCardLength);
            System.out.println ("Credit Card Validity Status: valid");
        
            }
    else    {
            System.out.println ("INVALID CREDIT CARD TYPE!");    
            }
        }
    }
