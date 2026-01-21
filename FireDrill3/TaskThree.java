import java.util.Scanner;
    public class TaskThree   {
        public static void main (String[] args)     {
        
        Scanner input = new Scanner(System.in);

        int[] studentScores = new int [10];
        
        for (int count = 1; count <= studentScores; count++)    {
        System.out.println ("Enter score " + (count + 1));
        int scores = input.nextInt();
        studentScores[count] = scores;
            }
        
        for(int counter = 0; counter < studentScores; counter++)   {
            System.out.print(studentScores[count]);
            
            }

        }
    }
  
