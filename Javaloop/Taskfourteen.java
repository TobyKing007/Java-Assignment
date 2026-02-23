import java.util.Scanner;

public class Taskfourteen {

    public static void main (String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println ("Enter a word");
    String word = input.nextLine();

    for (int count = 0; count < word.length(); count ++) {
 
    System.out.print(Character.toUpperCase(word.charAt(count)));
            }
        
  
    
    }   

 }
