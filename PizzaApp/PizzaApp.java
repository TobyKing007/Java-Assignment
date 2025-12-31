import java.util.Scanner;

public class PizzaApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

String pizzaMenu = """

            IYA SCAMBIRAH PIZZA MENU

PIZZA TYPE      NUMBER OF SLICES        PRICE PER BOX

SAPA SIZE               4                   2000

SMALL MONEY             6                   2400

BIG BOYS                8                   3000

ODOGWU                  12                  4200

    """;
        System.out.println(pizzaMenu);

        System.out.print("Enter Pizza type: ");
        String pizzaType = input.nextLine().toLowerCase();

        int pizzaSlices = 0;
        int pricePerBox = 0;

    if (pizzaType.equals ("sapa size"))    {
        pizzaSlices = 4;
        pricePerBox = 2000;
    }

    else if (pizzaType.equals ("small money"))    {
             pizzaSlices = 6;
             pricePerBox = 2400;
    }

    else if (pizzaType.equals ("big boys"))    {
             pizzaSlices = 8;
             pricePerBox = 3000;
    }
    else if (pizzaType.equals ("odogwu"))    {
             pizzaSlices = 12;
             pricePerBox = 4200;
    }
    else    {
        System.out.println(pizzaType + " IS NOT AVAILABLE!");
        return;
    }

    System.out.print("Enter number of guest: ");
    int guests = input.nextInt();

    int numberOfBoxes = (int) Math.ceil((double) guests / pizzaSlices);
    int leftoverSlices = numberOfBoxes * pizzaSlices - guests;
    int totalPrice = numberOfBoxes * pricePerBox;

    System.out.println ("NUmber of boxes to buy: " + numberOfBoxes);
    System.out.println ("Leftover slices: " + leftoverSlices);
    System.out.println ("Total price: " + totalPrice);

        }
    }
