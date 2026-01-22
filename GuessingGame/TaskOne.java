import java.util.Scanner;

import java.util.Random;

    public class TaskOne   {
    
        public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        
        Random randomNumbers = new Random();

        int randomValue = 1 + randomNumbers.nextInt(10);

        System.out.println(randomValue);

        }
    }

