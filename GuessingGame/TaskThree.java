import java.util.Scanner;

import java.util.Random;

    public class TaskThree   {
    
        public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        
        Random randomNumbers = new Random();

       System.out.println ("Enter a number between 1-20");
       int number = input.nextInt();

       int randomValue = 1 + randomNumbers.nextInt(20);

        System.out.println(randomValue);
        if (number > randomValue)   {
           
           System.out.println("Too high!");
            }

        else    {
            System.out.println("Too low!");
            }
        }
    }
