import java.util.Scanner;
    public class TaskTwo   {
        public static void main (String[] args)     {
        
        Scanner input = new Scanner(System.in);

        int[] studentScores = new int [10];
        
        for (int count = 0; count < 10; count++)    {
        System.out.println ("Enter score " + (count + 1));
        int scores = input.nextInt();
        studentScores[count] = scores;
            }
        
        for(int counter = 0; counter < studentScores.length; counter++)   {
            System.out.println (studentScores[counter]);
            
            }

        }
    }
  
