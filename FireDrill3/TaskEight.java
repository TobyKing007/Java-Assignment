import java.util.Scanner;
    public class TaskEight {
        public static void main (String[] args)     {
        
        Scanner input = new Scanner(System.in);

        int[] scores = new int [10];
        
        
        int largest = 0;
        for (int count = 0; count < 10; count++ )   {
            if (count % 2 == 0)  {
               count > largest;
                
                }
            else    {
                largest = count;
                }
            }
            System.out.println("The largest number is: " + largest);
          }  
        }
      
