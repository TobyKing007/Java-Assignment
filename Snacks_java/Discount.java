import java.util.Scanner;
public class Discount   {

    public static void main (String[] args){
    Scanner input = new Scanner(System.in);

        System.out.println ("Enter name of item");
        String itemName = input.nextLine();

        System.out.println ("Enter promo code");
        String promoCode = input.nextLine();

        System.out.println ("Enter original price");
        int originalPrice = input.nextInt();

        if (promoCode.equalsIgnoreCase("SAVE10"))    {
            System.out.println (originalPrice * 0.1);
        }
        else if (promoCode.equalsIgnoreCase("HALFOFF"))  {
            System.out.println (originalPrice * 0.5);
        }
        else    {
            System.out.println(originalPrice);
        }

        }
    }
