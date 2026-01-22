import java.util.Scanner;

import java.util.Random;

    public class TaskFour   {
    
        public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        
        Random randomNumbers = new Random();

        int randomValue = 1 + randomNumbers.nextInt(20);
  
        int guesses = 0;

        int amountOfGuess = 0;

       while (true) {
       System.out.println ("Enter a number between 1-20");
       int number = input.nextInt();

       
        if (number == randomValue)   {
           
           System.out.println("You are correct!");
           break;
            }
  
        else    {
            System.out.println("Wrong guess. Try again!");
                }
            }
           }   
        }

    
