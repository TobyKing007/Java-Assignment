import java.util.Scanner;
    public class TaskOne    {
        public static void main (String[] args)     {
        
        Scanner input = new Scanner(System.in);

        int[] studentScores = new int [11];
        
        for (int count = 0; count < 10; count++)    {
        System.out.println ("Enter score " + (count + 1));
        int scores = input.nextInt();
        studentScores[count] = scores;
            }
        
        for(int counter = 1; counter < studentScores.length; counter++)   {
            System.out.println (studentScores[counter]);
            
            }

        }
    }
  
