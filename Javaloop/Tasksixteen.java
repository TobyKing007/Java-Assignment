public class Tasksixteen {

    public static void main (String[] args) {

    String letter = "multiplication";
    int counter = 0;

    for (int count = 0; count < letter.length(); count ++) {
        char vowel = (Character.toLowerCase(letter.charAt(count)));

    if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u')    {
        counter++;
 
   
            }
        
        }
     System.out.println("Total vowels is " + counter);
    }   

 }
