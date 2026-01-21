import java.util.Scanner;
    public class TaskSix {
        public static void main (String[] args)     {
        
        Scanner input = new Scanner(System.in);

        int[] scores = new int [10];
        
        
        int sum = 0;
        for (int count = 0; count < 10; count++ )   {
            if (count % 2 == 0)  {
                sum += count;
                }
            }
        System.out.println (sum);
          }  
        }
      
